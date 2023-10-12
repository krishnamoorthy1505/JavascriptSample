//package BrouteForce;

import java.util.Scanner;

public class StockBuyandSellMaxPRight {
    staic int maxProfit(int[A]){
        
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
        int max = maxProfit(A);
        System.out.println(max);
    }

    
}
