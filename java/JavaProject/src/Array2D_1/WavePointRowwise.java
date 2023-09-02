import java.util.Scanner;

public class WavePointRowwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        //int m = sc.nextInt();
        int A[][]= new int [n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                A[i][j] = sc.nextInt();
            }

        }
        System.out.println();
        for(int i=0;i < n;i++){
            for(int j=0;j < n;j++){
                System.out.print(A[i][j]+" ");
            }
        System.out.println();
        }

        System.out.println();
        for(int i=0;i < n;i++){
            if(i%2 == 0){
                for(int j=0;j<n;j++){
                    System.out.print(A[i][j]+" ");
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(A[i][j]+" ");

                }
            }
            System.out.println();
        }
        
    }
           

}
