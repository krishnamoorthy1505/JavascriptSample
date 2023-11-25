//package ModularArithmetic;

import java.util.Scanner;

public class GcdLog2 {
    static int greatestCommonDivisor(int A,int B){
        if(A == B){
            return A;
        }
        while(A >= 0 && B>=0 ){
            if(A==0 ||B==0){
                return A+B;
            }
            if(A > B){
                A=A%B;
            }
            else{
                B=B%A;
            }
        }
        if(A==0){
            return B;
        }
        return A;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = greatestCommonDivisor(a,b);
        System.out.println(res);

    }
}
