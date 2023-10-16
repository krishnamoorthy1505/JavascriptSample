//package TC;
/* TC O(n^2) SC:O(1) not a better approach
        if length of array N
        Total no of subarray 
        1+2+3+......+N 
        sum of natural numbers 
        Total number of subarray = N(N+1)/2
        printing single subarray N

        To print All Subarrays = No of total subarrays 
        N(N+1)/2   =O(N^2)


        Not Possible O(N)
        need to travel atleast N(N+1)/2


 */

import java.util.Scanner;

public class SumSubArray {
        static void printSumAllSubArrays(int A[]){
            int n = A.length;
            for(int s=0;s<n;s++){
                int sum=0;
                for(int e=s;e<n;e++){
                    sum+=A[e];
                    System.out.println(sum);
                }

            }
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
        printSumAllSubArrays(A);

    }


    
}
