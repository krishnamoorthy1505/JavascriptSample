import java.util.Scanner;

public class NaturalnumberReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int i =1;
        while(n>=1){
            System.out.print(n +" "); //n=5  5 4 3 2 1
            n--;
        }
    }
}
