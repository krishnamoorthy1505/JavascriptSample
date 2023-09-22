import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int services = sc.nextInt();
        if(services >= 5){
            System.out.println("Hi "+name+" Elgible for bonus !!!");
        }
        else System.out.println("Hi "+name+" Not Elgible for bonus !!!");

    }
}
