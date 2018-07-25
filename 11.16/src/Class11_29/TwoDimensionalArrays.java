/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class11_29;

/**
 *
 * @author gerashabanets
 */
public class TwoDimensionalArrays {
    public static void main(String[] args){
        int[][] matrix = new int[3][3]; //declering int[row][column]
        int[][] array = {
        {1,2,3},
        {1,2,3},
        {1,2,3},      
        };
        
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++ ) System.out.print(array[i][j] + " ");
            System.out.println();
        }
//        System.out.printf("%5d", j);
        
        for(int[] i: array){
            for(int j: i){
                System.out.print(j+ "\t");
            }
            System.out.println();
        }
    }
}
