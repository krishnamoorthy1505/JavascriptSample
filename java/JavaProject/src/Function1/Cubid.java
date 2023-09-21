//package Function1;

import java.util.Scanner;

public class Cubid {
    static int cubid(int a,int b,int c){
        int res = a * b * c;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(cubid(a,b,c));
    }
}
