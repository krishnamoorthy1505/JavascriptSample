/* Problem Description
Check whether a given number is positive-odd, positive-even, negative-odd OR negative-even.
Write a code to figure out the Situation.

Take a number N from user and print the Situation Of Number.
if positive-odd : print -> "Number is Positive and Odd"
if positive-even : print -> "Number is Positive and Even"
if negative-odd : print -> "Number is Negative and Odd"
if negative-even : print -> "Number is Negative and Even"
 */



import java.util.Scanner;

public class SituationofNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N > 0 && N %2 == 0){
            System.out.println("Positive Even Number");
        }
        else if(N>0 && N%2 != 0){
             System.out.println("Positive Odd Number");

        }
        else if(N < 0 && N % 2 == 0){
            System.out.println("Negative Even Number");

        }
        else if(N<0 && N%2 !=0){
            System.out.println("Negative Odd Number");

        }
    }
}
