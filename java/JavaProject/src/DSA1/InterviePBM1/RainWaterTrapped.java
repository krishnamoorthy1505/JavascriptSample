import java.util.Scanner;

public class RainWaterTrapped {
    static int[] prefixMax(int[] A){
        int n=A.length;
        int pm[] = new int[n];
        pm[0]=A[0];
        for(int i=1;i<n;i++){
            pm[i]=Math.max(pm[i-1],A[i]);
        }
        return pm;
    }
    static int[] suffixMAx(int[] A){
        System.out.println("S");
        int n=A.length;
        int[]sm=new int[n];
        sm[n-1]=A[n-1];
        for(int i=n-2;i>=0;i--){
            sm[i]=Math.max(A[i],sm[i+1]);
        }
        return sm;

    }
    public static int trap(final int[] A) {
        int n=A.length;
        int[]pm=prefixMax(A);
        System.out.println("Prefix Max");
        for(int i=0;i<pm.length;i++){
            System.out.print(pm[i]+" ");
        }
        System.out.println("Prefix Max");

        int[]sm=suffixMAx(A);
        System.out.println("Suffix Max");

        for(int i=0;i<sm.length;i++){
            System.out.print(sm[i]+" ");
        }


        int ans=0;
        for(int i=1;i<A.length-1;i++){
            int lb = pm[i-1];
            int rb = sm[i+1];
            int min = Math.min(lb,rb);
            int amt = min - A[i];
            if(amt>0){
                ans+=amt;
            }
        }
    return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Array Element");

        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();


        int n1 = trap(A);
        System.out.println();
        System.out.println(n1);
    }

    
}
