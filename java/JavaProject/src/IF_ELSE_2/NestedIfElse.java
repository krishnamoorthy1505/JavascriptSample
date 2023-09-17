/* Problem Description
Write a program that asks the user to input a number N. If N is between 10 and 20, your program should ask the user to enter another number M and then:-
Print the sum of the two numbers.
If the sum is greater than equal to 100, your program should also print "That is a large sum!" on a new line.
If N is not between 10 and 20, your program should print -1.
 */


//package IF_ELSE_2;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=10 && n<=20){
            int m = sc.nextInt();
            int sum = n+m;
            if(sum>=100){
                System.out.println("That is a Large sum");
            }
        }else{
            System.out.println("-1");
        }
    }
}
