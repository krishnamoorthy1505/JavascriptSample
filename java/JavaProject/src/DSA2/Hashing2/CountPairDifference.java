import java.util.HashMap;
import java.util.Scanner;

public class CountPairDifference {
    static int countPairDiff(int A[],int B){
        int n = A.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int )
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("Enter the value B");
        int B = sc.nextInt();
        System.out.println();
        int res = countPairDiff(A,B);
        System.out.println();
        System.out.println(res);

    }

    
}
