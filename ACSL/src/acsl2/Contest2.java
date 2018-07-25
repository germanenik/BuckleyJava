/*
 * German Shabanets
 * The Buckley School
 * Senior-5
 */
package acsl2;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author gerashabanets
 */
public class Contest2 {
   
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int countInput = 1;
      
      while(countInput <= 5){
      System.out.print(countInput + ".INPUT:");
      
      String s1 = input.next();
      
      System.out.print("OUTPUT: ");
      boolean prevDirection = true;
      
      
      ArrayList<Integer> list = toArrayList(s1); 

      int prevNum = list.get(0);
      list.remove(0);
      System.out.print(prevNum + " ");
      
      while(!list.isEmpty()){
          
          int num;
          if(prevDirection){
             num = list.get(list.size() - 1);
             list.remove(list.size() - 1);
                  
             while(num <= prevNum){
             if(list.isEmpty()) break;   
                 
             num = 10 * num + list.get(list.size() - 1);
             list.remove(list.size() - 1);
             
             }

            
             
          }else{
              num = list.get(0);
              list.remove(0);
              
              while(num <= prevNum){
                  if(list.isEmpty()) break;
                  num = 10 * num + list.get(0);
                  list.remove(0);

                  }
          }
          
          if(num <= prevNum) break;
          
          //reset
          System.out.print(num + " ");
          prevNum = num;
          prevDirection = !prevDirection;
      }
      System.out.println("\n");
      countInput++;
   }
   }
   
   
    public static ArrayList<Integer> toArrayList(String s){
    ArrayList<Integer> list = new ArrayList<>();
    
    for(int i = 0; i < s.length(); i++){
        list.add( (s.charAt(i) - '0') );
    }
    return list;
   }
}
