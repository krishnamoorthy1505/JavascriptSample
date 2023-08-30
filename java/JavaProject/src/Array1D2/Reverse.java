//package Array1D2;

import java.util.Scanner;

public class Reverse {
    static int[] reverse(int[] Arr){
        //System.out.println("1");
        int i = 0,j = Arr.length-1;
        while(i < j){
            int temp = Arr[i];
            Arr[i] = Arr[j];
            Arr[j] = temp;
            i++;
            j--;
        }
        //System.out.println(Arr.length);
        return Arr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int[]Arr=new int[N];
        for(int i = 0; i < N; i++){
            Arr[i] = sc.nextInt();
        }
        // for(int i=0;i < Arr.length; i++){
        //     System.out.print(Arr[i]+" ");
        // }
        // System.out.println();
        int[] rev = reverse(Arr);
        System.out.println(rev.length);
        for(int i=0;i < rev.length; i++){
            System.out.print(rev[i]+" ");
        }
    }
    
}
