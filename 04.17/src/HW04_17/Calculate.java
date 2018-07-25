/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_17;
import java.util.Scanner;
/**
 *
 * @author gerashabanets
 */

public class Calculate{
    Scanner input = new Scanner(System.in);
    Output output = new Output();
    
    public Calculate(){}

    public int get_int_val(){
        return input.nextInt();
    }
    
    public double get_double_val(){
        return input.nextDouble();   
    }
    
    public static Do_calc do_calc(){
        return new Do_calc();
    } 
      
}

class Do_calc{  
    public static double get_volume(int a){
        return Math.pow(a, 3);
    }
    
    public static double get_volume(int l, int b, int h){
        return l * b * h;
    }
    
    public static double get_volume(double r){
        return 2.0/3 * Math.PI * Math.pow(r, 3);
    }
    
    public static double get_volume(double r, double h){
        return Math.PI * Math.pow(r, 2) * h;
    }
}

class Output{ 
        void display(double volume){
        System.out.println(volume);
       } 
}




    
    

