/*

package Class12_01;

/**
 *
 * @author gerashabanets
 */
public class Methods {
    public static void main(String[] args){

    int count = 0;
    int num = 3;
    boolean isPrime = true;
    
    while(count < 100){
        
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0){
                isPrime = false;
            }
        }
        int newNum = reverse(num);
        for(int i = 2; i <= newNum/2; i++){
            if(newNum % i == 0){
                isPrime = false;
            }
        }
        if(isPrime &&!isPalindrome(num) ){
            System.out.print(num + " ");
            count++;
            if(count % 10 == 0) System.out.println();
        } 
        num++;
        isPrime = true;
    }
    
    }
    //Method overloading
    //As long as parameters are different, can have the same name
    //HW for 12/05
    public static boolean isPalindrome(String s){
        for(int i = 0; i < s.length()/2; i++){
           if( s.charAt(i) != s.charAt(s.length() - 1 - i) ) return false;
        }
        return true;
    }
    
    public static int reverse(int num){
        int finalNum = 0;
        
        while(num != 0){
        finalNum *= 10;
        finalNum += num % 10; 
        num /= 10;
        }
        
      return finalNum;  
    }
    
    public static boolean isPalindrome(int num){
        if(num == reverse(num)) return true;
        return false;
    }
}
