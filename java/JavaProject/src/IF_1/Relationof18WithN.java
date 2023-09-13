/* Problem Description
Given a Number N, according to situation of N print the output.
Situations of N are :
if N is greater than 18, print "N is Greater than 18"
Otherwise if N is less than 18, print "N is smaller than 18"
Otherwise Print "N is equal to 18".

Note : Intention of this problem is to teach you use of else-if so try to solve it using else-if.
 */

//package IF_1;

import java.util.Scanner;

public class Relationof18WithN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N > 18){
            System.out.println("N is Greater than 18");
        }
        else if (N < 18)
            System.out.println("N is less than 18");
        else 
            System.out.println("N is equal to 18");
    }
    
}
