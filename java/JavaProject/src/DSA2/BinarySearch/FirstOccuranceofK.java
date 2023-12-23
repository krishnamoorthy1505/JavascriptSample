//package DSA2.BinarySearch;

import java.util.Scanner;

public class FirstOccuranceofK {
        static int binarySearch(int A[],int k){
            int n = A.length;
            int lo = 0,hi = n-1;
            int fo=-1;
            while(lo<=hi){
                int m = (lo+hi)/2;
                if(A[m] == k){
                    fo=m;
                    hi=m-1;
                }
                else if(A[m]<k){
                    lo = m+1;
                }
                else{
                    hi = m-1;
                }
            }
            return fo;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("A length");
        int[] A = new int[n];
        System.out.println("Enter the A Elements");
        for(int i = 0;i < n;i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the Kth Element");
        int k = sc.nextInt();
        System.out.println();
        for(int i=0;i < A.length;i++){
            System.out.print(A[i]+" ");
        }

        System.out.println();
        int b = binarySearch(A,k);
        System.out.println(b);
    }

}
