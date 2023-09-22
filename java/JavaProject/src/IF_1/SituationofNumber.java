import java.util.Scanner;

public class SituationofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 0){
            if(num %2 == 0){
                System.out.println("Positive Even Number");
            }
            else System.out.println("Positive Odd Number");
        }
        else{
            if(num % 2 == 0){
                System.out.println("Negative Even number");
            }
            else{
                System.out.println("Negative Odd Number");
            }
        }
    }
}
