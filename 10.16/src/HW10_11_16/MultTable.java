/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW10_11_16;

/**
 *
 * @author gerashabanets
 */
public class MultTable {
    public static void main(String[] args){
        
        //The top part
        System.out.print("   ");
        for(int a = 1; a <= 9; a++){
            System.out.print(a + "   ");
        }
        System.out.println();
        for(int a = 1; a <= 10; a++){
            System.out.print("----");
        }
        System.out.println();
        
        //The table
        
        for( int a = 1; a <= 9; a++ ){
            System.out.print(a + "| ");
            
            for(int b = 1; b <= 9; b++ ){
                
                int mult = a * b;
                
                if(mult < 10){
                System.out.print(a * b + "   "); //3 spaces
                }else{
                System.out.print(a * b + "  "); //2 spaces 
                }
            }
          System.out.println();
        }
    }
}
