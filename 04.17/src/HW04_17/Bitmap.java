/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_17;

/**
 *
 * @author gerashabanets
 */
public class Bitmap {
    private String[][] image;
    
    public Bitmap(int[] a){
        image = new String[10][10];
        for(int row = 0; row < image.length; row++){
            for(int col = 0; col < image[row].length; col++){
                image[row][col] = "-";
            }   
        }
    
        for(int i = 0; i < a.length; i += 2){
            image[ a[i] ][ a[i + 1] ] = "*";
        }
        
    }
    
    public void flipHorizontal(){
        String[][] imageNew = new String[10][10];
        for(int row = 0; row < imageNew.length; row++){
            for(int col = 0; col < imageNew[row].length; col++){
                imageNew[row][col] = image[row][9 - col];
            }
        }
        image = imageNew;
    }
    
    public void flipVertical(){
       String[][] imageNew = new String[10][10];
       for(int row = 0; row < imageNew.length; row++){
            for(int col = 0; col < imageNew[row].length; col++){
                imageNew[row][col] = image[9-row][col];
            }
       }
       
       image = imageNew;
    }
    
    public void reverse(){
        for(int row = 0; row < image.length; row++){
            for(int col = 0; col < image[row].length; col++){
                if(image[row][col] == "-") image[row][col] = "*";
                else image[row][col] = "-";
            }
        }
    }
    
    @Override
    public String toString(){
        String a = "";
        for(int row = 0; row < image.length; row++){
            for(int col = 0; col < image[row].length; col++){
                a += image[row][col];
            }
            a += "\n";
        }
        return a;
    }
}
