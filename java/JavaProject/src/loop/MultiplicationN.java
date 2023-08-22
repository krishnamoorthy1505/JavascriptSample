import java.util.Scanner;

public class MultiplicationN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1 ;
        while(10>=i){
            System.out.println(n+" *  "+i+" = "+i * n );
            i++;
        }
    }
}
