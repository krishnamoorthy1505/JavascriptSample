import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int[]Arr=new int[N];
        for(int i = 0; i < N; i++){
            Arr[i] = sc.nextInt();
        }
        int[] res = new int[N];
        for(int i = 0;i < N;i++){
            int val = Arr[i];
            if(val % 2 == 0){
                res[i] = Arr[i];
            }
        }
        for(int i=0 ; i < N;i++){
            System.out.print(res[i] +" ");
        }
 
    }
    
}
