import java.util.Scanner;

public class InsertElement1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int[]Arr=new int[N+1];
        for(int i = 0; i < N; i++){
            Arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();

        
        int val = sc.nextInt();
        N=N+1;
       // for(int i= 0;i<pos-1;i++ ){
         for(int i=pos-1;i < N-1;i++){
             Arr[i] = Arr[i];
         }
        
        Arr[pos-1] = val;
         for(int i =0 ;i < N; i++){
             //System.out.println(" length ="+N.length);
             System.out.print(Arr[i]+" ");
         }
    }
    
}
