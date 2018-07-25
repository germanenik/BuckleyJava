/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW03_06;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author gerashabanets
 */
public class InsertionTester {
    public static void main(String[] args){
        String directions = "Enter the nest name: ";
        System.out.print(directions);
        List<String> list = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        String name = titleCase(input.nextLine());
        list.add(name);
        
        System.out.print("\n" + directions);
        name = titleCase(input.nextLine());

        while(!name.equals("Stop")){
            Insert(list, name);
            System.out.print("\n" + directions);
            name = titleCase(input.nextLine());
        }
        
        System.out.println(list);
               
    }
    
    public static String titleCase(String s){
        return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }
    
    public static void Insert(List<String> list, String s){
        for(int i = list.size() - 1; i >= 0; i-- ){
            if(s.compareTo(list.get(i)) >= 0){
                list.add(i + 1, s);
                break;
            }
        }
        if(s.compareTo(list.get(0)) < 0) list.add(0, s);
    }
}
