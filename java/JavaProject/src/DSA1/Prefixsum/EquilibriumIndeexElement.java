import java.util.Scanner;

public class EquilibriumIndeexElement {
        static int[] prefixSum(int[] A){
        int n=A.length;
        int ps[]=new int[n];
        ps[0]= A[0];
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+A[i];
        }
    return ps;
    }
    static int[] equilibrumIndex(int[] A){
       
       int ps[] = prefixSum(A);
       int rs1[] = new int[ps.length];
        for(int j=0;j<ps.length;j++){
            System.out.print(ps[j]+" ");
        }
        int n = ps.length;
        int index=-1;
        for(int i=0;i<n;i++){
            int ls=0;
            if(i>0){
                ls=ps[i-1];
            }
            int rs=ps[n-1]-ps[i];
            if(rs==ls){
                rs1[i]=ps[i];
            }
        }
       return rs1;
        
    }
    public static void main(String[] args) {
        //int A[] = {-7, 1, 5, 2, -4, 3, 0};
        //int A[] = {1, 0, -2, 4, -3,0};
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        for(int j=0;j<n;j++){
        System.out.print(A[j]+" ");
        }
        System.out.println();

        int ei[]  = equilibrumIndex(A);

        System.out.println();
        for(int i=0;i<ei.length;i++)
            System.out.print(ei[i]);

    }

}
