/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class01_04;
import java.util.ArrayList;
/**
 *
 * @author gerashabanets
 */
public class ArrayListNotes {
    public static void main(String[] args){
        ArrayList <String> list = new ArrayList< >(/*size*/);
//        Doesn't have a size
        list.add("LA"); //makes the size 1
        list.add(0, "Moscow"); //LA will move and Moscow will be at 0
        System.out.println(list.indexOf("LA"));
//        ArrayLost can only store objects
//        For evey primitive data type, there is an object type
//        Can also iterrate thru an arraylist
        for(String i: list){
            System.out.print(i + " ");
        }//for each loop for arraylist
        
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i) + " ");
        }//usual loop
        

        ArrayList<Integer> list1 = new ArrayList<>();
    }
}
