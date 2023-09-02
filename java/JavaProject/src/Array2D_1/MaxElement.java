import java.util.Scanner;

public class MaxElement {
    static int maxElement(int A[][]){
        int n = A.length;
        int m = A[0].length;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < n; i++){
            for(int j = 0;j < m;j++){
                if(A[i][j] > max){
                    max = A[i][j];
                }
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
        System.out.println( maxElement(A));
    }
}
