/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW11_14_16;
import java.util.*;
/**
 *
 * @author gerashabanets
 */
public class ArrayMerge {
 
public static void main(String[] args) {
   int[] x;
   int[] a = makeArr();
   int[] b = makeArr();
   if (isValid(a) && isValid(b)) {
      int[] mergedArr = mergeArr(a, b);
      System.out.println("First Array: ");
      printArr(a);
      System.out.println("\nSecond Array: ");
      printArr(b);
      System.out.println("\nMerged Array: ");
      printArr(mergedArr);
   } else 
      System.out.println("ERROR; array not in correct order");
}
 
public static int[] makeArr() {
   Scanner input = new Scanner(System.in);
   
   int[] array = new int[50];
   for(int i = 0; i < array.length; i++){
       int a = input.nextInt();
       
       if(a > 0) array[i] = a;
       else break;
       
   }
   
   return array;
}
 
public static boolean isValid(int[] a) {
    boolean condition = false;
    for(int i = 0; a[i + 1] > 0; i++){
       
       if(a[i] > a[i+1]){ 
           condition = false;
           break;
       } else{
           condition = true;
       } 
    }
    return condition;
}
 
public static void printArr(int[] a) {
   for(int i: a){
       if(i != 0)
       System.out.print(i + " ");
   }
}
 
public static int[] mergeArr(int[] a, int[] b) {
   int[] x = new int[a.length + b.length];
   int ia = 0;
   int ib = 0;
   int ix = 0;
   
   while(ia < a.length && ib < b.length){
       if(a[ia] < b[ib]){
           x[ix++] = a[ia++];
       }else{
           x[ix++] = a[ia++];
       }
   }
   
   while(ia < a.length){
       x[ix++] = a[ia++];
   }
   
   while(ib < b.length){
       x[ix++] = b[ib++];
   }
   
   return x;
   
}
}

