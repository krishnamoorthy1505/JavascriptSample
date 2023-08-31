import java.util.Scanner;

public class SepearateOddEven {
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
            int cntO=0,cntE=0;
            for(int i=0;i<n;i++){
                
                 A[i] = sc.nextInt();
                if(A[i]%2 == 1){
                    cntO++;
                }
                else {
                    cntE++;
                }
            }
            int B[] = new int[cntO];
            int C[] = new int[cntE];
            int ptrB=0,ptrC=0;
            for(int i=0;i<n;i++){
                if(A[i]%2 == 1){
                    B[ptrB] = A[i];
                    ptrB++;
                }
                else{
                    C[ptrC] = A[i];
                    ptrC++;
                }

            }
            for(int i=0;i<cntO;i++){
                System.out.print(B[i]+" ");

            }
            System.out.println();

            for(int i=0;i<cntE;i++){
                 System.out.print(C[i]+" ");

            }
            System.out.println();

        }
        
    }
}
