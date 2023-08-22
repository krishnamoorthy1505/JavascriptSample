import java.util.Scanner;

public class EvenNumberReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int i = 0;
        while(n >= 0){
            System.out.print(n+ " ");
            n = n-2;
            //n--;
        }
    }
}
