import java.util.Scanner;

public class WavePrintColumn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mat[][] = new int[n][n];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
               System.out.print( mat[i][j] );
            }
            System.out.println();
        }
        // Iterating over the columns
        for(int col = 0; col < n; col++)
        {
            // Iterating over rows 
            for(int row = 0; row < n; row++)
            {
                if((col%2) == 1)
                {
                    System.out.print(mat[n - 1 - row][col]);
                }
                else
                {
                    System.out.print(mat[row][col]);
                }
                System.out.print(' ');
            }
        }

        System.out.println();
        sc.close();
    }
}
