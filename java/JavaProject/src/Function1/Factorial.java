//package Function1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f=1;
        for(int i = n;i>=1;i--){
            f = f*i;
            System.out.println(f);
        }
        System.out.println("Factorial = "+f);
    }
}
