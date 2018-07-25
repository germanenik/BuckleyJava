/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW10_19_16;

/**
 *
 * @author gerashabanets
 */
public class PrimeSum {
    public static void main(String[] args){
    int sum = 0;
    int num = 2;
    int countPrime = 0;
    
  while(countPrime < 10){
    boolean isPrime = true;
        
        for(int mult = 2; mult <= num / 2; mult++){
            if( num % mult == 0){ 
            isPrime = false;
            break;
            }
            
        }

        if(isPrime){
         sum += num;
         countPrime++;
        }
      num++;  
    }
    
    
    System.out.println(sum);
  }
}
