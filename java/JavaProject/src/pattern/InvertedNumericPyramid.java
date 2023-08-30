import java.util.Scanner;

public class InvertedNumericPyramid {
        public static void main(String[] args) {

        //NOTE: There should be no extra spaces after last integer and before first integer in any .
         //All integers in any row in the pattern are separated by a single space.


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j);
                if(j!=n-i+1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
