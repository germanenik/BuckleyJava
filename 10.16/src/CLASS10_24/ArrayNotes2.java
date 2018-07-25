package CLASS10_24;

/**
 *
 * @author gerashabanets
 */
public class ArrayNotes2 {
    public static void main(String[] args){
        int[] arr = new int[10];
        int sum = 0;
        double ave = 1.0;
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 20 + 1);
            
        }
        
        for(int j: arr){
                sum += j;
                
                //if(j == 10) System.out.println(arr.indexOf(10));
            }
        
        ave = sum / (double)arr.length;
        
        System.out.print("\nSum: " + sum);
        System.out.print("\nAve: " + ave);
        
        
        //System.out.println(sum);
        
        
        //TODO find and print sum of the elements, use for each loop

        //TODO find and print averga
        
        //TODO print the index of the 1st appearance of 10; if nothing -> -1
        
        //TODO find and print max element in the array, using foreach loop
        
    }
}
