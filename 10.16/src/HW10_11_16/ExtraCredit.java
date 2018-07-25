/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW10_11_16;

/**
 *
 * @author gerashabanets
 */
public class ExtraCredit {
    public static void main(String[] args){
    
      for(int a = 0; a <= 6; a++){
          for(int b = 6; b >= a; b-- ){
            System.out.print("    ");
          }
          for(int c = 0; c <= 2 * a; c++){
              //so I decided to implement math into this
              //it finally worked but I guess the programming way is easier
              int d = -1 * (Math.abs(c - a)) + a;
              int value = (int)Math.pow(2, d);
              
              if(value <= 9)
                System.out.print(value + "   ");
              else
                System.out.print(value + "  ");
          }    
          
         System.out.println();    
      }
    }
}
