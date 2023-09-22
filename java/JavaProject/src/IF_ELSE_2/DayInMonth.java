/* Problem Description

You are given an integer A.

You have to tell how many days are there in the month denoted by A in a non-leap year.
 */

//package IF_ELSE_2;

import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println(31);
        }
        else if(n==2){
            System.out.println(28);
        }
        else if(n==3){
            System.out.println(31);
        }
        else if(n==4){
            System.out.println(30);
        }       
            else if(n==5){
            System.out.println(31);
            }
        else if(n==6){
            System.out.println(30);
        }
        else if(n==7){
            System.out.println(31);
        }
        else if(n==8){
            System.out.println(31);
        }
        else if(n==9){
            System.out.println(30);
        }
            else if(n==10){
            System.out.println(31);
        }
        else if(n==11){
            System.out.println(30);
        }
        else if(n==12){
            System.out.println(31);
        }


    }
}
