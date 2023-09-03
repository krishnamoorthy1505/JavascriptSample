//package Array2D_2;

import java.util.Scanner;

public class AddMatrics {
    static int[][] addMatrix(int[][] A,int[][] B){
        int n=A.length;
        int m=A[0].length;
        int[][] res=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j] = A[i][j] + B[i][j];
            }
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
        int B[][] = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                B[i][j] = sc.nextInt();
            }

        }
        for(int i=0;i < n;i++){
            for(int j=0;j < m;j++){
                System.out.print(A[i][j]+" ");
            }
        System.out.println();

        }
        System.out.println();

        for(int i=0;i < n;i++){
            for(int j=0;j < m;j++){
                System.out.print(A[i][j]+" ");
            }
        System.out.println();

        }
        System.out.println();

        int[][] res=addMatrix(A,B);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
