import java.util.Scanner;

public class FirstAndLastIndex {
    static int[] firstAndLast(int A[],int B){
        int i = 0;
        int n = A.length;
        int fi = -1, li = -1;
        while(i < n){
            if(A[i] == B){
                fi = i;
                break;
            }
            i++;
        }
        for(int j = n-1 ;j > 0;j--){
            //System.out.print(j + " ");
            if(A[j] == B){
                li = j;
                break;
            }
        }
        System.out.println(fi + " "+li);
        int res [] = {fi , li};
        return res;

        }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int[]Arr=new int[N];
        for(int i = 0; i < N; i++){
            Arr[i] = sc.nextInt();
        }
        int m =sc.nextInt();
        int res[] = firstAndLast(Arr,m);
        //System.out.println(res);
        for(int i = 0;i < res.length;i++){
            System.out.print(res[i] + " ");
        }

    }
}
