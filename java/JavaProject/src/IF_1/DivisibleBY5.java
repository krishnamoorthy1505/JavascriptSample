/* Problem Description
Given a Number N. If number is divisible by 5,
print "Divisible by 5".
Otherwise print "Not divisible by 5".
 */

 //package IF_1;

import java.util.Scanner;

public class DivisibleBY5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 5 == 0){
            System.out.println("Divisble by 5");
        }
        else
             System.out.println("Is not Divisble by 5");
  
    }
    
}
