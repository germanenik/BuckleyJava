/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class10_11;
import java.util.*;
/**
 *
 * @author gerashabanets
 */
public class Prime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        
        if( a <= 1 ){
                System.out.println(a + " is not prime");
                System.exit(0);   
            }
        
        for(int i = 2; i < a; i++ ){
            if(a % i == 0){
              System.out.println(a + " is not prime"); 
            }   
        }
        
        System.out.println(a + " is prime");
        
    }
}
