package HW10_24_16;

import java.util.Scanner;

/**
 *
 * @author gerashabanets
 */
public class ExtraCredit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("(To exit enter a negative number)");
        int num = 1;
        String answer = "";
        
        while(num > 0){
                    
           System.out.print("Enter a number in decimal to convert: ");
           int dec = input.nextInt();
           
           if(dec < 0){
               System.out.println("Good bye");
           }else{   
           
           System.out.print("\nEnter a base (2-36): ");
           int base = input.nextInt();
           
           for(int i = dec; i > 0; i /= base){
               
               if(i % base > 9){
                   char[] special = new char[26];
                   for(int a = 0; a < special.length; a++){
                       special[a] =(char)('A' + a );
                   }
//                   i % base = a;
                 answer = special[i % base - 10] + "" + answer;  
               }
               else
               answer = (i % base) + "" + answer;
           
           }
           
         System.out.println(answer);
         //reset
         answer = "";
         num = dec;  
        }
      } 
    }
}
