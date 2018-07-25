/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW11_18_16;

/**
 *
 * @author gerashabanets
 */
public class SumOfDigits {
    public static void main(String[] args){
        
        System.out.println( sumDigits(111111056) );
        
    }
    
    public static int sumDigits(long n){
        int sum = 0;
        for(long i = n; i > 0; i /= 10){
            sum += i % 10;
        }
        
        return sum;
        
    }
}
