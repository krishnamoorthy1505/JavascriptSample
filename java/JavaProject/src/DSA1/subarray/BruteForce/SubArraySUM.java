//package BruteForce;
/* TC O(n^3) SC:O(1) not a better approach
        if length of array N
        Total no of subarray 
        1+2+3+......+N 
        sum of natural numbers = N(N+1)/2
        printing single subarray N

        To print All Subarrays = No of total subarrays * to print single subarray
        N(N+1)/2  * N =O(N^3)

 */
import java.util.Scanner;

public class SubArraySUM {
        static void printAllSumSubArrays(int A[]){
            int n=A.length;
            for(int s=0;s<n;s++){
                for(int e=s;e<n;e++){
                    int sum=0;
                    for(int i=s;i<=e;i++){
                        sum+=A[i];
                    }
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
        printAllSumSubArrays(A);

    }


}
