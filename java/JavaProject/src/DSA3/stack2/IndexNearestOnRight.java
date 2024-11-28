//package stack2;

import java.util.Stack;

public class IndexNearestOnRight {
    static int[] indexNearestOnRight(int A[]){
        int n = A.length;
        int insor[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){

        
            while(st.size()>0 && A[st.peek()] >= A[i]){
                 st.pop();
            }
             if(st.size()== 0){
                 insor[i] = -1;
            }
            else{
                 insor[i]=st.peek();
            }
                st.push(i);
        }
        return insor;
    }
    public static void main(String[] args) {
        int A[] = {8,2,4,9,1,5,3,12};
        int res[] = indexNearestOnRight(A);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }

    }
    
}
