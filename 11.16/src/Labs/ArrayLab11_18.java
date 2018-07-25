/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labs;
import java.util.*;
/**
 *
 * @author gerashabanets
 */
public class ArrayLab11_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");

        int count = 0;
        int position = 0;
        
        boolean distinct = true;
        
        int[] array = new int[10];
        
        do{
           int a = input.nextInt(); 
           count++;
           
           for(int i: array){
               if(i == a){
                 distinct = false;
                 break;
               }
           }

           if(distinct == true){
           array[position] = a;
           position++;
           }
            distinct = true;
            
             
            
        }while(count <= 9);
        
        int dCount = 0;
        
        for(int i: array){
            if(i != 0) dCount++;
        }
        
        System.out.println("The number of distinct numbers: " + dCount);
        System.out.print("The distinct numbers are: ");
        for(int i = 0; i < array.length; i++){
            if(array[i] != 0)
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
