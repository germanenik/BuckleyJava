/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW12_05;

/**
 *
 * @author gerashabanets
 */
public class Randomness {
    public static void main(String[] args){
    }
    /**
     * 
     * @param min
     * @param max
     * @return 
     */
    public static int randomize(int min, int max){
        return (int)(Math.random() * (max - min + 1) + min);
    }
    /**
     * This class returns a random integer
     * @param max
     * @return 
     */
    public static int randomize(int max){
        return (int)(Math.random() * (max + 1) );
    }
    /**
     * 
     * @param min
     * @param max
     * @return 
     */
    public static double randomize(double min, double max){
        return Math.random() * (max - min) + min;
    }
    /**
     * 
     * @param max
     * @return 
     */
    public static double randomize(double max){
        return Math.random() * (max);
    }   
}
