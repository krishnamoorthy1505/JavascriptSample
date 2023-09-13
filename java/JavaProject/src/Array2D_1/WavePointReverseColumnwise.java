import java.util.Scanner;

public class WavePointReverseColumnwise {
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
        for(int c=0; c < m;c++){
            for(int r=0;r < n ;r++){
                if(c%2 == 1){
                    System.out.print(mat[n-1-r][c]+" ");
                }else{
                    System.out.print(mat[r][m-1-c]+" ");
                }
            }
        }

    }
}
