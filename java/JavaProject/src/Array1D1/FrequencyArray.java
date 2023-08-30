//package Array1D1;

import java.util.Scanner;

public class FrequencyArray {
    static int frequency(int a[],int k){
        int length=a.length;
        int count=0;
        for(int i=0;i<length;i++){
            if(a[i] == k){
                count++;
            }
        }
        return count;
    }
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k = sc.nextInt();
        int a[]={1,4,6,4,8,6};
        int ct=frequency(a,k);
        System.out.println(ct);
   } 
}
