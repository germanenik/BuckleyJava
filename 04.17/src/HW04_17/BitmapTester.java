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
public class BitmapTester {
    public static void main(String[] args){
        Bitmap bm = new Bitmap(new int[]{1, 1, 1, 3, 1, 4,
        2, 1, 2, 2, 2, 5,
        3, 1, 3, 6,
        4, 0, 4, 1, 4, 6, 4, 7,
        5, 1, 5, 3, 5, 6,
        6, 1, 6, 3, 6, 6,
        7, 1, 7, 3, 7, 6,
        8, 1, 8, 2, 8, 3, 8, 4, 8, 5, 8, 6});
        
        System.out.println(bm);
        bm.flipHorizontal();
        System.out.println(bm);
        bm.flipHorizontal();
        bm.flipVertical();
        System.out.println(bm);
        bm.flipVertical();
        bm.reverse();
        System.out.println(bm);
    }
}
