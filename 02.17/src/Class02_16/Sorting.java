/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class02_16;
import java.util.ArrayList;
/**
 *
 * @author gerashabanets
 */
public class Sorting {
    
    public static void main(String[] args){
        int[] a = {3, 8, -9, 83, 4, 1};
        
//        //Bubble sort
//        boolean swapNeeded = true;
//        for(int k = 0; k < a.length; k++){
//            swapNeeded = false;
//            for(int i = 0; i < a.length - k - 1; i++){ // so doesn't go the end
//                if(a[i] > a[i+1]){                     // all the time
//                    swapNeeded = true;
//                    swap(a, i, i + 1);
//                }
//            }
//        }
        
//        //Selection sort
//        for(int i = 0; i < a.length; i++){
//            int minIndex = i;
//            for(int j = i + 1; j < a.length; j++){
//                if(a[minIndex] > a[j]){
//                    minIndex = j;
//                }
//            }
//            if(minIndex != i){
//                swap(a, minIndex, i);
//            }
//        }
        
        //Insertion Sort
        for(int i = 1; i < a.length; i++){
            int temp = a[i];
            int j = i - 1;
            while(j >= 0 && a[j] > temp){
                a[j + 1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
        
        
        //Linear Search - just going from the beginning to the end
        
        for(int i: a){
            System.out.print(i + " ");
        }
        
        Integer b = new Integer(5);
        Integer c = new Integer(5);
        
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        System.out.println(array.remove(new Integer(0)));
        
        
//        int ab = Integer.parseInt("11", 2);
//        Integer prac = Integer.valueOf("13");
//        System.out.println(b.equals(c));
    }
    
    
    
    public static void swap(int[] a, int i, int j){
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
    }

 
}
