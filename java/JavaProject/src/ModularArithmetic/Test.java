//package ModularArithmetic;

public class Test {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        int arr[] = new int[A.length];
        for(int i=0;i<A.length;i++){
            //System.out.print(arr[A[i]]++);
            
            arr[A[i]] = i;
        }
         System.out.println();
         for(int j=0;j<arr.length;j++){
             A[j] = arr[j];
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]);
        }
    }
}
