/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class10_11;

/**
 *
 * @author gerashabanets
 */
public class Prime50 {
    public static void main(String[] args){
        int count = 2;
        int primeCount = 0;
        
    while(primeCount < 51){
       boolean isPrime = true;
       
       for(int i = 2; i <= count / 2; i++){
           if(count % i == 0){
               isPrime = false;
               break;
            }        
        }
       
       if(isPrime){
           System.out.print(count + " ");
           primeCount++;
           if(primeCount % 10 == 0) System.out.println();
           
       }
       
       count++;
   }
  }
}


