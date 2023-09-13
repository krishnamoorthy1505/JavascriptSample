/* Problem Description
Given two Numbers N and X. If N is divisible by X print "Yes" otherwise print "No"
 */

//package IF_1;

import java.util.Scanner;

public class IsDivisble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        if(N%X == 0){
            System.out.println("YES");
        }else
            System.out.println("NO");
    }
}
