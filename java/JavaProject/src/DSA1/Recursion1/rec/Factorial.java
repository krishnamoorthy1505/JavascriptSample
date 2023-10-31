//package Recursion1.rec;

import java.util.Scanner;

public class Factorial {
    static int factorial(int N){
        if(N == 0){
            return 1;
        }
        int temp = factorial(N-1);
        return temp * N;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int res = factorial(n);
        System.out.println(res);

    }
}
