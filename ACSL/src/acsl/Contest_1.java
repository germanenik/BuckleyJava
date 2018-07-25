
/* German Shabanets
 * The Buckley School
 * Division: Senior-5
 */
package acsl;
import java.util.*;

public class Contest_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int countInput = 1;
        System.out.print("Enter the cards value-suit, separated by a comma and");
        System.out.println(" a space.\nExample: 5D, 2D, 6H, 9D, TD, 6H\n");
        while(countInput <= 5){
            System.out.print(countInput + ". Input:  ");
            
            //Separating the input into cards
            String wholeLine = input.nextLine();
            String leadCard = wholeLine.substring(0,2);
            String myCards = wholeLine.substring(4);
            int answerRank = 0;
            int valueTemp = 'Z'; //max
            char suitTemp = 'Z'; // max
            char suit = leadCard.charAt(1);
            String answer = null;
            
            //Looping through my cards
            //#1
            for(int i = 1; i < myCards.length(); i += 4){
                
                int value = Points(myCards.charAt(i - 1));
                
                 if( myCards.charAt(i) == leadCard.charAt(1) ){ 
                   if(value > Points(leadCard.charAt(0)) && value <= valueTemp){
                      answerRank = value;
                      valueTemp = answerRank; 
                      
                   }    
                }      
            }
            //#2
            if(answerRank == 0){
               for(int i = 1; i < myCards.length(); i += 4){
               int value = Points(myCards.charAt(i - 1));
               
               if( myCards.charAt(i) == leadCard.charAt(1) ){
                   if(value <= valueTemp){
                      answerRank = value;
                      valueTemp = answerRank; 
                   }
                 }
               } 
            }

            //#3
           if(answerRank == 0){
               for(int i = 0; i < myCards.length(); i += 4){
                   int value = Points(myCards.charAt(i));
                   
                   
                   if(value <= valueTemp){
                       if(value == valueTemp){
                         if(myCards.charAt(i + 1) < suitTemp) {
                             suit = myCards.charAt(i+1);
                             suitTemp = suit;
                         }
                         else suit = suitTemp;
                       }else{
                         answerRank = value;
                         valueTemp = answerRank;
                         suitTemp = myCards.charAt(i+1);
                         suit = suitTemp;
                       }
                   }    
               }
           }
            answer = "" + Rank(answerRank) + suit; 
            System.out.println("Output: " + answer);
 
            countInput++;
            System.out.println();
        }
    }
    
     public static int Points(char a){
         int point = 0;
         
         if(a == 'A') point = 1;
         if(a >= '2' && a <= '9'){
             point = a - '0';
         }
         if(a == 'T') point = 10;
         if(a == 'J') point = 11;
         if(a == 'Q') point = 12;
         if(a == 'K') point = 13;
         
         return point;
     }
     
     public static char Rank(int a){
       char[] array = {' ','A','2','3','4','5','6','7','8','9','T','J','Q','K'};
       return array[a];  
     }
}
