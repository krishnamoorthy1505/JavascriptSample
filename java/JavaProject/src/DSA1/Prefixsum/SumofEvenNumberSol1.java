public class SumofEvenNumberSol1 {
    public static int[] solve(int[] A, int[][] B) {
        int n = A.length;
        int[] pref = new int[n];
        pref[0] = A[0];
        for(int i = 1 ; i < n ; i++){
            if(i % 2 == 0){
                pref[i] = pref[i - 1] + A[i];
            }
            else{
                pref[i] = pref[i - 1];
            }
        }
        int[] ans = new int [B.length];
        for(int i = 0 ; i < B.length ; i++){
            int val = pref[B[i][1]];
            if(B[i][0] > 0){
                val -= pref[B[i][0] - 1];
            }
            ans[i] = val;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A={16,3,3,6,7,8,17,13,7};
        int B[][] = {{2,6},{4,7},{6,7}};
        int res[] = solve(A,B);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }

        
    }
    
}
