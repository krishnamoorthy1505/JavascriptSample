//package DSA2.QuickSort;
public class QuickSort {
    public static void swap(int[] A ,int i,int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static int partition(int[]A,int si,int ei){
        //System.out.print(A[si]+" si ="+si+" ei="+ei);
        //System.out.println();
        int pivot = A[si];
        int i = si+1,j=si+1;
        while(i<=ei){
            if(A[i]>pivot){
                i++;
            }
            else{
                swap(A,i,j);
                i++;
                j++;
            }
        }
        swap(A,si,j-1);
        return j-1;
    }

    public static void quickSort(int []A,int si,int ei){

        if(si>=ei){
            return;
        }
        int piv_idx=partition(A,si,ei);

        quickSort(A, si, piv_idx-1);

        quickSort(A, piv_idx+1, ei);

        

       
 }
    public static void main(String[] args) {
        int A[] = {20,31,42,5,7,50,11,15,60};
        int ei = A.length-1;
        int si=0;
        for(int i=si;i<ei;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        quickSort(A,si,ei);
         for(int i=si;i<ei;i++){
            System.out.print(A[i]+" ");
        }
    }
    
}
