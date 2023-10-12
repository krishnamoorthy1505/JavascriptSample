//package TC;

import java.util.Scanner;

public class LeaderRighttoLeft {
    static int leaders(int A[]){
        int n=A.length;
        int lmax=A[n-1];
        int ans=1;
        for(int i=n-2;i>=0;i--){
            if(A[i]>lmax){
                ans++;
                lmax=A[i];
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
