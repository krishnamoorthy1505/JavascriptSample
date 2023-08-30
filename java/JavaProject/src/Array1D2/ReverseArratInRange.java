import java.util.Scanner;

public class ReverseArratInRange { 
    static int[] reverseRange(int A[],int s,int e){
        int i=s,j=e;
        System.out.println(i+""+e);
        while(i < j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        System.out.println(A.length);
        return A;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int[]Arr=new int[N];
        for(int i = 0; i < N; i++){
            Arr[i] = sc.nextInt();
        }
        int start =  sc.nextInt();
        int end =  sc.nextInt();

     2   Arr=reverseRange(Arr, start , end);
        System.out.println(Arr.length);
        for(int i=0;i<Arr.length;i++){
            System.out.print(Arr[i]+" ");
        }
    }
}
