public class RangeSum2 {
        public static int[] solve(int[] A, int[][] B) {
        //int ps[] = prefixSum(A);
        //int arr[] = new int[A.length];
        int n = A.length;
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        for(int i=0;i<B.length;i++){
            int l = B[i][0]-1;
            int r = B[i][1]-1;
            int c = B[i][2];
            A[l]+=c;
            if( r+1 < n ){
                A[r+1]-=c;
            }
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        for(int i=1;i<A.length;i++){
            A[i] = A[i-1] + A[i];
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // for(int i=0;i<A.length;i++){
        //     A[i]=A[i]+arr[i];
        // }
        // for(int i=0;i<A.length;i++){
        //     System.out.print(A[i]+" ");
        // }
        // System.out.println();
        return A;
    }

    public static void main(String[] args) {
        int A[] = {1,2,1,4};
        int B[][] = {{2,3,2},{1,4,5},{4,4,1}};
        System.out.print("Wrong Answer[");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("]");

        int[] res = solve(A,B);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();


    }

    
}
