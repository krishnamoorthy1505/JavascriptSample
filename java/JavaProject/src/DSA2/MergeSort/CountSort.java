//package DSA2.MergeSort;

public class CountSort {
    static void countSort(int A[]){
        int c0=0,c1=0,c2=0;
        for(int i=0;i<A.length;i++){
            if(A[i] == 0)
                c0++;
            else if(A[i] == 1){
                c1++;
            }
            else 
                c2++;



        }
        for(int k=1;k<=c0;k++)
        System.out.print(0+" ");
        for(int k =1;k<=c1;k++)
        System.out.print(1+" ");
        for(int k=1;k<=c2;k++)
        System.out.print(2+" ");
        
    }
    public static void main(String[] args) {
        int A[] = {1,2,0,0,1,0,2,0,1,2,1};
        countSort(A);
        //System.out.println(A.length);
    }
}
