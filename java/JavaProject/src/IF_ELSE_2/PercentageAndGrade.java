/* Problem Description
Write a program to calculate the percentage (according to marks of a student) and grade (according to the percentage of a student). Five numbers(A, B, C, D & E) represent the marks of a student in 5 subjects which are out of 100. Print the percentage and the grade of the student.

If percentage >= 90% : Grade A
If percentage >= 80% but <90 : Grade B
If percentage >= 70% but <80: Grade C
If percentage >= 60% but <70: Grade D
If percentage >= 40% but <60: Grade E
If percentage < 40%: Grade F


NOTE: You have to take the lowest integer of the percentage. E.g. 90.8% will be treated as 90%.

 */

//package IF_ELSE_2;

import java.util.Scanner;

public class PercentageAndGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4  = sc.nextInt();
        int m5 = sc.nextInt();
        double tot = m1+m2+m3+m4+m5;
        System.out.println(tot);
        double per = (tot*100)/500;
        //double per1 = tot/5;
        System.out.println(per+" ");
        if(per>=90)
          System.out.println("GRADE A");
        else if(per>=80 && per<90){
          System.out.println("GRADE B");
        }
        else if(per>=70 && per<80){
          System.out.println("GRADE C");

        }
        else if(per>=60 && per<70 ){
          System.out.println("GRADE D");
        }
        else if(per>=50 && per<60){
          System.out.println("Grade E");
        }
        else {
          System.out.println("GRADE F");
        }

        

                
      }
}
