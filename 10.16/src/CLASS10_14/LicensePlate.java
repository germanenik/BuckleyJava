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
public class LicensePlate {
    public static void main(String[] args){
        char l1 = (char)(Math.random() * 26 + 'A');
        char l2 = (char)(Math.random() * 26 + 'A');
        char l3 = (char)(Math.random() * 26 + 'A');
        
        int n1 = (int)(Math.random() * 10);
        int n2 = (int)(Math.random() * 10);
        int n3 = (int)(Math.random() * 10);
        int n4 = (int)(Math.random() * 10);
        System.out.println(l1 + "" + l2 + l3 + n1 + n2 + n3 + n4);
    }
}
