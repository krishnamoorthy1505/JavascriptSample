/* Write a program to input from user three numbers(A, B & C) representing side lengths of a triangle.

You have to print if the traingle is "equilateral", "scalene" or "isosceles".
 */






//package IF_ELSE_2;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(A==B && A==C){
            System.out.println("Equilateral Triangle");
        }
        else if(A==B || B == C || C==A){
            System.out.println("Isolence Triangle");
        }
        else{
            System.out.println("Scalen Triangle");
        }
    }
}
