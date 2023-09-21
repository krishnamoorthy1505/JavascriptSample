import java.util.Scanner;

public class MaxThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp = a>b?a:b;
        int max = c>temp?c:temp;
        System.out.println(max);
    }
}
