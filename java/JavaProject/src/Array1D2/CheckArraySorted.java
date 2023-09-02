import java.util.Scanner;

public class CheckArraySorted {
    static int checkSorted(int A[]){
        int n = A.length;
        int i = 0;
        while(i < n-1){
            if(A[i] > A[i+1]){
                return 0;
            }
            i++;
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
        System.out.println(checkSorted(Arr));

    }
    
}
