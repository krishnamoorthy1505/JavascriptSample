//package BrouteForce;

import java.util.Scanner;

public class LeadersCountRightSide {
    static int leaders(int A[]){
        int n = A.length;
        int ans=1;
        for(int i=n-2;i>=0;i--){
            //System.out.print("i "+i);
            int rmax = Integer.MIN_VALUE;
            for(int j=n-1;j>i;j--){
                //6System.out.print("=j="+j);
                if(A[j]>rmax){
                    rmax=A[j];
                }
            }
            if(A[i]>rmax){
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
