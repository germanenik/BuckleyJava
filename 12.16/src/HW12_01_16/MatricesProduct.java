/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW12_01_16;
import java.util.*;
/**
 *
 * @author gerashabanets
 */
public class MatricesProduct {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter matrix1 (3X3): ");
        int[][] matrix1 = new int[3][3];
        int count = 0;
//creating matrix1          
            for(int row = 0; row < matrix1.length; row++){
                for(int column = 0; column < matrix1[row].length; column++){
                    int m1 = input.nextInt();
                    matrix1[row][column] = m1;
                }
            }
        
        System.out.print("\nEnter matrix2 (3X4): ");
        
        int[][] matrix2 = new int[3][4];
//creating matrix2
            for(int row = 0; row < matrix2.length; row++){
                for(int column = 0; column < matrix2[row].length; column++){
                    int m2 = input.nextInt();
                    matrix2[row][column] = m2;
                }
            }
//Displaying the result
            System.out.println("\nThe matrices are multiplied as follows: \n");
            for(int[] i: matrix1){
                for(int j: i) System.out.print(j + "\t");
                System.out.println();
            }
            System.out.println("\nX\n");
            for(int[] i: matrix2){
                for(int j: i) System.out.print(j + "\t");
                System.out.println();
            }
            System.out.println("\n=\n");
            for(int[] i: multiplyMatrix(matrix1, matrix2)){
                for(int j: i) System.out.print(j + "\t");
                System.out.println();
            }         
    }
    
    public static int[][] multiplyMatrix(int[][] a, int[][] b){
       int[][] result = new int[3][4];
       
       for(int rowR = 0; rowR < result.length; rowR++){
           for(int columnR = 0; columnR < result[rowR].length; columnR++ ){
               int number = 0;
               
               for(int j = 0; j < 3; j++){
               number += a[rowR][j] * b[j][columnR];
               }
               
               result[rowR][columnR] = number;    
           }
       }
        
        return result;
    }
}
