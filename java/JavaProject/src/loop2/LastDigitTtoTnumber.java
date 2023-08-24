//package loop2;

import java.util.Scanner;

public class LastDigitTtoTnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T-- > 0){
            int n=sc.nextInt();
            System.out.println(n%10);
        }
    }
    
}
