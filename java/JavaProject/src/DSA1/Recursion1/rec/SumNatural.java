//5package Recursion1.rec;

import java.util.Scanner;

public class SumNatural {
    static int sum(int N){
        if(N == 0){
            return 0;
        }
        int temp = sum(N-1);
        return temp + N;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = sum(n);
        System.out.println(res);
        
    }
}
