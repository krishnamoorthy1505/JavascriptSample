//package IF_ELSE_2;

import java.util.Scanner;

public class MaxofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(A>B && A>C){
            System.out.println("A is Maximum = "+A);
        }
        else if(B>A && B>C){
            System.out.println("B is Maximum = "+B);
        }
        else System.out.println("C is Maximum = "+C);
    }
}
