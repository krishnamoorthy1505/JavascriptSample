public class SumofOddIndices {
    static int[] prefixOsum(int[] A){
        int n = A.length;
        int ps[]=new int[n];
        ps[0]=0;
        for(int i=1;i<n;i++){
            if(i%2!=0){
                ps[i]=ps[i-1]+A[i];
            }
            else{
                ps[i]=ps[i-1];
            }
        }
        return ps;
    }
    static int[] oddSum(int A[],int B[][]){
        int n = B.length;
        int os[]=new int[n];
        for(int i=0;i<n;i++){
            int l = B[i][0];
            int r = B[i][1];
            if(l==0){
                os[i]=A[r];
            }
            else{
                os[i]=A[r]-A[l-1];
            }
        }
        return os ;
    }
    public static void main(String[] args) {
        int A[]={1,2,3,4,5};
        int B[][]={{0,2},{1,4}};
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        int[] ps=prefixOsum(A);
        for(int i=0;i<ps.length;i++){
            System.out.print(ps[i]+" ");
        }
        System.out.println();
        int sum[]=oddSum(ps,B);
        for(int i=0;i<sum.length;i++){
            System.out.print(sum[i]+" ");
        }
    }
    
}
