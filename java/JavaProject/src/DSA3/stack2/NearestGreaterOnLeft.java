//package stack2;

import java.util.Stack;

public class NearestGreaterOnLeft {
    static int[] nearestGreateOnLeft(int[] A){
        int n = A.length;
        int ngol[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            while(st.size()>0 && st.peek() <= A[i]){
                st.pop();
            }
            if(st.size() == 0){
                ngol[i] = -1;

            }
            else{
                ngol[i]=st.peek();
            }
            st.push(A[i]);
        }
        return ngol;

    }
    public static void main(String[] args) {
        int A[] = {8,2,4,9,1,5,3,12};
        int res[] = nearestGreateOnLeft(A);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        
        
    }
}
