//package Function1;

import java.util.Scanner;

public class CountOfDigit {
    static int countDigit(int A){
        int count=0;
        while(A>0){
            int ld = A%10;
            A = A / 10;
            count++;
        }
        return count;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    System.out.println(countDigit(A));
}
    
}
