//package IF_ELSE_2;
/* Problem Description

Given age of a person, Categorise it based on age.
Category is given below :
if age is in range of 0 to 12 then category is "Child",
Otherwise if age is in range of 13 to 19 then category is "Teenager",
Otherwise if age is in range of 20 to 40 then category is "Young",
Otherwise if age is in range of 41 to 60 then category is "Middle-Aged",
Otherwise if age is more than 60 than category is "Senior-Citizen"
 */

import java.util.Scanner;

public class CategorizeogAgePerson {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>0 && age<=12){
            System.out.println("Child");
        }
        else if(age >=13 && age<=19){
            System.out.println("Teenager");
        }
        else if(age>=20 && age<=40){
            System.out.println("Young");
        }
        else if(age>=41 && age<=60){
            System.out.println("Middle Aged");
        }
        else {
            System.out.println("Senior Citizen");
        }
   } 
}
