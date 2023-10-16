//package BruteForce;

import java.util.Scanner;

public class PrintArray {

        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        int l = A.length;
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<l;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
 
}
