/* Problem Description
Say you have an array, A, for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Return the maximum possible profit.



Problem Constraints
0 <= A.size() <= 700000
1 <= A[i] <= 107



Input Format
The first and the only argument is an array of integers, A.


Output Format
Return an integer, representing the maximum possible profit.


Example Input
Input 1:
A = [1, 2]
Input 2:

A = [1, 4, 5, 2, 4]


Example Output
Output 1:
1
Output 2:

4


Example Explanation
Explanation 1:
Buy the stock on day 0, and sell it on day 1.
Explanation 2:

Buy the stock on day 0, and sell it on day 2.
 */

//package TC;

public class BuyandSellStockProfitRight {
    static int maxProfit(int A[]){
        int n=A.length;
        int maxProfit=0;
        int lmin=A[n-1];
        for(int i=n-2;i>=0;i--){
            int profit=A[i]-lmin;
            if(profit>maxProfit){
                maxProfit=profit;
            }
            if(A[i]<lmin){
                lmin=A[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int A[]={1,4,5,2,4};
        int max = maxProfit(A);
        System.out.println(max);

    }
}
