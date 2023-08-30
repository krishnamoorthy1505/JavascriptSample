//package loop2;

import java.util.Scanner;

public class Polindromic {
    public static void main(String[] args) {
        //System.out.println("Polindromic");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int org = n;
        while(n<0){
            n*=-1;
        }
        int rev = 0;
        //System.out.println(n);
        while(n > 0){

            int ld = n % 10;
            rev = rev * 10 + ld;
            n=n / 10;

        }
        System.out.println(org);
        System.out.println(rev);
        if(org == rev){
            System.out.println("The given number is POLINDROME");
        }
        else System.out.println("The given number is not POLINDROME");

    }
    
}
