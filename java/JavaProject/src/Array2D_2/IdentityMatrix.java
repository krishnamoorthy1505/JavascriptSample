import java.util.Scanner;

public class IdentityMatrix {
    static int identity(int[][]A){
        int n = A.length;
        int m = A[0].length;
        int i=0,j=0;
        while(i<n && j<m){
             if(i == j && A[i][j] !=1){
                    // flag = 0;
                    // break;
                    return 0;
                }
                else if(i!=j && A[i][j]!=0){
                    // flag = 0;
                    // break;
                    return 0;
                }
            i++;
            j++;
        }
        return 1;
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
        System.out.println(identity(A));
       
    }
    
}
