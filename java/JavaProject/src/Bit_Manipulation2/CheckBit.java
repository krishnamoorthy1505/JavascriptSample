//package Bit_Manipulation2;

/* Problem Description
You are given two integers A and B.
Return 1 if B-th bit in A is set
Return 0 if B-th bit in A is unset
Note:
The bit position is 0-indexed, which means that the least significant bit (LSB) has index 0.


Problem Constraints
1 <= A <= 109
0 <= B <= 30



Example Input
Input 1:
A = 4
B = 1
Input 2:
A = 5
B = 2


Example Output
Output 1:
0
Output 2:
1


Example Explanation
For Input 1:
Given N = 4 which is 100 in binary. The 1-st bit is unset
so we return 0
For Input 2:
Given N = 5 which is 101 in binary. The 2-nd bit is set
so we return 1
 */

import java.util.Scanner;

public class CheckBit {
    static int checkBit(int A, int B){
        int bit = 0;
        if((A & (1<<B)) != 0){
            bit = 1;
        }
        return bit;
    }
    public static void main(String[] args) {
        //int A = 4;
        //int B=1;
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int  val = checkBit(A,B);
        System.out.println(val);
    }
}
