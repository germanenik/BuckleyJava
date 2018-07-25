/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class02_22;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author gerashabanets
 */
public class ArrayNotes {
    public static void main(String[] args){
      List<MutableInteger> list = new ArrayList<>();  
      //will change through the for each loop
    }

}

class MutableInteger {
    private int value;
    MutableInteger(int v) {value = v;}
    void setValue(int v) {value = v;}
    int getValue(){
        return value;
    }
    
    public String toString(){
        return "" + value;
    }
}