//package Function1;

import java.util.Scanner;

public class MathFunction {
    static void checkFloor(int A){
        double res = A/200d;
        System.out.println(res);
        System.out.println("Floor = "+ Math.floor(res));
        System.out.println("Ceil = "+ Math.ceil(res));

        //return Math.floor(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        checkFloor(A);
    }
}
