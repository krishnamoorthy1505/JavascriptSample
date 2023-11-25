/* Problem Description
Given an array A of N integers. Find the sum of bitwise XOR all pairs of numbers in the array.

Since the answer can be large, return the remainder after the dividing the answer by 109+7.



Problem Constraints
1 <= N <= 105

1 <= A[i] < 109



Input Format
Only argument A is an array of integers



Output Format
Return an integer denoting the sum of xor of all pairs of number in the array.



Example Input
Input 1:
A = [1, 2, 3]
Input 2:
A = [3, 4, 2]


Example Output
Output 1:
6
Output 2:
14


Example Explanation
For Input 1:
Pair    Xor
{1, 2}  3
{1, 3}  2
{2, 3}  1
Sum of xor of all pairs = 3 + 2 + 1 = 6.
For Input 2:
Pair    Xor
{3, 4}  7
{3, 2}  1
{4, 2}  6
Sum of xor of all pairs = 7 + 1 + 6 = 14.

 */
import java.util.Scanner;

public class SumofXORofAllPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int [n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(A[i] +" ");
        }
        System.out.println();
        //int set =0;
        //int unset = 0;
        int mod=1000000009;
        int xorSum =0;
        for(int i=0;i<32;i++){
        int set =0;
        int unset = 0;
        
            for(int j=0;j<A.length;j++){
                if((A[j]&(1<<i))!=0){
                    set++;
                }
                else{
                    unset++;
                }
            }
            //System.out.print("i = "+set+" unset= "+unset+" ");
            //System.out.println();
            long pairs = set * unset;
            //System.out.print(pairs+" ");
            //System.out.println();
            //System.out.print(pairs * (1<<i)+" ");
            xorSum += pairs * (1<<i);
            //
            //System.out.print(xorSum+" ");
            //System.out.print(xorSum+" ");
            //System.out.println();
            xorSum = xorSum % mod;
            System.out.print(xorSum+" ");


        }
        xorSum = xorSum % mod;
        System.out.print(xorSum+" ");


    }
    
}
