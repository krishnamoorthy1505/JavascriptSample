import java.util.Stack;

public class InoderIterativeTraversal {
    @SuppressWarnings("unused")
    static void iterativeInorder(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr=root;
        while(st.size()>0 || curr!=null){

            if(curr!=null){
                //System.out.println(4);

                st.push(curr);
                curr=curr.left;
                //System.out.print(curr.val+" ");
            }
            else {
                //System.out.print(st.peek());
                curr=st.pop();
                System.out.print(curr.val+" ");
                curr=curr.right;
            }

        }

    }
    public static void main(String[] args) {
        //CreateBinaryTree cbt = new CreateBinaryTree();
        TreeNode root = CreateBinaryTree.createBT();
        //CreateBinaryTree.inOrder(root);
        iterativeInorder(root);

    }
    
}
