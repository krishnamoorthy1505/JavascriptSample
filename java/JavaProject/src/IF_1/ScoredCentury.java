
/* Problem Description
Given runs scored by a batsman, find if he has scored a century or not.
If he has scored a century print "Century!!!" otherwise print "Better luck next time!".
 */

//package IF_1;

import java.util.Scanner;

public class ScoredCentury {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=100){
            System.out.println("Century");
        }
        else{
            System.out.println("Better luck next time");
        }
    }
    
}
