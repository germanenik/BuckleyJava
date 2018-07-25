/*
German Shabanets
The Buckley School
Senior Division
ACSL 3
 */
package acsl18_3;
import java.util.*;
import java.math.BigInteger;

public class Walk {
    public static void main(String[] args){
        System.out.print("1. ");
        Scanner input = new Scanner(System.in);
        String dimensions = input.nextLine();
        int[][] field = new int[8][8];
        int counter = 0;
        
        for(int i = 0; i < dimensions.length(); i += 7){
            field[counter] = Convert(dimensions.substring(i, i+6));
            counter++;
        }
        
//      input 
        int times = 0;
        while(times < 5){
        
        System.out.print("\n" + (times + 2) + ". ");
        String move = input.nextLine();
        int r = Integer.parseInt(move.substring(0, 1));
        r--;
        int c = Integer.parseInt(move.substring(2,3));
        c--;
        String dir = move.substring(4,5);
        int moves = Integer.parseInt(move.substring(6));
        
        int deg;
        
        if(dir.equals("L")) deg = 180; //L
        else if(dir.equals("R")) deg = 0; //R
        else if(dir.equals("A")) deg = 90; //A
        else deg = 270; //B
               
        int r1;
        int c1;
        counter = 0;
        

        while(counter < moves){
            r1 = r + SIN(deg - (field[r][c] * 45));
            c1 = c + COS(deg - (field[r][c] * 45));
            
            deg = deg - (field[r][c] * 45) - 180; 
            r = r1;
            c = c1;
            
            if(r < 0) r = 7;
            if(r > 7) r = 0;
            if(c < 0) c = 7;
            if(c > 7) c = 0;
            
            counter++;
            
            System.out.println("row: " + (r+1) + "; col: " + (c+1));
        }
        
        r++;
        c++;
        
        System.out.print("Output: " + r + ", " + c);
        times++;

        }
        

    }
    
    public static int[] Convert(String hex){
        int[] row = new int[8];
        hex = new BigInteger(hex, 16).toString(8);
        for(int i = 0; i < hex.length(); i++)
            row[i] = Integer.parseInt(hex.substring(i, i+1));
        
        return row;
    }
    
    public static int SIN(int deg){
        double move = Math.sin( ((double)deg) * Math.PI / 180.0 );
        
        return (int) Math.round(move);
    }
    
    public static int COS(int deg){
       double move =  Math.cos( ((double)deg) * Math.PI / 180.0 );
       
       return (int) Math.round(move);
    }    
}
