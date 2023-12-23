//package Bit_Manipulation3;
/* Problem Description
Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.

NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?



Problem Constraints
1 <= |A| <= 2000000

0 <= A[i] <= INTMAX



Input Format
The first and only argument of input contains an integer array A.



Output Format
Return a single integer denoting the single element.



Example Input
Input 1:

 A = [1, 2, 2, 3, 1]
Input 2:

 A = [1, 2, 2]


Example Output
Output 1:

 3
Output 2:

 1


Example Explanation
Explanation 1:

3 occurs once.
Explanation 2:

1 occurs once.
 */

import java.util.Scanner;

public class SingleNumber_NewLogic {
    static int singleNumber(int[] A){
        int ans = 0;
        
        for(int i=0;i<32;i++){
            int count = 0;
            for(int j=0;j<A.length;j++){
                if( (A[j] & (1<<i))!=0){
                    count++;
                }
            }
            if(count%2 == 1){
                ans |=(1<<i);
            }

        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();

        int res = singleNumber(A);
        System.out.println(res);


    }
}
