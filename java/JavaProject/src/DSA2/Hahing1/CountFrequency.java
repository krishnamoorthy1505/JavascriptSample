/* Q1. Frequency of element query
Solved

Problem Description
Given an array A. You have some integers given in the array B.
For the i-th number, find the frequency of B[i] in the array A and return a list containing all the frequencies.


Problem Constraints
1 <= |A| <= 105
1 <= |B| <= 105
1 <= A[i] <= 105
1 <= B[i] <= 105


Input Format
First argument A is an array of integers.
Second argument B is an array of integers denoting the queries.


Output Format
Return an array of integers containing frequency of the each element in B.


Example Input
Input 1:
A = [1, 2, 1, 1]
B = [1, 2]
Input 2:
A = [2, 5, 9, 2, 8]
B = [3, 2]


Example Output
Output 1:
[3, 1]
Output 2:
[0, 2]


Example Explanation
For Input 1:
The frequency of 1 in the array A is 3.
The frequency of 2 in the array A is 1.
For Input 2:
The frequency of 3 in the array A is 0.
The frequency of 2 in the array A is 2.

 */


//package DSA2.Hahing1;



import java.util.HashMap;
import java.util.Scanner;

public class CountFrequency {
    static void solve(int A[],int[] B){
        int n = A.length;
        int m = B.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i < n ;i++){
            if(map.containsKey(A[i])){
                int freq = map.get(A[i]);
                map.put(A[i],freq+1);
            }
            else{
                map.put(A[i],1);
            }
        }
        //find the answer of every query
        for(int i=0;i<m;i++){
            if(map.containsKey(B[i])==true){
                System.out.println(map.get(B[i]));
            }
            else {
                System.out.println(0);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("A length");
        int[] A = new int[n];
        System.out.println("Enter the A Elements");
        for(int i = 0;i < n;i++){
            A[i] = sc.nextInt();
        }
        for(int i=0;i < A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.println("No of Element B");
        int m = sc.nextInt();
``        int[] B  = new int[m];
        System.out.println("Enter the Query B");
        for(int i = 0;i < m;i++){
            B[i] = sc.nextInt();
        }
        for(int i=0;i < B.length;i++){
            System.out.print(B[i]+" ");
        } 
        System.out.println();
        solve(A,B);
    
    }
}
