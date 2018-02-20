/**
* German Shabanets
* The Buckley School 
* ACSL #1 - Senior Division
 */

package acsl18_1;

import java.util.*;
import java.util.ArrayList;

public class NinetyNine {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Initial cards: ");
        String initial = input.nextLine();
        
        for(int i = 1; i <= 5; i++){
        System.out.print("Pile #" + i + ": ");
        String second = input.nextLine();
        int pointtotal;
        
        //convert
        ArrayList<Integer> player1 = toArray(initial.substring(0, initial.length()/2));
        ArrayList<Integer> player2 = toArray(initial.substring(initial.length()/2));
        ArrayList<Integer> pile;
        
        if(second.charAt(1) == ' ' || second.charAt(1) == ','){
        pointtotal = Integer.parseInt(second.substring(0,1));
        pile = toArray(second.substring(1));
        }else{
        pointtotal = Integer.parseInt(second.substring(0,2));
        pile = toArray(second.substring(2));    
        }
        
        boolean firstturn = true;
             
        while(pointtotal <= 99){
            
          if(firstturn){
            pointtotal = play(player1, pointtotal, pile);  
          }else{
            pointtotal = play(player2, pointtotal, pile);  
          }
          
          firstturn = !firstturn;
        }
        
        System.out.print("Output #" + i + ": ");
        System.out.print(pointtotal + ", ");
        if(firstturn) System.out.println("Player #1");
        else System.out.println("Player #2");
        
        }

    }
    
    public static int play(ArrayList<Integer> player, int pointtotal, 
            ArrayList<Integer> pile){
        
        Collections.sort(player);
        
        int total_old = pointtotal;
        
        //takes care of the nine
        if(player.get(2) == 9) pointtotal += 0;
        //takes care of the ten
        else if(player.get(2) == 10) pointtotal -= 10;
        //takes care of the seven
        else if(player.get(2) == 7 && pointtotal >= 93) pointtotal += 1;
        //general
        else pointtotal += player.get(2); 
        
        if(!(pile.isEmpty())) player.set(2, pile.remove(0));
        //borders
        for(int i = 34; i <= 78; i+= 22){
            pointtotal = borders(i, total_old, pointtotal);
        }
        
        return pointtotal;
    }
    
    public static int borders(int n, int total_old, int pointtotal){
        if( (total_old < n && pointtotal >= n) || (pointtotal < n && total_old >= n)) 
        pointtotal += 5;
        
        return pointtotal;
    }
    
    public static ArrayList<Integer> toArray(String s){
        ArrayList<Integer> alist = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(!(s.charAt(i) == ' ' || s.charAt(i) == ',')){
                if(s.charAt(i) == 'T') alist.add(10);
                else if(s.charAt(i) == 'J') alist.add(11);
                else if(s.charAt(i) == 'Q') alist.add(12);
                else if(s.charAt(i) == 'K') alist.add(13);
                else if(s.charAt(i) == 'A') alist.add(14);
                else alist.add(s.charAt(i) - '0');
            }
        }
        return alist;
    }
}
