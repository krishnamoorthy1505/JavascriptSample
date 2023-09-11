import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A= sc.next();
        String rev = "";
        for(int i= A.length()-1;i>=0;i--){
            rev+=A.charAt(i);

        }
        System.out.println(rev);
    }
}
