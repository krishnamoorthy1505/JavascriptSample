//package DSA1.ContributionTechnique.BruteForce;

import java.util.Scanner;

public class SumofAllSubArrays {
    static int sumAllSubArrays(int[]A){
        int n=A.length;
        int sum=0;
        for(int s=0;s<n;s++){
            for(int e=s;e<n;e++){
                for(int k=s;k<=e;k++){
                    sum+=A[k];
                }
            }
        }
    return sum;
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
        int res=sumAllSubArrays(A);
        System.out.println(res);

    }
}
