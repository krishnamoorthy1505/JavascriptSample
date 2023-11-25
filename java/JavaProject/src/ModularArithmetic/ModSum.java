//package ModularArithmetic;

import java.util.Scanner;

public class ModSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        int arr[] = new int[1001];
        for(int i=0;i<A.length;i++){
            arr[A[i]]++ ;
        }
         for(int i=0;i<A.length;i++){
             System.out.print(arr[i]+" ");
         }
        // System.out.println();
        long sum = 0 ;
        long mod = 1000000007;
        for(int i=1;i<=1000;i++){
            for(int j=1;j<=1000;j++){
                if(i != j && arr[i]!=0 && arr[j] !=0){
                    int value = ((i % j) * arr[i] * arr[j]);
                    sum = ((sum % mod) * (value % mod)) % mod;
                }
            }
        }
        System.out.println((int)sum);

    }
    
}
