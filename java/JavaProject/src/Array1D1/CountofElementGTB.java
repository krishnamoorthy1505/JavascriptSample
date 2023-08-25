//package Array1D1;

import java.util.Scanner;

public class CountofElementGTB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        int count=0;
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            if(A[i]>m){
                count++;
            }
        }
        System.out.println(count);

    }
}
