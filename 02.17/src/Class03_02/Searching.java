/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class03_02;

/**
 *
 * @author gerashabanets
 */
public class Searching {
    /*
    linear search: N is the worst case scenario 
    where N is the length of the array
    minium # of comparisons - 1
    average - N/2
    
    */
    
    /*
    Binary Search
    only works with the sorted arrays
    worst case scenario: log2(N)
    Helps a lot with big arrays
    AP Q: 1000 elements
    log2(1000) = 10
    
    XXXX = 3 comparisons
    XXX =  2 comparisons
    XXXXXXX = 3 comparisons
    XXXXXXXX = 4 comparison 
    
    [4, 8) = 3 comparisons
    [512, 1024) = 10 comparisons
    
    
    */
    
    /*
    merge sorting is the fastest
    */
    
    public static void main(String[] args){
        
    }
    
    //working 
    public static int binarySearch(int[] arr, int key){
        int low = 0, high = arr.length - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == key) return mid;
            
            if(arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        
        return -1;
    }
}
