import java.util.Scanner;

public class MinElement {
    static int minElement(int A[][]){
        int n=A.length;
        int m=A[0].length;
        //int min = A[0][0];
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < n ;i++){
            for(int j = 0;j < m;j++){
                if(A[i][j] < min){
                    min = A[i][j];
                }
            }
        }
        return min;
    }
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

        System.out.println(minElement(A));
        
    }
}
