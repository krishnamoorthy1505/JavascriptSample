//package BruteForce;

import java.util.Scanner;

public class PrintAllSuArraysWrong {
        static void printAllSubArrays(int[] A){
        int n = A.length;
        for(int s=0;s<n;s++){
            for(int e=s;e<n;e++){
                    //System.out.print("("+s+" ,"+e+")"+A[i]+" ");
                    System.out.print(A[e]+" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        int l = A.length;
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<l;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        printAllSubArrays(A);

    }


    
}
