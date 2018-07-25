package Class10_26;
import java.util.Scanner;
/**
 *
 * @author gerashabanets
 */
public class Task1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integers between 1 and 100: ");
        int[] array = new int[101];
        int i = input.nextInt();
        
        while(i > 0){
        array[i]++;
        i = input.nextInt();
        
        }
       //printing
       
       for(int a = 1; a < array.length; a++){
           if(array[a] == 1){
               System.out.println(a + " occurs " + 1 + " time" );
           }else if(array[a] > 1){
               System.out.println(a + " occurs " + array[a] + " times" );
           }
       }
        
    }
}
