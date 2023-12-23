//package DSA1.ContributionTechnique.Prefixsum;

import java.util.Scanner;

public class SumofAllSubArrays {
    static int[] prefixSum(int[]A){
        int n=A.length;
        int ps[]=new int[n];
        ps[0]=A[0];
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+A[i];
        }
        return ps;
    }
    static int sumPrefixSum(int ps[]){
        int n=ps.length;
        int sum=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i==0 ){
                    sum+=ps[i];
                }
                else{
                    sum+=ps[j]-ps[i-1];
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
        int res[]=prefixSum(A);
        System.out.println("Prefix Sum");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        int res1 = sumPrefixSum(res);
        System.out.println(res1);

    }
}
