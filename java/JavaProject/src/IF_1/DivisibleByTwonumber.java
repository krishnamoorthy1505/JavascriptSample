//package IF_1;

import java.util.Scanner;

public class DivisibleByTwonumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A%5 == 0 && A%11 == 0){
            System.out.println("1");
        }else System.out.println("0");
    }
    
}
