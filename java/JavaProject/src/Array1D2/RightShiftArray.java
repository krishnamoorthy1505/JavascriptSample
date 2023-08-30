import java.util.Scanner;

public class RightShiftArray {
        public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        int last_item = A[A.length-1];
        for(int i=n-1;i>0;i--){
            A[i] = A[i-1]; // n = 3, i/p 1 2 3 ,o/p = 1 2 3
        }
        // for(int i=n-2;i>0;i--){
        //     A[i+1] = A[i]; // n = 3 , i/p =1 2 3,o/p= 3 2 2 //wrong
        // }

        A[0]=last_item;
        for(int i=0 ;i<n;i++){
            System.out.print(A[i] +" ");
        }

        
    }
}
