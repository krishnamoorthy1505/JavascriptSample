//package DSA2.BinarySearch.BruteForce;

import java.util.Scanner;

public class SearchKthElementPresentorNot {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println("A length");
        int[] A = new int[n];
        System.out.println("Enter the Array Elements");
        for(int i = 0;i < n;i++){
            A[i] = sc.nextInt();
        }
        for(int i=0;i < A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.println("Enter K th Element");
        int k = sc.nextInt();
        System.out.println();
        boolean flag = false;
        for(int i=0;i<A.length;i++){
            if(A[i]==k){
                flag = true;
                //return;
                break;
            }
        }
        System.out.println(flag);
    }
}