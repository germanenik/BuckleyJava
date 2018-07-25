/*
German Shabanets
The Buckley School
Senior Division
 */
package acsl3;
import java.util.*;

public class LightsOut {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int counter = 1;
        System.out.print("Input #" + counter + ": ");
        String config1 = noSpaces(input.nextLine());
        
        while(counter < 6){
        
        String tile = "";
        int tileR = 0;
        int tileC = 0;
        
        System.out.print("Input #" + ++counter + ": ");
        String config2 = noSpaces(input.nextLine());
        
        int[][] arrI = convertToArray(config1); //initial
        int[][] arrF = convertToArray(config2); //final
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
            System.out.print("Output #" + --counter + ": ");
            System.out.println(tile);
            
            //resetting
            config1 = config2;
            counter++;
        }  
    }
    
    public static int[][] convertToArray(String s){
        int[][] bArray = new int[8][8];
        
        for(int row = 0; row < bArray.length; row++){
            for(int column = 0; column < bArray[row].length / 2; column++){
                bArray[row][column] = 
                toBinary(Integer.parseInt(s.substring(2 * row, 2 * row + 1), 16))[column];
            }
            
            for(int column = bArray[row].length / 2; column < bArray[row].length; column++){
                bArray[row][column] = 
                toBinary(Integer.parseInt(s.substring(2 * row + 1, 2 * row + 2), 16))[column % 4];
            }
        }
        
        return bArray;
    }
    
    public static int[] toBinary(int n){
        int[] array = new int[4];
        
        for(int i = array.length - 1; i >= 0; i--){
            array[i] = n % 2;
            n /= 2;
        }
        return array;
    }
    
    public static String noSpaces(String s){
        String newS = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' ') newS += s.charAt(i);
        }
        
        return newS;
    }    
}