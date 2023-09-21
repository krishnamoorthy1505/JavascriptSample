import java.util.Scanner;

public class MAXMINSUM {
        public static int solve(int[][] A) {
        int n = A.length;
        int m =A[0].length;
       // int res=0;
        int sum = 0;
        for(int i=0;i<n;i++){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int res = 0;
            //int min =0;
            for(int j=0;j<m;j++){
                if(A[i][j]>max){
                    max = A[i][j];
                    System.out.print(max+" ");
                }
               if (A[i][j]<min){
                     min = A[i][j];
                     System.out.print(max +" ");
                }
            }
            res = max - min;
            sum+=res;
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
                //Print the A Array Row by Row
        System.out.println();
        for(int i=0;i < n;i++){
            for(int j=0;j < m;j++){
                System.out.print(A[i][j]+" ");
            }
        System.out.println();

        }
        System.out.println();
        System.out.println(solve(A));

    }
}
