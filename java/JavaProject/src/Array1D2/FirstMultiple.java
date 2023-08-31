import java.util.Scanner;

public class FirstMultiple {
    static int firstMultiple(int ls[],int x){
        int ans = -1;
        for(int i=0;i < ls.length-1;i++){

        if(ls[i] % x == 0){
            ans = ls[i];
            break;
        }
    }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int[]Arr=new int[N];
        for(int i = 0; i < N; i++){
            Arr[i] = sc.nextInt();
        }
        int m =sc.nextInt();
        System.out.println(firstMultiple(Arr,m));

    }
    
}
