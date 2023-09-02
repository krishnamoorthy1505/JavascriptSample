import java.util.Scanner;

public class UniqueElementAll {
    public static void main(String[] args) {
        
    
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int[]Arr=new int[N];
        for(int i = 0; i < N; i++){
            Arr[i] = sc.nextInt();
        }
        int res[] = new int[Arr.length];
        for(int j=0;j < Arr.length;j++)
        {
            int val = Arr[j];
            int count=0;
            for(int k=0;k<Arr.length;k++){
                if(val == Arr[k]){
                    count++;
                }

            }
            if(count == 1){
                res[j] = val;
            }
            for(int i =0;i<res.length;i++){
                System.out.print(res[i]+" ");
            }
        }

    }
}