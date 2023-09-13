//package IF_1;

import java.util.Scanner;

public class MinofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B =sc.nextInt();
        if(A<B){
            System.out.println(A);
        }else
        System.out.println("B"+B*A);
    }
}
