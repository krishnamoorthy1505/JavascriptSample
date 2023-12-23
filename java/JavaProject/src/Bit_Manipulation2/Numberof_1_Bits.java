//package Bit_Manipulation2;
/* Problem Description
Write a function that takes an integer and returns the number of 1 bits present in its binary representation.


Problem Constraints
1 <= A <= 109


Input Format
First and only argument contains integer A


Output Format
Return an integer


Example Input
Input 1:
11
Input 2:
6


Example Output
Output 1:
3
Output 2:
2


Example Explanation
Explaination 1:
11 is represented as 1011 in binary.
Explaination 2:
6 is represented as 110 in binary.
 */

import java.util.Scanner;

public class Numberof_1_Bits {
    static boolean checkBit(int A,int B){
        if((A & (1<<B))!=0){
            return true;
        }
        else{
            return false;
        }

        
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        //int B = sc.nextInt();
        int count = 0;
        for(int i=0;i<32;i++){
            if(checkBit(A,i) == true){
                count++;
            }
        }
        System.out.println(" Number of Set Bit ="+count);
    }
    
}
