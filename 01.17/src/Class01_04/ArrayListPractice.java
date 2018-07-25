/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class01_04;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author gerashabanets
 */
public class ArrayListPractice {
    public static void main(String[] args){
//      deletes even numbers
        Integer[] arr = {3, 2, 4, 6, 9, 0 ,6};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        
        for(int i = 0; i < list.size(); i++){
            
            if(list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
        System.out.print(list);
        
//       inserts 0's 
        Integer[] arr1 = {3, 0, 4, -2, 9, 0};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr1)); 
         
        for(int i = 0; i < list1.size() - 2; i++){
            if(list1.get(i) != 0 && list1.get(i+1) != 0){
                list1.add(i + 1, 0);
                i++;
            }
        }
 
       System.out.print(list1); 
    }
}
