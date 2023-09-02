import java.util.Scanner;

public class SumofEveryRow {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int A[][] = new int[n][m];
        //Scan the value
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

        // sum of every column
        for(int i=0;i < n;i++){
            int sum = 0;
            for(int j=0;j < m;j++){
                sum+=A[i][j];
            }
        System.out.print(sum+ " " );

        }




    }
}
