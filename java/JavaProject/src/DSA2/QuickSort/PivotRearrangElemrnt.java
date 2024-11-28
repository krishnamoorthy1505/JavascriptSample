//package DSA2.QuickSort;

public class PivotRearrangElemrnt {
    public static void swap(int[] A,int i,int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static void pivotRearrangeElement(int[] A){
        int pivot = A[0];
        int i=1,j=1;
        while(i<A.length){
            if(A[i]>pivot){
                i++;
            }
            else{
                swap(A,i,j);
                i++;
                j++;

            }
        }
        swap(A,0,j-1);
        for(int k=0;k<A.length;k++){
            System.out.print(A[k]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int A[] = {54,80,93,17,77,31,44,50,20};
/*         for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
 */        
        pivotRearrangeElement(A);
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }

    }    

}
