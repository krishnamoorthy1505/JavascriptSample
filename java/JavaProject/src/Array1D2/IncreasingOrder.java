//package Array1D2;

import java.util.Scanner;


public class IncreasingOrder {
    static boolean checkSorted(int[] A){
        for(int i=0;i < A.length-1;i++){
            if(A[i] > A[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i = 0;i < n; i++){
            A[i] = sc.nextInt();
        }
        boolean isSort = checkSorted(A);
        System.out.println(checkSorted(A));
        
    }
}
 

