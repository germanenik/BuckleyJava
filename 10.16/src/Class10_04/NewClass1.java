/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class10_04;

/**
 *
 * @author gerashabanets
 */
public class NewClass1 {
    public static void main(String[] args){
        
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++ ){
               System.out.print(" " + j);
            }
            
            System.out.println();
        }
    }
}
