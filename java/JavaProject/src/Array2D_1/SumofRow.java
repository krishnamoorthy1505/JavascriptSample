import java.util.Scanner;

public class SumofRow {
    static int sum(int A[][],int B){
        int m = A[0].length;
        int sum = 0;
        for(int i =0;i < m;i++){
            sum+=A[B][i];
        }
        return sum;
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

        int b = sc.nextInt();
        System.out.println(sum(A,b));

    }
}
