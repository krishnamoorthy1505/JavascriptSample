//package IF_1;
/* Write a program to input a number(A) from user 
and print 1 if it is positive, -1 if it is negative, 
0 if it's neither positive nor negative.
 */

import java.util.Scanner;

public class CategriesNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A > 0){
            System.out.println("Positive Integer");
        }
        else if(A < 0)
            System.out.println("Negative integer");
        else{
            System.out.println("Zero");
        }
    }
}
