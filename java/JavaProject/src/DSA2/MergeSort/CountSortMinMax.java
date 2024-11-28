//package DSA2.MergeSort;

public class CountSortMinMax {
    static void countSortRange(int A[]){
        int n =A.length;
        int min = A[0],max = A[0];
        for(int i=0;i<n;i++){
            if(A[i]>max){
                max=A[i];
            }
            else{
                min = A[i];

            }
        }
        System.out.println(min);
        System.out.println(max);
        int freq[] = new int[max-min+1];
        System.out.println(freq.length);
       /*  for(int i=0;i<freq.length;i++){
            int val = A[i];
            freq[val-min]++;
        }
        for(int i=0;i<freq.length;i++){
            System.out.print(freq[i]+" ");
        }
        */ 

    }
    public static void main(String[] args) {

        int A[] = {-3,2,2,1,-4,5,-3};
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        countSortRange(A);
    }
}
