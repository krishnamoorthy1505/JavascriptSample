import java.util.Scanner;

public class SmallestElementofRow {
    static int[] smallestElementRow(int[][] A){
        int n=A.length;
        int m=A[0].length;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            int min=A[i][0];
            for(int j=0;j<m;j++){
                if(A[i][j] < min){
                    min = A[i][j];
                }

            }
            res[i]=min;
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
        int[] res = smallestElementRow(A);
        for(int i=0;i < res.length;i++){
            System.out.print(res[i]+" ");
        }
       
    }
}
