import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1 ;
        while(n >= i){
             System.out.print(i + " ");
             i = i + 2;
            
             // if(i % 2 != 0){
            //     System.out.print(i+ " ");
                
            // }
            // i++;
        }
        
    }
}
