
package acsl18_4;
import java.util.Scanner;
/**
German Shabanets
The Buckley School
ACSL #4 Senior Division
 */
public class Tree {
    
    public static void main(String[] args){
        int num = 1;
        Scanner input = new Scanner(System.in);
        
        while(num <= 5){
        String s = input.nextLine();
        s = Format(s);
        
        BinaryTree tree = new BinaryTree(s.charAt(0), 1);
        for(int i = 1; i < s.length(); i++){
            tree.addNode(s.charAt(i),1);
        }
        
        System.out.println(num + ". " + tree.Traverse());
        num++;
        }
    }
    
    public static String Format(String a){
        a = a.toUpperCase();
        String anew = "";
        
        for(int i = 0; i < a.length(); i++){
           if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') anew += a.charAt(i); 
        }
        return anew;
    }
}

class BinaryTree{
    private char letter;
    private int count;
    private BinaryTree left;
    private BinaryTree right;
    
    BinaryTree(char letter, int count){
        this.letter = letter;
        this.count = count;
        this.left = null;
        this.right = null;
    }
    
    public void addNode(char letter, int count){
        if(letter < this.letter){
            if(this.left != null) this.left.addNode(letter, 1);
            else this.left = new BinaryTree(letter, 1);
        }else if(letter > this.letter){
            if(this.right != null) this.right.addNode(letter, 1);
            else this.right = new BinaryTree(letter, 1);
        }else{
            this.count++;
        }
    }
    
    public int Traverse(){
        int num = 0;
        
        if(this.left == null && this.right == null){
            num += 0;
        }else if(this.left == null && this.right != null){
            num += this.count + this.right.Traverse();
        }else if(this.left != null && this.right == null){
            num += this.count + this.left.Traverse();
        }else{
            return this.right.Traverse() + this.left.Traverse();
        }
        
        return num;
    }
}
