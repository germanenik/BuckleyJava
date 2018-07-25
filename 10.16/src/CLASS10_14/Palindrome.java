/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASS10_14;

/**
 *
 * @author gerashabanets
 */
public class Palindrome {
    public static void main(String[] args){
        
        boolean pali = false;
        
        String word = "шалаш";
        
        for(int i = 0; i < word.length() / 2; i++ ){
            if( word.charAt(i) == word.charAt(word.length() - 1 - i) ){
                pali = true;
            }else{
                pali = false;
                break;
            }
        }
        
        System.out.println(pali);
        
    }
}

