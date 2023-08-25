//package Array1D1;

import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int res=0;
        for(int i=0;i<n;i++){
            if(a[i]<0){
               res =a[i];
            }
            System.out.print(res);
        }
        
    }
}
