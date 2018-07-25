
package Class11_14;

/**
 *
 * @author gerashabanets
 */
public class Practice {
    public static void main(String[] args){
        int[] arr = {3, 5, 3};
        m(arr);
        for(int i: arr){
            System.out.print(i + " "); //will print 3 6 3!!! 
            //changes an array
        }
        
        String s = "aaa";
        m2(s);
        
        System.out.println(s);
    }
    
     public static void m(int[] a){
        a[1] = 6;
    }
     
     public static void m2(String s){
         s = "iii";
     }  
}
