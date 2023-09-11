import java.util.Scanner;

public class TransposeMatrix {
    static int[][] transposeElement(int[][] A){
         int n = A.length;
        int m = A[0].length;
        int[][] transpose = new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transpose[j][i] = A[i][j];
            }
        }
        return transpose;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int A[][] = new int[n][m];
        System.out.println("Scan the Element");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j] = sc.nextInt();
            }

        }
        System.out.println("Print the matrix");
        for(int i=0;i < n;i++){
            for(int j=0;j < m;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
    
        
        }
        int[][] res=transposeElement(A);
        System.out.println("Tranpose Mtrix");
        for(int i=0;i < res.length;i++){
            for(int j=0;j < res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }


    
    }
}
