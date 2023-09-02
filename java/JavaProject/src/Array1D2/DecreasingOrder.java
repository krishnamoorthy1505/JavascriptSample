import java.util.Scanner;

public class DecreasingOrder {
    static int decrease(int[] A){
        int n = A.length;
        for(int i =0;i<n-1;i++){
           if(A[i] < A[i+1]){
                return 0;
           }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int[]Arr=new int[N];
        for(int i = 0; i < N; i++){
            Arr[i] = sc.nextInt();
        }
        System.out.println(decrease(Arr));

    }
}
