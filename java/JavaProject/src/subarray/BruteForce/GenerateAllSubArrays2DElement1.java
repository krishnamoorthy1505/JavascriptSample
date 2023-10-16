import java.util.Scanner;

public class GenerateAllSubArrays2DElement1 {
    static int[][] allSubArray(int A[]){
        int n=A.length;
        int slength=n*(n+1)/2;
        int index=0;
        int result[][]=new int[slength][];
        for(int s=0;s<n;s++){
            for(int e=s;e<n;e++){
                //int slen=e-s+1;
                result[index]=new int[e-s+1];
                int size=0;
                for(int k=s;k<=e;k++){
                    System.out.print(index+" "+size+" ");
                    result[index][size]=A[k];
                    size++;
                }
                index++;
            }
        }
        return result;
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        int l = A.length;
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<l;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        int res[][]=allSubArray(A);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }

    
}
