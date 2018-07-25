package HW10_31_16;
import java.util.Scanner;
/**
 *
 * @author gerashabanets
 */
public class TriangularNumbers {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("n = ");
      int n = input.nextInt();

      while(n >= 0){
          
          System.out.print("array: [");
          
          int[] arr = new int[n + 1];
          
          for(int i = 1; i <= n; i++){
              arr[i] = arr[i-1] + i;
              System.out.print(arr[i]);
              if(i < n) System.out.print(", ");
          }
          
          System.out.print("]\nn = ");
          n = input.nextInt();
      }
      
      System.out.println("Good bye");
        
    }
}
