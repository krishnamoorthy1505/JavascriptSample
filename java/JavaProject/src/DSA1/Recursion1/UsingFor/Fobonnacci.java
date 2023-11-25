import java.util.Scanner;

public class Fobonnacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 0 ;
        int n2 = 1;
        System.out.print(n1+" "+n2+" ");
        int res = 0;
        for(int i=2;i<=n;i++){
            res = n1+n2;
            System.out.print(res+" ");
            n1 = n2;
            n2 = res;
        }
    }


}
