import java.util.Scanner;

public class NumericStairPattern {
        public static void main(String[] args) {
//There should be no extra spaces after last integer and before first integer in any row.
//All integers in any row in the pattern are space separated.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
                if(j!=i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
