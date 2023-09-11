import java.util.Scanner;

public class Multiplication {
    static int[][] multiplication(int[][]A,int[][] B){
        int n1 = A.length;
        int m1 = A[0].length;
        int n2 = B.length;
        int m2 = B[0].length;
        int res[][] = new int[n1][m2];
        int i=0,j=0;
        while(i<n1 && j<m2){
            int sum=0;
            int k=0;
            while(k<m1){
                sum+=A[i][k] * B[k][j];
                k++;
            }
            res[i][j]=sum;
            i++;
            j++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();1
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

        int[][] res=multiplication(A,B);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
}
