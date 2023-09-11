import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    //String res="";
    //int n = s.length();
    int n = s.length();
    String res = "";
    res = res + s.charAt(0);
    for(int i=1;i<n;i++){
        if(s.charAt(i) == s.charAt(0)){
            res = res + '$';
        }
        else{
            res = res + s.charAt(i);
        }

    }
            System.out.println(res);

    }
}