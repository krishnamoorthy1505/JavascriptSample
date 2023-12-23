//package DSA2.Hahing1;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingElement {
    static int solve(int[] A){
        int n = A.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(A[i])){
                int freq = map.get(A[i]);
                map.put(A[i],freq+1);
            }
            else{
                map.put(A[i],1);
            }

        }
        System.out.println(map);
        //return 0;
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                if(map.get(A[i]) == 1)
                return A[i];
            }
        }
        return -1;
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
        for(int i=0;i < A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
       /*  System.out.println("No of Element B");
        int m = sc.nextInt();
        int[] B  = new int[m];
        System.out.println("Enter the Query B");
        for(int i = 0;i < m;i++){
            B[i] = sc.nextInt();
        }
        for(int i=0;i < B.length;i++){
            System.out.print(B[i]+" ");
        } 
        System.out.println(); */
        int res = solve(A);
        System.out.println(res);
    
    }
    
}
