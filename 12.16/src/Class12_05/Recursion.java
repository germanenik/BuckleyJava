/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class12_05;

/**
 *
 * @author gerashabanets
 */
public class Recursion {
    public static void main(String[] args){
        String s = "noon";
        System.out.println(isPalindrome(s, 0, s.length() - 1));
//        Notes
//        A method that calls itself. It must stop at a certain point - base case
//        To stop - use if else statements
//        >= 1 base cases
//        
    }
//    Factorial:
//    Example of Direct Recursion
//    Can also be Indirect Recursion - method A calls method B 
    public static long factorial(int n){
              if(n == 0) return 1; //Base case - stopping condition
              return n * factorial(n-1);
          }
//    Fibonacci series - each term is the sum of the subesquent two
    public static long fib( long index){
        if(index < 2) return index;
        return fib(index - 1) + fib(index - 2);
    }
    public static boolean isPalindrome(String s){
        if(s.length() <= 1) return true;
        if(s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return isPalindrome(s.substring(1, s.length() - 1) );
    }
//    Sum series
    public static double SumSeries(int i){
        if(i == 1) return 1;
        return 1./i + SumSeries(i - 1);
    }
//    Creative Problem - clarify!!!
    public static int Steps(int n){
        if(n <= 2) return n;
        return Steps(n - 1) + Steps(n - 2);
    }
//    Recursive problems sometimes have helper methods
    public static boolean isPalindrome(String s, int high, int low){
        if(high <= low) return true;
        if(s.charAt(low) != s.charAt(high)) return false;
        return isPalindrome(s, low + 1, high - 1);
    }
//    Hanoi Tower
    
    
//    Tail Recursions - reduces stack size
//    tail method - no pending operations and the method is at the end
    
}
