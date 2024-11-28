//package stack2;

import java.util.Stack;

public class NearestGreaterOnRight {
    static int[] nearestGreaterOnRight(int[] A){
        int n = A.length;
        int ngor[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i >= 0;i--){
            while(st.size()>0 && st.peek()<=A[i]){
                st.pop();
            }
            if(st.size()==0){
                ngor[i] = -1;
            }
            else{
                ngor[i] =st.peek();
            }
            st.push(A[i]);

        }
        return ngor;
    }
    public static void main(String[] args) {
        int A[] ={8,2,4,9,1,5,3,12};
        int ans[] = nearestGreaterOnRight(A);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
