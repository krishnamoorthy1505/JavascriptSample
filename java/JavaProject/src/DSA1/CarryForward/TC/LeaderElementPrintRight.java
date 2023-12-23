//package TC;

import java.util.Scanner;

public class LeaderElementPrintRight {
        static int[] leaderRightElement(int[] A){
            int n =A.length;
            int lmax=A[n-1];
            int ans=0;
            int res[]=new int[n];
            res[ans++]=lmax;
            System.out.println("Answer"+ans);

            for(int i=n-2;i>=0;i--){
                if(A[i]>lmax){
                                System.out.println("Answer"+ans);
                    res[ans++]=A[i];
                    lmax=A[i];
                }
            }
            System.out.println("Answer"+ans);
            int[] result=new int[ans];
            for(int i=0;i<ans;i++){
                result[i]=res[i];
            }
            return result;
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
        int lc[]= leaderRightElement(A);
        for(int i=0;i<lc.length;i++){
            System.out.print(lc[i] + " " );

        }

        
    }

    
}
