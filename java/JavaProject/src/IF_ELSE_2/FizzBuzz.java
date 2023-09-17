/* Write a program that takes in a number N as input and does the following:

if N is a multiple of 3, print Fizz
if N is a multiple of 5, print Buzz
if N is a multiple of both 3 and 5, print FizzBuzz
 */

//package IF_ELSE_2;

import java.util.Scanner;

public class FizzBuzz {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%3 == 0 && n%5==0){
            System.out.println("FIZZ BUZZ");
        }
        else if(n%3==0){
            System.out.println("FIZZ");
        }
        else if(n%5==0){
            System.out.println("BUZZ");
        }

   } 
}
