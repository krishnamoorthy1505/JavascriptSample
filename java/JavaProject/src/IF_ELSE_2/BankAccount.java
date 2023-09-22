/* Problem Description
You are given a Bank account having N amount and you are asked to perform ADD(credit) or SUBTRACT(debit) operation of an amount X.

After the operation print the amount left in the Bank account. If the debit amount is greater than current balance print "Insufficient Funds"(without quotes) and the operation is skipped.



Problem Constraints
1 <= N, X <= 105


Input Format
First line contains a single integer N denoting the balance in bank account.

Next line contains two space separated integers Type and Amount(X).

If Type == 1, Perform ADD operation.
If Type == 2, Perform SUBTRACT operation.

 */

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        if(T==1){
            N=N+A;
            System.out.println(N);
        }else{
            if(N<A){
                System.out.println("Insufficient Fund");
            }else{
                N=N-A;
                System.out.println(N);
            }
        }

        
    }
    
}
