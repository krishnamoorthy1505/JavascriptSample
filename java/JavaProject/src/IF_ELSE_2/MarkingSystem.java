/* Problem Description
Given marks of a student M, if his/her marks >= 50 then the student has passed the exam otherwise failed. If a student passes the exam, print PASS and also the grade of student, grading system -

Marks are between [50,80] -> B
Marks are between [81,100] -> A

But if the student fails the exam, then print FAIL.
 */

//package IF_ELSE_2;

import java.util.Scanner;

public class MarkingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if(marks>=50){
            System.out.print("PASS ");
        }else{
            System.out.print("FAIL ");
        }
        if(marks>=50 && marks<=80){
            System.out.println("B");

        }
        else if(marks >=81 && marks <=100){
            System.out.println("A");
        }

    }
}
