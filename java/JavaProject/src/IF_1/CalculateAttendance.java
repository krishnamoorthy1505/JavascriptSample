//package IF_1;

/* Problem Description
Exams are near and Rahul is worried whether 
he will be allowed to take the exams or not. 
A student is not allowed to take the exams 
if his/her attendance is less than 75%. 
But Rahul is a little weak in math, 
so he wants your help to tell him whether he will be able to give exams or not. 
You are given the total number of classes held (T) and number of classes attended by Rahul (N),
 print YES or NO.
 */
import java.util.Scanner;

public class CalculateAttendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double TC = sc.nextInt();
        int NC = sc.nextInt();
        double AC = ((NC/TC)*100);
        System.out.println(AC);
        if(AC<75){
            System.out.println("NO");
        }else
            System.out.println("YES");


    }
    
}
