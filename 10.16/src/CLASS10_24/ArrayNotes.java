package CLASS10_24;

/**
 *
 * @author gerashabanets
 */
public class ArrayNotes {
   public static void main(String[] args){
       //declaring an array
       int[] a;
       //reference to a future array
       //now equals to null
       a = new int[5];  // 4 * 5 = a approx. has 20 bytes 
       //inside[] is the size
       
       int[] b = new int[10];
       System.out.println(b[0]); //printing the number at index 0
       
       char[] c = new char[2];
       System.out.println(c[1]); //prints a character with ascii code 0
       
       String[] s = new String[7];
       System.out.println(s[1]); //prints null
       
       
       int[] array1 = {4 , 5, 6, -5}; // array initializer
       System.out.println(array1.length); //find the length of an array
       // no paranthesis after bc not a method
       int[] array2 = array1;
       array1[0] = 2; // chagnges array1 too!!!
       //for loops work very well with arrays
       
       //FOR EACH LOOP
       for(int i: array1) {
           System.out.print(i + " ");
       }
       //create a variable i (same type as array b)
       //can't change the step, will go thru each number
       //doesn'y give access to the actual array
       
       for(int i: array1) {
           i = 5; //doesn't change the array, can only read
           System.out.print(i + " ");
       }
   } 
}
