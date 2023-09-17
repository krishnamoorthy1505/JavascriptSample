/* Problem Description
Given an integer A representing an year, Return 1 if it is a leap year else return 0.

A year is leap year if the following conditions are satisfied:
Year is multiple of 400.
Else the year is multiple of 4 and not multiple of 100.

 */

import java.util.Scanner;

public class  LeapYear {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int year =  sc.nextInt();
    if((year % 400 == 0) || ((year%4 == 0) && (year % 100 != 0)) ){
        System.out.println(1);
    }
    else {
        System.out.println(0);
    }
}
}
