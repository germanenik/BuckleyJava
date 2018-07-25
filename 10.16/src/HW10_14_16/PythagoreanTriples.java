/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW10_14_16;

/**
 *
 * @author gerashabanets
 */
public class PythagoreanTriples {
    public static void main(String[] args){
        int triple = 0;
        /* int a = 0;
        int b = 0;
        int c = 0;*/
        
        
        for(int a =1; a < 100; a++){
            for(int b = 1; b < 100; b++){
                for(int c = 1; c < 100; c++){
                   if( Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2) ){
                       for(int i = 2; i < 20; i++){
                           if( a % i != 0 && b % i != 0 && c % i != 0){
                             System.out.println(a + "-" + b + "-" + c); 
                             break;
                           }
                       }
                       
                       
                   }  
                }
            }
        }
        
    }
}
