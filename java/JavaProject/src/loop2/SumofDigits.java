import java.util.Scanner;

public class SumofDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int ld = 0;
        // while(n>0){
        //     ld=n%10;
        //     sum+=ld;
        //     n=n/10;
        // }
        for(;n>0;){
            ld=n%10;
            sum+=ld;
            n=n/10;
        }
        System.out.println(sum);
    }
}