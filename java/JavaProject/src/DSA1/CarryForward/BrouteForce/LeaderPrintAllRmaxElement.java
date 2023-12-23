//package BrouteForce;

import java.util.Scanner;

public class LeaderPrintAllRmaxElement {

        static int[] leaderAllMaxElement(int A[]){
            int n=A.length;
            int lmax=A[n-1];
            int count=0;
            int res[]=new int[n];
            res[count++]=lmax;
            for(int i=n-2;i>=0;i--){
                //System.out.println("i="+A[i]);
                if(A[i]>lmax){
                    res[count++]=A[i];
                    lmax=A[i];
                }
            }
            int result[]=new int[count];
            for(int i=0;i<count;i++){
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
        int lc[]= leaderAllMaxElement(A);
        for(int i=0;i<lc.length;i++){
        System.out.print(lc[i]+" ");
        }




    }

}
