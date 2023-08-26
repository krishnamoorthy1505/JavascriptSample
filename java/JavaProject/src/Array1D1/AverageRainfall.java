import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] rainFall=new int[N];
        for(int i=0;i<N;i++){
            rainFall[i]=sc.nextInt();
        }
        int sum=0;
        int count=0;
        for(int i=0;i<N;i++){
            sum+=rainFall[i];
            count++;
        }
        double avgRainFall=(double) sum/N;
       // System.out.println(avgRainFall);
       // System.out.println(Math.floor(avgRainFall));

        System.out.println((int)Math.floor(avgRainFall));

    }
    
}
