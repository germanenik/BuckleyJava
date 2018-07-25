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
public class Complex {
    private double realPart;
    private double imaginaryPart;
    
    public Complex(){
        this(0,0);
    }
    
    public Complex(int a){
        this(a,0);
    }
    
    public Complex(double a, double b){
        realPart = a;
        imaginaryPart = b;
    }
    
    public double getRealPart(){
        return this.realPart;
    }
    
    public double getImaginaryPart(){
        return this.imaginaryPart;
    }
    
    public double abs(){
        double a = getRealPart();
        double b = getImaginaryPart();
        
        return Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2) );
    }
    
    public Complex add(Complex other){
        return new Complex(this.realPart + other.getRealPart(), 
                this.imaginaryPart + other.getImaginaryPart());
    }
    
    public Complex subtract(Complex other){
        return new Complex(this.realPart - other.getRealPart(), 
                this.imaginaryPart - other.getImaginaryPart());
    }
    
    public Complex multiply(Complex other){
        double a = this.realPart;
        double b = this.imaginaryPart;
        double c = other.getRealPart();
        double d = other.getImaginaryPart();
        
        return new Complex(a * c - b * d, b * c + a * d);
    }
    
    public Complex divide(Complex other){
        double a = this.realPart;
        double b = this.imaginaryPart;
        double c = other.getRealPart();
        double d = other.getImaginaryPart();
        
        return new Complex((a*c + b*d) / (c*c + d*d), (b*c - a*d) / (c*c + d*d));
    }
    
    @Override
    public String toString(){
        return "(" + this.realPart + " + " + this.imaginaryPart + "i)";
    }
    
    @Override
    public boolean equals(Object other){
        if(other instanceof Complex){
            return this.realPart == ((Complex)other).getRealPart()
                 && this.imaginaryPart == ((Complex)other).getImaginaryPart();
        }
        
        return false;
    }
}
