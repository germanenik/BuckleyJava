/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.pkg16;

/**
 *
 * @author gerashabanets
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int[][] grid = {
//            {0,4,1,8,6,1},
//            {4,7,7,0,7,1},
//            {0,8,8,5,3,1},
//            {4,0,3,4,4,7},
//            {6,1,7,5,6,0}
//        };
//        int count = 0;
//        for(int[] i: grid){
//            for(int j: i){
//                if(j == 1) count++;
//            }
//        }
//        
//        System.out.println(count);

     
     int[][] matrix = {{11,22,33},{44,55,66},{77,88,99}};
     
     for(int row = 1; row < 3; row++)
         for(int col = 0; col < 3; col++)
             matrix[row][col] = matrix[row-1][col];
    
    for(int[] i : matrix){
       for(int j: i) System.out.print(j + " ");
       System.out.println();
    }
   } 
}
