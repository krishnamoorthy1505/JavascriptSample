import java.util.Scanner;

public class EvenOddElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-- > 0){
            int N=sc.nextInt();
            int A[]=new int[N];
            for(int i=0;i<N;i++){
                A[i]=sc.nextInt();
            }
            int countE=0,countO=0;
            for(int i=0;i<N;i++){
                if(A[i]%2==0){
                    countE++;
                }
                else{
                    countO++;
                }
            }
            System.out.println(countE);
            System.out.println(countO);

            System.out.println(Math.abs(countE-countO));

        }
    }
    
}
