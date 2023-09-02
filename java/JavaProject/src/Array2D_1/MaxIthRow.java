//package Array2D_1;

import java.util.Scanner;

public class MaxIthRow {
    static int maxIRow(int A[][],int b){
        int m = A[0].length;
        int max = Integer.MIN_VALUE;
        //System.out.println(max);
        for(int i=0;i<m;i++){
            if(A[b][i] > max){
                max=A[b][i];
            }
        }
        //System.out.println(max);
        return max;
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
                //Print the A Array Row by Row
        System.out.println();
        for(int i=0;i < n;i++){
            for(int j=0;j < m;j++){
                System.out.print(A[i][j]+" ");
            }
        System.out.println();

        }
        System.out.println();

        int b = sc.nextInt();
        System.out.println(maxIRow(A,b));
        
    }
}
