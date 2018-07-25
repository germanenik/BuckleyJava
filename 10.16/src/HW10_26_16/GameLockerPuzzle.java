
package HW10_26_16;

/**
 *
 * @author gerashabanets
 */
public class GameLockerPuzzle {
    public static void main(String[] args){
        
        System.out.println("The open lockers are: ");
        
        boolean[] lockers = new boolean[100];
      
        for(int student = 1; student <= 100; student++){
          for(int i = student - 1; i < lockers.length; i += student){
            lockers[i] = !(lockers[i]);
          }
        }
        
        int num = 0;
        for(boolean j: lockers){
            num++;
            if(j){
                System.out.print("L" + num + " ");
            } 
        }
        
    }
}
