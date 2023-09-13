//package IF_1;
// Problem Description

// You are given 3 integer angles(in degrees) A, B and C of a triangle. You have to tell whether the triangle is valid or not.

// A triangle is valid if sum of its angles equals to 180.

import java.util.Scanner;

public class AnglesofValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();
        int C= sc.nextInt();
        int triangle = A+B+C;
        if(triangle == 180){
            System.out.println("Triangle is valid");
        }
        else 
            System.out.println("Triangle is valid");

    }
    
}
