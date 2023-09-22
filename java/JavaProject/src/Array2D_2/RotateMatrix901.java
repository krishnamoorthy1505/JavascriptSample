import java.util.Scanner;

public class RotateMatrix901 {
        public static void solve(int[][] A) {
        int n = A.length;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<i ; j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n/2 ; j++){
                int temp = A[i][j];
                A[i][j] = A[i][n-j-1];
                A[i][n-j-1] = temp;
            }
        }
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
        System.out.println();

        solve(A);
        System.out.println();

        for(int i=0;i < n;i++){
            for(int j=0;j < m;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }


    }
    
}
