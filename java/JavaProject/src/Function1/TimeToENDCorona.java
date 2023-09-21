/* Problem Description
Given three integers, A, B and C. You have to find the number of days it will take to reach zero cases of Corona in a city.

A - Average cases recovered in a day of the corona.
B - Number of new cases of corona daily.
C - Current active cases of the corona.

Return the minimum number of days it will take to reach 0 active cases of Covid.
 */

//package Function1;

import java.util.Scanner;

public class TimeToENDCorona {
    static int timeToEndCorona(int A,int B,int C){
        int day=0;
        while(C>0){
            C+=B;
            C-=A;
            day++;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println(timeToEndCorona(A,B,C));
    }
}
