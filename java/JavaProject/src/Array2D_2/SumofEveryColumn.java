//package Array2D_2;

import java.util.Scanner;

public class SumofEveryColumn {
    static int[] sumofColumn(int[][] A){
        int n = A.length;
        int m = A[0].length;
        int res[] = new int[m];
        for(int i=0;i < m;i++){
            int sum = 0;
            for(int j = 0;j < n;j++){
                sum+=A[j][i];
            }
            res[i] = sum;
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
        int[] res =sumofColumn(A);
        for(int i=0;i<res.length;i++){
                    System.out.println(res[i]+" ");

        }
    }
}
