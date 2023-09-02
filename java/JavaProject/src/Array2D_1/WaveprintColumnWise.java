import java.util.Scanner;

public class WaveprintColumnWise {
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
        
        int r=A.length;
        int c=A[0].length;

        for(int j=0;j<c;j++){
            if(j % 2 == 0){
                for(int i =0;i<r;i++){
                    System.out.print(A[i][j]+" ");
                }
            }
            else{
                for(int i=r-1;i>=0;i--){
                    System.out.print(A[i][j]+" ");
                }
               // System.out.println();
            }
        }
        
        
    }

}
