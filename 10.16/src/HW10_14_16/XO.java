/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW10_14_16;
import java.util.Scanner;
/**
 *
 * @author gerashabanets
 */
public class XO {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the side length: ");
        
        int n = input.nextInt();
        
        for(int i = 0; i < n; i++ ){
            for(int j = 0; j < n; j++){
                
                if( (i + j) % 2 == 0 )
                System.out.print("X ");
                else 
                System.out.print("O ");
            }
            System.out.println();
        }        
    }
}
