//package BruteForc;

import java.util.Scanner;

public class ZeroQueryPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]A=new int[n];
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        int[][]Q={{1,3,2},{2,5,2},{3,5,3}};
        for(int i=0;i<Q.length;i++){
            int start=Q[i][0];
            int end = Q[i][1];
            int value = Q[i][2];
            A[start]+=value;
            if(end+1 < A.length){
                A[end+1]-=value;
            }

        }
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }

        //prefix sum
        for(int i=1;i<n;i++){
            A[i] = A[i-1]+A[i];
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }

    }
}
