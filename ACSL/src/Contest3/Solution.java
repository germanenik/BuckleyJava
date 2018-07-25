/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest3;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String s = input.nextLine();
        int K = input.nextInt();
        
        System.out.println(Answer(N, s, K));
    }
    
    public static String Answer(int N, String s, int K){
        String newS = "";
        String s1 = s.toLowerCase();
        int counter = 0;
        
        while (N > 0){
            char part = (char)( (s1.charAt(counter) + K - 'a') % ('z'-'a' + 1) + 'a' );
            newS += part;
            
            N--;
            counter++;
        }
        
        String finalS = "";
        
        for(int i = 0; i < s.length(); i++){
            if( Character.isUpperCase(s.charAt(i)) )
            {
                finalS += newS.substring(i, i+1).toUpperCase();
            }
            else finalS += newS.substring(i, i+1);
        }
        
        return finalS;
    }
}
