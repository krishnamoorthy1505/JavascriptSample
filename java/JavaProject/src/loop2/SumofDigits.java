import java.util.Scanner;

public class SumofDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        //int ld = 0;
        if(n<0){
            n=-n;
            System.out.println(n);
        }
        for(;n>0;){
            int ld=n%10;
            sum+=ld;
            n=n/10;
        }
        System.out.println(sum);
    }
}