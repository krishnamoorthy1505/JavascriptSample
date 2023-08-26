import java.util.Scanner;

public class TemperatureDifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int temp[] = new int[N];
        for(int i=0;i<N;i++){
            temp[i]=sc.nextInt();
        }
        int res=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<N;i++)
        {
            if(res < temp[i]){
                res=temp[i];
            }
            // if(min > temp[i]){
            //     min=temp[i];
            // }
            else{
                min=temp[i];
            }


        }
        // for(int i=0;i<N;i++){
        //     if(res>temp[i]){
        //         min=temp[i];
        //     }

        // }
       // System.out.println(res);
        //System.out.println(min);
       
        System.out.println(res-min);

        
     }
}
