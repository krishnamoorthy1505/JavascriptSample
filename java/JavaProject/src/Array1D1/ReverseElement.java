//package Array1D1;

import java.util.Scanner;

public class ReverseElement {
        public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
        for(int i=0;i<A.length;i++)
        {
            A[i]=sc.nextInt();
        }
        for(int i=N-1;i>=0;i--){
            System.out.println("i = "+i+" "+A[i]);
        }
        
    }

}
