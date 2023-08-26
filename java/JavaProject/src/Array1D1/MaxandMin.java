import java.util.Scanner;

public class MaxandMin {
    static int maxElement(int[] A){
        int res=Integer.MIN_VALUE;
        //int res=0;
        for(int i=0;i<A.length;i++){
            if(res < A[i]){
                res=A[i];
            }
        }
        return res;
    }
    static int minElement(int[] A){
        int res=Integer.MAX_VALUE;
            for(int i=0;i<A.length;i++){
            if(res > A[i]){
                res = A[i];
            }
        }
        return res;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
            
        }
        int max = maxElement(A);
        int min = minElement(A);
        System.out.print(max+" "+min);
    
    }
}
