//package Array2D_2;

import java.util.Scanner;

public class LargestofEachRow {
    static int[] largestElement(int[][ ] A){
        int n = A.length;
        int m = A[0].length;
        int res[] = new int[n];
        for(int i = 0;i<n; i++){
            
            //int max = Integer.MIN_VALUE;
            int max = A[i][0];
            for(int j =0;j<m;j++){
                if(A[i][j] > max){
                     max = A[i][j];
                }
            }
            res[i] = max;
        }
        return res;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int A[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j] = sc.nextInt();
            }

        }
        for(int i=0;i < n;i++){
            for(int j=0;j < m;j++){
                System.out.print(A[i][j]+" ");
            }
        System.out.println();
        }
        int[] res =largestElement(A);
        for(int i=0;i<res.length;i++){
                    System.out.println(res[i]+" ");

        }
        //System.out.println(res);


    }
    
}
