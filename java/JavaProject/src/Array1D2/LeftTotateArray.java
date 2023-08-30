import java.util.Scanner;

public class LeftTotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        int first=A[0];
        for(int i=0;i<n-1;i++){
            A[i] = A[i+1];
        }
        A[n-1]=first;
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }

    }
}
