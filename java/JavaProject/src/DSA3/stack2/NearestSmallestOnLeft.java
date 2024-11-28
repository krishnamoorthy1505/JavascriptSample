//package stack2;

import java.util.Stack;

public class NearestSmallestOnLeft {
    static int[] nearestClosestOnLeft(int[] A){
        int n = A.length;
        Stack<Integer> st=new Stack<>();
        int nsol[] = new int[n];
        for(int i=0;i<n;i++){
            while(st.size()>0 && st.peek()>=A[i]){
                st.pop();

            }
            if(st.size() == 0){
                nsol[i] = -1;
            }
            else{
                nsol[i] = st.peek();
            }
            st.push(A[i]);
        }
        return nsol;
    }
    public static void main(String[] args) {
        int[] A={8,2,4,9,1,5,3,12};
        int[] res = nearestClosestOnLeft(A);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    
}
