package Create;
import java.util.Scanner;
import java.util.Locale;

public class Project {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("(To exit enter a negative number)");
        double num = 1;
        String answer1 = "";
        String answer2 = "";
        
        while(num >= 0){
                    
           System.out.print("Enter a number in decimal to convert: ");
           double dec = input.nextDouble();
           
           if(dec < 0){
               System.out.println("Good bye");
               break;
           }else{   
           System.out.print("Enter a base (2-36): ");
           int base = input.nextInt();
           
           //array of characters
           char[] special = new char[26];        
           for(int a = 0; a < special.length; a++){
                special[a] =(char)('A' + a );
           }
           
           //body
           for(int i = (int)dec; i > 0; i /= base){
               
               if(i % base > 9){   
               answer1 = special[i % base - 10] + "" + answer1;  
               }
               else
               answer1 = (i % base) + "" + answer1;
           }
            
           //mantissa
           double man = Mantissa(dec);
           
           while(man != 0){
               int digit = (int)(man * base);
               if(digit > 9){   
               answer2 += special[digit - 10];  
               }else{
               answer2 += digit;
               }
               
               man = Mantissa(man * base);
               if(answer2.length() > 10) {
                   System.out.print("(!) ");
                   break;
               }
           }
           
         System.out.print(answer1);
         if(answer1.isEmpty()) System.out.print("0");
         if(!(answer2.isEmpty())) System.out.print("." + answer2);
         System.out.println("\n");
         
         //reset
         answer1 = "";
         answer2 = "";
         num = dec;  
        }
      }
        
        
    }

    public static double Mantissa(double dec){
        String s = Double.toString(dec);
        int index = s.indexOf('.');
        if(index != -1){
            return Double.parseDouble("0" + s.substring(index));
        }else return 0;
    }
}
