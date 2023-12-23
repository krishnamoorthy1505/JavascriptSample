//package Prefixsum;

import java.util.Scanner;

public class MaxSubArraySum {
        static int[] prefixSum(int A[]){
            int n = A.length;
            int ps[]=new int [n];
            ps[0]=A[0];
            for(int i=1;i<n;i++){
                ps[i]=ps[i-1]+A[i];
            }
            return ps;
        }
        static long maxSum(int A[],int B){
            System.out.println(1);
            int n = A.length;
            int s=0,e=B-1;
            long sum=0;
            long ans =Integer.MIN_VALUE;
            while(e<n){
                if(s!=0){
                    sum=A[e]-A[s-1];

                }
                else{
                    sum=A[s];

                }
                if(sum>ans){
                    ans=sum;
                }
                s++;e++;
            }
            System.out.println("ans"+ans);
            return ans;
        }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
        int res[]=prefixSum(A);
        System.out.println("Prefix Sum");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        int B=sc.nextInt();
        long res1 = maxSum(res,B);
        System.out.println(res1);

    }

}
