import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A= sc.next();
        String rev = "";
        for(int i= A.length()-1;i>=0;i--){
            rev+=A.charAt(i);

        }
        if(A.equals(rev)){
            System.out.println("Palindrom");
        }else{
            System.out.println(" not Palindrom");
 
        }
    }
    
}
