import java.util.Scanner;

public class WavePointRowWise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int mat[][] = new int[n][m];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
               System.out.print( mat[i][j] );
            }
            System.out.println();
        }
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                if(row%2 == 0){
                    System.out.print(mat[row][col]+" ");
                }
                else{
                    System.out.print(mat[row][m-1-col]+" ");
                }
            }

        }
        
    }
}
