/* Problem Description
Given an array A of N non-negative numbers and a non-negative number B,
you need to find the number of subarrays in A with a sum less than B.
We may assume that there is no overflow.



Problem Constraints
1 <= N <= 103

1 <= A[i] <= 1000

1 <= B <= 107



Input Format
First argument is an integer array A.

Second argument is an integer B.



Output Format
Return an integer denoting the number of subarrays in A having sum less than B.



Example Input
Input 1:

 A = [2, 5, 6]
 B = 10
Input 2:

 A = [1, 11, 2, 3, 15]
 B = 10


Example Output
Output 1:

 4
Output 2:

 4


Example Explanation
Explanation 1:

 The subarrays with sum less than B are {2}, {5}, {6} and {2, 5},
Explanation 2:

 The subarrays with sum less than B are {1}, {2}, {3} and {2, 3}
 */

//package PrefixSum;

import java.util.Scanner;

public class CountingSubArratPS {
        static int[] prefixSum(int A[]){
            int n=A.length;
            int ps[]=new int[n];
            ps[0]=A[0];
            for(int i=1;i<n;i++){
                ps[i]=ps[i-1]+A[i];
            }
            return ps;
        }
        static int countingSubarray(int A[],int B){
            int n = A.length;
            int ps[]=prefixSum(A);
            int count=0;
            for(int s=0;s<ps.length;s++){
                int sum=0;
                for(int e=s;e<ps.length;e++){
                    if(s==0){
                        sum=ps[e];
                    }
                    else{
                        sum=ps[e]-ps[s-1];
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
