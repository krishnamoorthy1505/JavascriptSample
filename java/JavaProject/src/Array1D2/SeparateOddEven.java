import java.util.Scanner;

public class SeparateOddEven {
        public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        //int [] even=new int[];
        //int odd[]=new int [];
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int A[]=new int[n];
            for(int i=0;i<n;i++){
                int A[i] = sc.nextInt();
            }
            for(int i=0;i<n-1;i++){
                if(A[i]%2 == 0){
                    even[i] = A[i];
                }else{
                    odd[i] =A[i];
                }
            }
        }
        
    }

}
