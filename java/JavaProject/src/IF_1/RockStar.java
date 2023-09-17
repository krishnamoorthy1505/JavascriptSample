/* Problem Description

Given a Number N, print the answer according to the following rules-
If N is divisible by 3 print Rock
If N is divisible by 5 print star
If N is divisible by both 3 and 5 print Rockstar
Note : You are allowed to use only if condition. Don’t use else or else-if condition. This constraint is provided for learning purposes.
 */


import java.util.Scanner;

public class RockStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N%3 == 0){
            System.out.print("ROCK ");
        }
        if(N%5 == 0){
            System.out.println("STAR");
        }
    }
}
