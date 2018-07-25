/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class02_14;

/**
 *
 * @author gerashabanets
 */
public class Notes {
   public static void main(String[] args){
       int a = 4, b = 9;
       Integer a1 = 4, b1 = 9; //wrapper classes are immutable
       //Strings are also IMMUTABLE
       int[] arr = {4,9};
       swap(a1,b1);
       System.out.println(a1 + " " + b1);
   }
   
   static void swap(int a, int b){
       int temp = a;
       a = b;
       b = temp;    
   }
  
   
   static void swapInt(Integer a, Integer b){
       Integer temp = a; //actually means new Integer(a);
       a = b;
       b = temp;    
   }
   
   static void swapArr(int[] arr){
           
   }
}
