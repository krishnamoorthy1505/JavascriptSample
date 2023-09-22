//package IF_ELSE_2;

import java.util.Scanner;

public class FizzBuzz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%3==0){
            System.out.print("FIZZ");
        }
        if(n%5==0){
            System.out.println("BUZZ");
        }
    }
}
