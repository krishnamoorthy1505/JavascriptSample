public class CreateBinaryTree {
    static TreeNode createBT(){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.left.left = new TreeNode(1);
        root.left.right= new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(25);
        return root;

    }
    static void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        //System.out.print(root.val+" ");
        //System.out.println();
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode node = createBT();
        inOrder(node);
    }
}
