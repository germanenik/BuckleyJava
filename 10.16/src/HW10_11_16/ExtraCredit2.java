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
public class ExtraCredit2 {
    public static void main(String[] args){
        for(int a = 0; a <= 6; a++){
            for(int c = 6; c >= a; c--){
                System.out.print("    ");
            }
            for(int b = 0; b <= a; b++){
                int value = (int)Math.pow(2,b);
                
                if(value <= 9)
                System.out.print(value + "   ");
                else
                System.out.print(value + "  ");               
            }    
            for(int d = a - 1; d >= 0; d-- ){
                int value1 = (int)Math.pow(2,d);
                
                if(value1 <= 9)
                System.out.print(value1 + "   ");
                else
                System.out.print(value1 + "  "); 
            }
           
        
            System.out.println();
        }
    }
}
