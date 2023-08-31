import java.util.Scanner;

public class PairCount {
    static int checkPairCount(int A[],int v){
        int ans = 0,n=A.length;
        for(int i=0;i < n;i++){
            for(int j = i+1;j < n;j++){
                if(A[i] + A[j] == v){
                    ans++;
                }
            }
        }
        return ans;
    }
    static boolean checkPair(int A[],int v){
        int ans = 0,n=A.length;
        boolean isFlag = false;
        for(int i=0;i < n;i++){
            for(int j = i+1;j < n;j++){
                if(A[i] + A[j] == v){
                    isFlag = true;
                }
            }
        }
        return isFlag;
    }

    
    public static void main(String[] args) {
        
    
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int[]Arr=new int[N];
        for(int i = 0; i < N; i++){
            Arr[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        System.out.println(checkPairCount(Arr,v));
        System.out.println(checkPair(Arr,v));
    }
       
}
