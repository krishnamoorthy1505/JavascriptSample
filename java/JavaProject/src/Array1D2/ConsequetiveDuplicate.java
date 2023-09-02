import java.util.Scanner;

public class ConsequetiveDuplicate {
    static boolean conDuplicate(int[] arr){
    int n = arr.length;
    boolean isVal = true;
    int count = 0;
    for(int i=0;i < n;i++){
       int val = arr[i];
       if(arr[i] == val){
           count++;
       }
       if(count == 2){
               isVal = false;
               break;
       
       }
       
    }
    return isVal;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int[]Arr=new int[N];
        for(int i = 0; i < N; i++){
            Arr[i] = sc.nextInt();
        }
        //int m =sc.nextInt();
        System.out.println(conDuplicate(Arr));

    }
}
