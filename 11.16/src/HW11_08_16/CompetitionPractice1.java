/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW11_08_16;

import java.util.Scanner;
/**
 *
 * @author gerashabanets
 */
public class CompetitionPractice1 {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       //Enter the letters separated by spaces
       String letter = input.next();
       char sampleBefore = 'A';
       
       while( !(letter.equals("$")) ){
           
           char sample = letter.charAt(0); //converting into a character
           int sampleInt = sample - 'A' + 1;
           
           if(sample <= 'E'){  
           
           sampleInt *= 2;           
           }
           
           else if(sample <= 'J'){
           
           sampleInt %= 3;
           sampleInt *= 5;          
           }
           
           else if(sample <= 'O'){
           
           sampleInt /= 4;
           sampleInt *= 8;
           }
           
           else if(sample <= 'T'){ 
           
           sampleInt = (sampleInt / 10) + (sampleInt % 10);
           sampleInt *= 10;
           }
           
           else { 
               
            for(int i = 2; i < sampleInt / 2; i++ ){
                if(sampleInt % i == 0) sampleInt /= i;
           } 
            
            sampleInt *= 12;
               
           }
           
           //Printing
           sample = (char)(sampleBefore + sampleInt);
           
           while(sample > 'Z') sample = (char)(sample - 26);
           
           System.out.print(sample + " ");
           sampleBefore = sample;
           letter = input.next(); 
       }
   } 
}
