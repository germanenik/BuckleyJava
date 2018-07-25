/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class04_17;
import java.util.ArrayList;
/**
 *
 * @author gerashabanets
 */
public class TestPractice {
//    Integer, String are immutable — can't change them with for each loop
    public static void main(String[] args){
    Mutable[] aa = {new Mutable(), new Mutable() };
    
    for(Mutable i: aa){
        i.i = 7;
    } //changes i to 7 
    
    int a = 'B' - 'A';
    System.out.println(a);
    
    ArrayList<Object> arr = new ArrayList<>();
    arr.add(null);
    arr.add(null);
    arr.remove(0);
    arr.remove(0);
    
    System.out.println(arr + " " + arr.isEmpty());
}
}

class Mutable{
    int i = 3;
}
