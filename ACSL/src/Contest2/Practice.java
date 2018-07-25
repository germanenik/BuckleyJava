/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest2;

/**
 *
 * @author gerashabanets
 */
public class Practice {
//    NOT AND OR
//    XOR - only true if both parts are different 
//        - false if both are false or both are true
//    NOT 1011010 = 0100101
//    11101 AND 101 = 
//    11101
//    00101
//    result: 00101
    
//    11101 XOR 00101 = 11000
//    RSHIFT-3 101011 = 000101
//    LSHIFT
//    RCIRC-2 1101 = 0111 (comes back to the front)
//    RCIRC-4 101 = RCIRC-1 101 = 011
    
//    RSHIFT-n = equivalent to dividign by 2^n
//    LSHIFT-n = multiplying by 2^n
    
//    solving the equation
//    look at bits x = abcde
//    10110 XOR cd0ab = Cd1Ab
//    c ^ 1 = C
//    d ^ 0 = d
//    
//    result x = 00*0* - general solution
//    possible solutions - 2 times the asterisk *
//    all possible solution - 00000, 00001, 00100, 00101
    
    
//    SECOND QUESTION
//    Infix: a + b
//    Postfix: ab+  if number has many digits - put in parenthesis
//    Prefix: +ab
    
//    A - (B / (C + D)) - convert into postfix
//    A - (B/(CD+))
//    A - (BCD+/)
//    ABCD+/-
    
//    convert into prefix
//    A - (B / (+CD))
//    A - (/B+CD))
//    -A/B+CD
    
//    the other way around from postfix
//    find two elements next to each other
//    ABCD+/-
//    AB(C+D)/-
//    A(B / (C+D))-
//    A - (B/(C+D))
    
//   the other way around from prefix
//    -A/B+CD
//    -A/B(C+D)
//    -A(B / (C+D) )
//    A - B / (C+D)
    
//    LISP PROGRAMMING
//    prefix language
//    CAR - fist element on the list 
//    CDR - the rest of elements on the list
    
//    CDR'( (2 (3)) (4 (5 6) 7)  ) = (4 (5 6) 7)
    
//    (c+a)/(b-a+c)
}
