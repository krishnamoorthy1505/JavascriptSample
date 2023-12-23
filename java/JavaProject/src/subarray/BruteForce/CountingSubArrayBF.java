//package BruteForce;

import java.util.Scanner;

public class CountingSubArrayBF {
    static int countingSubarray(int A[],int B){
        int n=A.length;
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int s=0;s<n;s++){
            for(int e=s;e<n;e++){
                int sum=0;
                for(int i=s;i<=e;i++){
                    sum+=A[i];
                }
                if(sum<B){
                    count++;
                }
            }
        }
                    return count;
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        int l = A.length;
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Enter the B =");
        int B=sc.nextInt();

        System.out.println();
        for(int i=0;i<l;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        int c=countingSubarray(A,B);
        System.out.println(c);
    }

    
}
