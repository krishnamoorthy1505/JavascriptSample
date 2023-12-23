public class SumOfEvenNumber {
    static int[] prefixSum(int[] A){
        int n = A.length;
        int[] ps = new int[n];
        /* if(A[0]%2 == 0){
            ps[0] = A[0];
        }
        else {
            ps[0] = 0;
        } */
        ps[0] = A[0];
        for(int i=1;i<n;i++){
            if(i%2==0){
                ps[i] = ps[i-1]+A[i];
            }
            else{
                ps[i] = ps[i-1];
            }
        }
        return ps;
    }
    static int[] sumofEven(int ps[],int[][] B) {
        int n = B.length;
        int rs[] = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            int l=B[i][0];
            int r=B[i][1];
            if(l==0){
                sum=ps[r];
                System.out.println("l=0"+sum);
            }
            else{
                sum=ps[r]-ps[l-1];
                System.out.println("l!=0"+sum);

            }
            rs[i]=sum;
            
        }

        return rs;
    }
    public static void main(String[] args) {
        //int[] A = {2,1,8,3,9};
        int[] A={16,3,3,6,7,8,17,13,7};
        int B[][] = {{2,6},{4,7},{6,7}};
        int ps[] = prefixSum(A);

        System.out.println("Prefix Sum");
        for(int i=0;i<ps.length;i++){
            System.out.print(ps[i]+" ");
        }
        int B1=B.length;
        int se[]=sumofEven(ps,B);
        System.out.println("Sum of Even");
        for(int i=0;i<se.length;i++)
            System.out.print(se[i]+" ");


    }
    
}
