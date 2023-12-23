//package BruteForce;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<A.length;i++){
            A[i] = sc.nextInt();

        }
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");

        }
        int temp[] = new int[n];
        for(int i=0;i<n;i++){
            temp[A[i]] = i;
        }
        for(int i=0;i<n;i++){
            A[i] = temp[i];
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");

        }



    }
    
}
