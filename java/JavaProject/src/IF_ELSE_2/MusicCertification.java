import java.util.Scanner;

public class MusicCertification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        if(s<500000){
            System.out.println("NONE");
        }
        else if(s<1000000){
            System.out.println("GOLD");
        }
        else if(s<10000000){
            System.out.println("PLATINUM");
        }
        else if(s>=10000000){
            System.out.println("DIAMOND");
        }
    }
}
