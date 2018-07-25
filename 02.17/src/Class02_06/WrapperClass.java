/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class02_06;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author gerashabanets
 */
public class WrapperClass {
//    for every primitive, there's a wrapper class
    public static void main(String[] args){
        Integer x = 4;
        System.out.println( Integer.toString(20, 2) );
        System.out.println( Integer.parseInt("20", 4) );
        
        List<Integer> list = new ArrayList<>();
//        Integer - 4 bytes of memory
//        Byte  - 1 byte (8 bits)

        System.out.println(-4 % 2 == 0);
    }
}
