
package HW10_24_16;
import java.util.Scanner;
/*
 * @author gerashabanets
 */
public class BinaryConvertor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("(To exit enter a negative number)");
        int num = 0;
        
        while( !(num < 0) ){
        
        System.out.print("\nEnter a number: ");
        int n = input.nextInt();
        num = n;
        
        if(num < 0) break;
       
        String s = "";
        
        for(int i = n; i >= 1; i /= 2){
                s += (i % 2);
        }
       
        if(n == 0) s += 0;
        System.out.println(n + " in binary is " + s); 
       

       }
        System.out.println("Good bye");
 
    }
}
