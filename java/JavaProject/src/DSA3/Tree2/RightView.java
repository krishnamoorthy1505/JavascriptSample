//package DSA3.Tree2;

import java.util.ArrayDeque;
import java.util.ArrayList;


class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int i){
        this.val = val;
        
    }

}

/* class BinaryTree {
    TreeNode root;
    BinaryTree(int val){
        root = new TreeNode(val);
    }
    BinaryTree(){
        root=null;
    }
} */

public class RightView {
    
    public static void main(String[] args) {
        //BinaryTree tree= new BinaryTree();
        TreeNode root= new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left=new TreeNode(8);
        root.left.right=new TreeNode(4);
        root.left.right.left=new TreeNode(2);
        //Right child
        root.right = new TreeNode(9);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.left.right = new TreeNode(3);
        travel(root);
       // rightView(root);
       
        
    }
    static void rightView(TreeNode A){
        ArrayList<Integer> res=new ArrayList<>();
       // Queue<TreeNode> q=new ArrayDeque<>();

    }
    static void travel(TreeNode A){
        if(A==null){
            return;
        }
        System.out.print(A.val +" ");
        travel(A.left);
        travel(A.right);

    }
    
}
