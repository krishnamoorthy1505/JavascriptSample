/* Problem Description
You are given an integer array A of size N. You need to perform Q queries on the given array and return the final array after processing all the queries.

Each query is of the form (l, r, c), where l and r are indices (1-based) representing a range in the array A, and c is an integer value.

For each query, you are required to add the value c to every element within the range [l, r] (inclusive).



Problem Constraints
1 <= N, Q <= 105

-106 <= A[i], c <= 106

1 <= l <= r <= N



Input Format
First argument is an integer array A of size N.

Second argument is a 2d array B of size Q x 3, where B[i][0] = l, B[i][1] = r and B[i][2] = c.



Output Format
Return the final array after processing all queries.



Example Input
Input 1:

 A = [1, 2, 1, 4]
 B = [
       [2, 3, 2]
       [1, 4, 5]
       [4, 4, 1]
     ]
Input 2:

 A = [1, 1, 2]
 B = [
       [2, 3, 2]
       [1, 3, 5]
     ]


Example Output
Output 1:

 [6, 9, 8, 10]
Output 2:

 [6, 8, 9]


Example Explanation
Explanation 1:

 First query, l = 2, r = 3, c = 2, after processing array becomes : [1, 4, 3, 4]
 Second query, l = 1, r = 4, c = 5, after processing array becomes : [6, 9, 8, 9]
 Third query, l = 4, r = 4, c = 1, after processing array becomes : [6, 9, 8, 10]
 Final array is [6, 9, 8, 10]
Explanation 2:

 First query, l = 2, r = 3, c = 2, after processing array becomes : [1, 3, 4]
 Second query, l = 1, r = 3, c = 5, after processing array becomes : [6, 8, 9]
 Final array is [6, 8, 9]
 */




public class RangeSum1 {
        public static int[] solve(int[] A, int[][] B) {
        //int ps[] = prefixSum(A);
        int arr[] = new int[A.length];
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<B.length;i++){
            int l = B[i][0]-1;
            int r = B[i][1]-1;
            int c = B[i][2];
            arr[l]+=c;
            if((r+1) < arr.length){
                arr[r+1]-=c;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<A.length;i++){
            A[i]=A[i]+arr[i];
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        return A;
    }

    public static void main(String[] args) {
        int A[] = {1,2,1,4};
        int B[][] = {{2,3,2},{1,4,5},{4,4,1}};
        System.out.print("[");
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
