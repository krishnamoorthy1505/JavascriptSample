//package ModularArithmetic;

import java.util.Scanner;

public class Gcd {
    static int greatestCommonDivisor(int a,int b){
        if(b==0){
            return a;
        }
        return greatestCommonDivisor(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = greatestCommonDivisor(a,b);
        System.out.println(res);
    }
    
}
