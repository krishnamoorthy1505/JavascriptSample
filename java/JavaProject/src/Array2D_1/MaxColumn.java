import java.util.Scanner;

public class MaxColumn {
    static int maxIColumn(int A[][],int B){
        int n = A.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i < n;i++){
            if(A[i][B] > max){
                max = A[i][B];
            }
        }
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
        System.out.println(maxIColumn(A,b));
    
    }
}
