/* Problem Description
Write a program to input from user an integer(n) representing the rating of a person on a platform.

You have to print the category of that person.

If the rating is greater than or equal to 2100 then that person is "grand master".
If the rating is greater than or equal to 1900 then that person is "candidate master".
If the rating is greater than or equal to 1600 then that person is "expert".
If the rating is greater than or equal to 1400 then that person is "pupil".
If the rating is smaller than 1400 then that person is "newbie".
NOTE: Print all the chars of the category of the person in lowercase if rating is odd otherwise print in UPPERCASE
 */


//package IF_ELSE_2;

import java.util.Scanner;

public class CodingRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int category = sc.nextInt();
        if(category>=2100){
            System.out.println("grand master");
        }
        else if(category>=1900){
            System.out.println("candidate master");
        }
        else if(category>=1600){
            System.out.println("expert");
        }
        else if(category>=1400){
            System.out.println("pupil");
        }
        else{
            System.out.println("newbie");
        }

    }
    
}
