/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW02_14;

/**
 *
 * @author gerashabanets
 */
public class ComplexTester {
    public static void main(String[] args){
         Complex x1 = new Complex(3.5, 5.5);
            Complex x2 = new Complex(-3.5, 1);
            System.out.println(x1 + "+" + x2 + "=" + x1.add(x2));
            System.out.println(x1 + "-" + x2 + "=" + x1.subtract(x2));
            System.out.println(x1 + "*" + x2 + "=" + x1.multiply(x2));
            System.out.println(x1 + "/" + x2 + "=" + x1.divide(x2));
            System.out.println("|" + x1 + "| = " + x1.abs());
            System.out.println(x1.equals(new Complex(3.5, 5.5)));
    }
}
