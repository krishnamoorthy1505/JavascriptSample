
import java.util.Scanner;

public class PrimeCount1 {
        public static boolean isPrime(int A){
        int fact=0;
        for(int i=1;i<=A;i++){
            if(A%i == 0){
                fact++;
            }
        }
        if(fact == 2){
            return true;
        }else{
            return false;
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int cnt=0;
        for(int i=2;i<=A;i++){
        if(isPrime(i) == true){
            cnt++;
        }
        //int c = isPrime(A);
        //int c = countFactors(A);
        }
        System.out.println(cnt);

    }

}
