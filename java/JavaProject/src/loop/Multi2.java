import java.util.Scanner;

public class Multi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1 ;
        while(i * 2 <= n){
            System.out.print(i * 2+" ");
            //i+=2; 2 6 10 14 18
            i++; // n=10 2 4 6 8 10
        }
        
    }
}
