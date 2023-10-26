package ContributionTech;
//package DSA1.ContributionTechnique;

import java.util.Scanner;

public class SumosAllSubArrays {
        
    
        static long sumSubArray(int A[]){
            int n = A.length;
            long ans=0;
            for(int i=0;i<n;i++){
                int count = (i+1) * (n-i);
                ans+= (long)count * A[i];
            }
            return ans;
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
        long sum =sumSubArray(A);
        System.out.println(sum);

    }
    //long n =sumSubArray(A);
    
    
}
