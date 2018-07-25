/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class10_20;

/**
 *
 * @author gerashabanets
 */
public class Practice {
    public static void main(String[] args){
      
       int product = 1;
       int count = 2;
       int countPrime = 0;
       
       while(countPrime < 10){
           boolean isPrime = true;
           
           for(int i = 2; i <= count / 2; i++){
               if(count % i == 0) {
                   isPrime = false;
                   break;
               }
           }
           
           if(isPrime){
               product *= count;
               countPrime++;
               System.out.println(count);
           }
           count++;
       }
      System.out.println(product);  
    }
}
