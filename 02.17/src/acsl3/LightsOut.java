/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acsl3;
import java.util.*;
/**
 *
 * @author gerashabanets
 */
public class LightsOut {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String tile = "";
        int tileR = 0;
        int tileC = 0;
        
        String config1 = noSpaces(input.nextLine());
        String config2 = noSpaces(input.nextLine());
        
        boolean[][] arrI = convertToArray(config1); //initial
        boolean[][] arrF = convertToArray(config2); //final
        int[][] data = new int[2][8]; // data table! row 0 - rows, row 1 - columns
       //every columns corresponds to a number of a row/column of the board
       //which changed
       
        for(int row = 0; row < 8; row++){
            for(int column = 0; column < 8; column++){
                if( arrI[row][column] != arrF[row][column]){
                    data[0][row]++;
                    data[1][column]++;
                }
            }
        }
        
        //looping through the data table
            for(int column = 1; column < 8; column++){
                if(data[0][column - 1] < data[0][column]){
                    tileR = column;
                }
                
                if(data[1][column - 1] < data[1][column]){
                    tileC = column;
                }
            }
            
            tile = "" + (++tileR) + (++tileC);
            System.out.println(tile);

    }
    
    public static boolean[][] convertToArray(String s){
        boolean[][] bArray = new boolean[8][8];
        
        for(int row = 0; row < bArray.length; row++){
            for(int column = 0; column < bArray[row].length / 2; column++){
                bArray[row][column] = 
                        toBoolean(s.substring(2 * row, 2 * row + 1))[column];
            }
            
            for(int column = bArray[row].length / 2; column < bArray[row].length; column++){
                bArray[row][column] = 
                        toBoolean(s.substring(2 * row + 1, 2 * row + 2))[column % 4];
            }
        }
        
        return bArray;
    }
    
    public static boolean[] toBoolean(String s){
        if(s.equals("0")) return new boolean[] {false, false, false, false}; //0
        if(s.equals("1")) return new boolean[] {false, false, false, true}; //1
        if(s.equals("2")) return new boolean[] {false, false, true, false}; //2
        if(s.equals("3")) return new boolean[] {false, false, true, true}; //3
        if(s.equals("4")) return new boolean[] {false, true, false, false}; //4
        if(s.equals("5")) return new boolean[] {false, true, false, true}; //5
        if(s.equals("6")) return new boolean[] {false, true, true, false}; //6
        if(s.equals("7")) return new boolean[] {false, true, true, true}; //7
        if(s.equals("8")) return new boolean[] {true, false, false, false}; //8
        if(s.equals("9")) return new boolean[] {true, false, false, true}; //9
        if(s.equals("A")) return new boolean[] {true, false, true, false}; //10
        if(s.equals("B")) return new boolean[] {true, false, true, true}; //11
        if(s.equals("C")) return new boolean[] {true, true, false, false}; //12
        if(s.equals("D")) return new boolean[] {true, true, false, true}; //13
        if(s.equals("E")) return new boolean[] {true, true, true, false}; //14
        else return new boolean[] {true, true, true, true}; //15
    }
    
    public static String noSpaces(String s){
        String newS = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' ') newS += s.charAt(i);
        }
        
        return newS;
    }

    
}
