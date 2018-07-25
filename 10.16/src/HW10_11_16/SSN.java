/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW10_11_16;

import java.util.Scanner;
/**
 *
 * @author gerashabanets
 */
public class SSN {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your social security number: ");
        
        String s = input.nextLine();
        
        String valid = " is a valid social security number";
        String invalid = " is an invalid social security number";
        boolean isValid = true;
        
        if(s.length() != 11){
           isValid = false; 
        }else {       
            for (int i = 0; i < s.length(); i++) {
              if ((i == 3 || i == 6) && s.charAt(i) != '-') {
                isValid = false;
                break;
              }
              
              if (!Character.isDigit(s.charAt(i))) {
                isValid = false;
                break;
              }
            }
        }
        
       
       
    }
}
