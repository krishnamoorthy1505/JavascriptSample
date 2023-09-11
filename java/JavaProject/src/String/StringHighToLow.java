import java.util.Scanner;

public class StringHighToLow {
    static String upperToLower(String s){
        int i=0;
        String res = "";
        char ch;
        System.out.println(s);
        while(i < s.length()){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                ch = (char)(s.charAt(i)+32);
                res += ch;
            }

            i++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
       System.out.println( upperToLower(s.toUpperCase()));
    }
}
