import java.util.Scanner;

public class TwoLineStarPattern {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // Loop for N rows
        for (int i = 0; i < N; i++) {
            System.out.print('*');
            // Loop for N-2 columns
            for (int j = 1; j < N - 1; j++) {
                System.out.print(' ');
            }
            System.out.print("*\n");
        }
       
    }

}
