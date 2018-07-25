/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW11_18_16;
import java.util.*;
/**
 *
 * @author gerashabanets
 */
public class Craps {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        craps();
    }   
//        if(s1.equals("hello")){
//        roll();
//        
//        if( roll() == 2 || roll() == 3 || roll() == 12) System.out.println(" you lose!");
//        else if( roll() == 7 || roll() == 1) System.out.println(" you win!");
//        else{
//            System.out.println(" point is " + roll() );
//            int prevSum = roll();
//            while(roll() != 7 || roll() != prevSum){
//                roll();
//                System.out.println( " nothing happened...");
//            }
//            
//            if(roll() == 7) System.out.println(" you win!");
//            else System.out.println(" you lose!");
//        } 
//        
//       
//        }
//       s1 = input.next();
//        
//    }


public static void craps() {
 
  int first = 0;
 
  // First roll
 
  first = roll();
  // check craps
  switch (first) {
  case 2:
  case 3:
  case 12:
   System.out.println("You lose");
   break;
  case 7:
  case 11:
   System.out.println("You win");
   break;
  default:
   System.out.println("The point is " + first);
   // next roll
   int next;
   do {
    next = roll();
 
   } while (!(next == first || next == 7));
 
   if (next == 7) {
    System.out.println("You lose");
   } else {
    System.out.println("You win");
   }
 
  }
 
 }
    
    public static int roll(){
        int die1 = (int)(Math.random() * 6 + 1);
        int die2 = (int)(Math.random() * 6 + 1);
        int sum = die1 + die2;
        
        System.out.print("You rolled " + die1 + " + " + die2 );
        System.out.print(" = " + sum + " - " );
        
        return sum;
    }
    
 
}
