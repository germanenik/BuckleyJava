/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acsl4;
import java.util.*;
/**
 *
 * @author gerashabanets
 */
public class Skyscrapers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String data = Format(input.nextLine());
        
        //Two types of cases
        final int n4 = 4;
        final int n5 = 5;
        int size = n4;
        
        int[][] chart = FillChart(data, size);

        Pick(1, 1, chart, 1);

    }
    public static boolean Pick(int i, int j, int[][] chart, int value){
                int counter = 1;

                chart[i][j] = value;
                if(Check(i, j, chart)){
                    if(j % (chart[i].length - 2) == 0)
                        Pick(i++, 1, chart, value);
                    else
                         Pick(i, j++, chart, value);
                    counter++;
                }
                else
                    Pick(i, j, chart, value++);
                
                if(i == chart.length - 2 && j == chart.length - 2)
                    return true;
                
                return false;

    }
    
    
    public static boolean Check(int i, int j, int[][] chart){
        int last = chart.length - 1;
        for(int n = 1; n < last; n++){
            if(chart[n][j] == 0) return true;
        }
        
        return true;
    }
    
    public static String Format(String data){
        String newData = "";
        for(int i = 0; i < data.length(); i++){
            if(!(data.charAt(i) == ' ' || data.charAt(i) == ',' ))
                newData += data.charAt(i);
        }
        
        return newData;
    }
    
    public static int[][] FillChart(String data, int size){
        int[][] chart = new int[size + 2][size + 2];
        
        for(int i = 0; i < data.length(); i++){
            if( (i / size == 0) || (i / size == 3)){
            chart[i / size * (size + 1) / 3][(i % size) + 1] = 
                    Integer.valueOf(data.substring(i, i+1) );
            }
            else{
                if(size == 4){
                if(i  % 2 == 0)
                chart[(i - size % 4) / 2 - 1][0] = 
                        Integer.valueOf(data.substring(i, i+1));
                else
                chart[(i - size % 4)/ 2 - 1][size + 1] = 
                        Integer.valueOf(data.substring(i, i+1));
            }
                if(size == 5){
                 if(i  % 2 == 0)
                     chart[(i - size % 4)/ 2 - 1][size + 1] = 
                     Integer.valueOf(data.substring(i, i+1));
                
                else
                chart[(i - size % 4) / 2 - 1][0] = 
                    Integer.valueOf(data.substring(i, i+1));
                }
            }
        }
        
        return chart;
    }
}
