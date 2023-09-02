import java.util.Scanner;

public class SumofColumn {
    static int sumColumn(int A[][],int B){
        int n = A.length;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum+=A[i][B];
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
        System.out.println();

        for(int i=0;i < n;i++){
            for(int j=0;j < m;j++){
                System.out.print(A[i][j]+" ");
            }
        System.out.println();

        }
        System.out.println();


        int b = sc.nextInt();
        System.out.println(sumColumn(A,b));

    }
}
