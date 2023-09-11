import java.util.Scanner;

public class SmallestElementEachColumn{
        static int[] smallestElementColumn(int[][] A){
        int n=A.length;
        int m=A[0].length;
        int[] res = new int[n];
        for(int i=0;i<m;i++){
            int min=A[i][0];
            for(int j=0;j<n;j++){
                if(A[j][i] < min){
                    min = A[j][i];
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
        System.out.println();

        }
        int[] res = smallestElementColumn(A);
        for(int i=0;i < res.length;i++){
            System.out.print(res[i]+" ");
        }
       
    }


}