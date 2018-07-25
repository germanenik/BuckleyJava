/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class10_04;
import java.util.Scanner;
/**
 *
 * @author gerashabanets
 */
public class QuizPractice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input three integers: ");
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        String s = " is the smallest";
        
        if( !(a >= b || c >= b) ){
            System.out.println(a + s);
        }else if( b < a && b < c){
            System.out.println(b + s);
        }else if( c < a && c < b){
            System.out.println(c + s);
        }else if( a == b && a < c){
            System.out.println(a + s);
        }else if( a == c && a < b ){
            System.out.println(a + s);
        }else if( b == c && b < a){
            System.out.println(b + s);
        }else{
            System.out.println(a + s);
        }
        
        
    }
}
