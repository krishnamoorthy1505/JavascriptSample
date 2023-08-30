//package Array1D1;

import java.util.Scanner;

public class MaxofArray {
    static int maxElement(int max[]){
            int res=0;

            int l=max.length;
            for(int i=0;i<l;i++){
                if(res < max[i]){
                    res=max[i];
                }
            }
            return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max[]=new int[n];
        for(int i=0;i<max.length;i++){
            max[i]=sc.nextInt();
        }
        System.out.println(maxElement(max));
    }
}
