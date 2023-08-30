import java.util.Scanner;

public class InsertElement2 {
        public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int[]Arr=new int[N+1];
        for(int i = 0; i < N; i++){
            Arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        int val = sc.nextInt();
        N=N+1;
        for(int i = N-1;i > pos-1;i--){
            Arr[ i] = Arr[i-1];
        }
        Arr[pos-1] = val;
         for(int i =0 ;i < N; i++){
             System.out.print(Arr[i]+" ");
         }
         
    }
}
