import java.util.Scanner;

public class GenerateAllSubArrayReturn2DArray {
        static int[][] subArray(int A[]){
            int n=A.length;
            int result[][]=new int[(n*(n+1))/2][];
            int index=0;
            for(int s=0;s<n;s++){
                for(int e=s;e<n;e++){
                    int l=e-s+1;
                    int subArr[]=new int[l];
                    for(int k=s;k<=e;k++){
                        //subarr[k]=A[k] Array index out of bound exception 1;
                        //subarray start index index[0] 
                        //but this condition subarray[k=1] error 

                        subArr[k-s]=A[k]; 
                    }
                    result[index++]=subArr;
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
        int res[][]=subArray(A);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

}
