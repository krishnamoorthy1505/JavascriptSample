//package BruteForc;

import java.util.Scanner;

public class ZeroQueryProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[] =new int[n];
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        int[][]Q={{1,3},{4,-2},{3,1}};
        for(int i=0;i<Q.length;i++){
            int start=Q[i][0];
            int value=Q[i][1];
            for(int j=start;j<A.length;j++){
                A[j]+=value;
                System.out.print(A[j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
        

    }
}
