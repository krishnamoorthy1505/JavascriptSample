//package DSA1.InterviePBM1;

public class ContinuousSum {
    public static void main(String args[]){
        int A=5;
        int[][] B={{1,2,10},{2,3,20},{2,5,25}};
        ///B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]

        int[] A1 = new int[A];
        int n = B.length;
        //int m = B[0].length;
        for(int i=0;i<n;i++){
            int s = B[i][0]-1;
            int e = B[i][1]-1;
            int v = B[i][2];
            System.out.println("s="+s+",e="+e+",v="+v);

            

            A1[s]+=v;
            if((e+1) < A1.length){
                A1[e+1]+=-v;
            }
            
        }
        for(int i=1;i<A1.length;i++){
            A1[i]=A1[i-1]+A1[i];
        }
        for(int i=0;i<A1.length;i++){
            System.out.print(A1[i]+" ");
        }



    }
}
