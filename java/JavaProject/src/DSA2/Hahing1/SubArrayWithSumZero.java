import java.util.HashSet;
import java.util.Scanner;

public class SubArrayWithSumZero {
    static boolean subArrayWitnSumZero(int[] A){
        int n = A.length;
        HashSet<Integer> hs = new HashSet<>();
        hs.add(0);
        int cs = 0;
        for(int i=0; i<n;i++){
            cs+=A[i];
            System.out.print(cs+ " ");
            if(hs.contains(cs)){
                return true;
            }
            else{
                hs.add(cs);
            }
        }
        return false;
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
        System.out.println();
        boolean res = subArrayWitnSumZero(A);
        System.out.println();
        System.out.println(res);

    }
}
