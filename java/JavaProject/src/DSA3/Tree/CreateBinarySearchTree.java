public class CreateBinarySearchTree {
    static TreeNode createBST(){
        TreeNode root=new TreeNode(10);
        root.left= new TreeNode(15);
        root.left.left=new TreeNode(12);
        root.left.right=new TreeNode(18);
        root.left.right.left=new TreeNode(16);

        root.right=new TreeNode(30);
        root.right.left=new TreeNode(25);
        root.right.right=new TreeNode(42);
        root.right.right.left=new TreeNode(35);
        return root;

    }
    public static void main(String[] args) {
        //TreeNode root = new TreeNode(10);
        TreeNode root=createBST();
        InOrderTraversal.inOrder(root);
    }
}
