//package DSA2.Hahing1;

import java.util.HashSet;
import java.util.Scanner;

public class FindTotalNoDistinctElement {
    static int solve(int[] A){
        int n = A.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(A[i]);
        }
        return hs.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        int res = solve(A);
        System.out.println();
        System.out.println(res);
    }
    
}
