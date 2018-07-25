/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formatting;

/**
 *
 * @author gerashabanets
 */
public class Format {
// %c	character
// %d	decimal (integer) number (base 10)
// %e	exponential floating-point number
// %f	floating-point number
// %i	integer (base 10)
// %o	octal number (base 8)
// %s	a string of characters
// %u	unsigned decimal (integer) number
// %x	number in hexadecimal (base 16)
// %%	print a percent sign
// \%	print a percent sign
//  link: http://alvinalexander.com/programming/printf-format-cheat-sheet   
    
public static void main(String[] args){  
    System.out.printf("%-+7dhi\n", 3);
    System.out.printf("%-8.2f\n", 233.2737838);
    System.out.printf("%25s", "German\n");
   }  
}
