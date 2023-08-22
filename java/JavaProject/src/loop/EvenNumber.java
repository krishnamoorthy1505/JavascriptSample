import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        while(i <= n){
            System.out.print(i+" "); //n=10  o/p= 2 4 6 8 10
            i = i + 2;
        }
        
    }
}
