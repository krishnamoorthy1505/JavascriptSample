//package Prefixsum;

public class EquilibriumIndex {
    static int[] prefixSum(int[] A){
        int n =A.length;
        int[]ps=new int[n];
        ps[0]=A[0];
        for(int i=1;i<n;i++){
            ps[i] = ps[i-1]+A[i];
        }
        return ps;
    }
    static int equilibrumIndex(int A[]){
         int[] ps = prefixSum(A);

         int n = A.length;
         int count = 0;
         for(int i=0;i<n;i++){
             int ls=0;
             if(i>0){
                 ls=ps[i-1];
             }
             int rs = ps[n-1] - ps[i];
             if(ls == rs){
                 count++;
             }
         }
         return count;

    }

    public static void main(String[] args) {
        //int A[] = {-7, 1, 5, 2, -4, 3, 0};
        int A[] = {1, 0, -2, 4, -3,0};

        int c  = equilibrumIndex(A);
        if(c == 0){
            System.out.println(-1);
        }else{
            System.out.println(c);
        }

    }
}
