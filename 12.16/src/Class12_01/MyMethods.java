/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class12_01;

/**
 *
 * @author gerashabanets
 */
public class MyMethods {
    public static void main(String[] args)
    {
       System.out.println(m1(4, 5) + " " + m1(4.0, 5.0) + " " + m1(1.0, 1.0, 1.0));
    }
    
    private static int m1(int x, int y){
        return x;
    }
    
    private static double m1(double x, double y){
       return (x+y);
    }
    
    private static double m1(double x, double y, double z){
       return (x+y+z);
    }
}
