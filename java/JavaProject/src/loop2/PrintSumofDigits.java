import java.util.Scanner;

public class PrintSumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
       // int sum = 0;
        while(T-- > 0){
            int n = sc.nextInt();
            int sum = 0;

            while(n>0){
                int ld = n % 10;
                sum = sum + ld;
                n = n / 10;
            }
            System.out.println(sum);
        }
    }
}
