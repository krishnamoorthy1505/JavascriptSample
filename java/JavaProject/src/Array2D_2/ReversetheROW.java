import java.util.Scanner;

public class ReversetheROW {
    static void reverse(int[][] A){
        int n = A.length;
        int m = A[0].length;
        for(int r=0;r<n;r++){
            int cs=0;int ce = m-1;
            while(cs < ce){
                int temp=A[r][cs];
                A[r][cs]=A[r][ce];
                A[r][ce]=temp;
                cs++;
                ce--;
             }
        }
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

        reverse(A);
        System.out.println("Reverse 90 Degree");
        for(int i=0;i < A.length;i++){
            for(int j=0;j < A[0].length;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }


    }
    
}
