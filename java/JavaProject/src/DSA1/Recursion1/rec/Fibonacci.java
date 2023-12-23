import java.util.Scanner;

public class Fibonacci {
    static int findFibonacci(int n){
        if(n==0 || n==1){
            return n;
        }

        int a=findFibonacci(n-1);
        int b=findFibonacci(n-2);
        //System.out.print((a+b)+" ");
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fib = findFibonacci(n);
        //
        System.out.print(fib+" ");
    }
}
