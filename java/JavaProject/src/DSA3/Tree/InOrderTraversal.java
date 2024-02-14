public class InOrderTraversal {
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
        //TreeNode root =new TreeNode(10);

    }
    
}
