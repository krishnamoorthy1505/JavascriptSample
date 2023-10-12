//package BrouteForce;

import java.util.Scanner;

public class LeadersLeftSide {
    static int leaders(int[] A){
        int n = A.length;
        int ans=1;
        for(int i=1;i<n;i++){
            int lmax = Integer.MIN_VALUE;
            for(int j=0;j<i;j++){
                if(A[j]>lmax)
                {
                    lmax=A[j];
                }
            }
            if(A[i]>lmax){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }

        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        int lc= leaders(A);
        System.out.println(lc);




    }
    
}
