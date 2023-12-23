//package BruteForce;

import java.util.Scanner;

public class MaxSumSubArray {
        static int sumofMaxSubArrays(int A[]){
            int n = A.length;
            int max=Integer.MIN_VALUE;
            for(int s=0;s<n;s++){
                int sum=0;
                for(int e=s;e<n;e++){
                    sum+=A[e];
                    System.out.print(sum+" ");
                    if(sum>max){
                        max=sum;
                    }
                }

            }
            return max;

        }
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
        int max=sumofMaxSubArrays(A);
        System.out.println();
        System.out.println("max = "+max);
    }
 

}
