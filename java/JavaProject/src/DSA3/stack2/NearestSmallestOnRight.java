//package stack2;

import java.util.Stack;

public class NearestSmallestOnRight {
    static int[] nearestSmallestOnRight(int A[]){
        int n = A.length;
        //nsor nearwst smallest onright
        int nsor[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && st.peek() >= A[i]){
                st.pop();
            }
            if(st.size()== 0){
                nsor[i]=-1;
            }
            else{
                nsor[i] = st.peek();
            }
            st.push(A[i]);
        }
        return nsor;
    }
    public static void main(String[] args) {
        int[] A={5,4,3,2,1};
        int res[] = nearestSmallestOnRight(A);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    
}
