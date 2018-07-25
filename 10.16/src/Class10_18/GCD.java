/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class10_18;

/**
 *
 * @author gerashabanets
 */
public class GCD {
    public static void main(String[] args){
        int a = 42;
        int b = 14;
        
        int gcd = 1;
        for(int i = 1; i <= Math.min(a, b); i++){
            if( a % i == 0 && b % i == 0)
            gcd = i;
            
        }
        
        System.out.println(gcd);
    }
}
