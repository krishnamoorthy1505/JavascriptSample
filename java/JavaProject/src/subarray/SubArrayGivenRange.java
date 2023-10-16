//package subarray;

public class SubArrayGivenRange {
    
    public static void main(String args[]){
        int A[] = {4,3,2,6};
        int n = A.length;
        int B = 1;
        int C = 3;
        int rs[]=new int[C-B+1];
                int j=0;
                for(int k=B;k<=C;k++){
                    rs[j]=A[k];
                    j++;
                }
              for(int i=0;i<rs.length;i++) {
                System.out.print(rs[i]+" ");
              }
        
    }
    
}
