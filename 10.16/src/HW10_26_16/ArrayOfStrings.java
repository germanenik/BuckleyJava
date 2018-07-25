package HW10_26_16;

/**
 *
 * @author gerashabanets
 */
public class ArrayOfStrings {
    public static void main(String[] args){
        String[] array = {"Hi", "Viktoriia", "Schwartz"};
        
        for(String word: array){
            for(int k = word.length() - 1; k >= 0; k--){
                System.out.print(word.charAt(k));
            }
            System.out.println();
        }
    }
}
