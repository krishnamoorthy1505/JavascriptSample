package Carryforward;
//package Prefixsum;

import java.util.Scanner;

public class SumofAllSubArrayCarryForward {
    static int sumCarryForward(int[] A) {
        int n=A.length;
        int tsum=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=A[j];
                tsum+=sum;
            }
        }
        return tsum;
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
        
        int res1 = sumCarryForward(A);
        System.out.println(res1);

    }

}
