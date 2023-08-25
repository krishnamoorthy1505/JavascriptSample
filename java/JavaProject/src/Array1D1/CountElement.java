//package Array1D1;

import java.util.Scanner;

public class CountElement {
    static int max(int a[]){
        int res=0;
        for(int i=0;i<a.length;i++){
            if(res<a[i]){
                res=a[i];
            }
        }
        return res;
    }
    static int frequency(int a[],int k){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==k){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int max=max(a);
        System.out.println("Maximum element in the array ="+max);
        int f=frequency(a,max);
        System.out.println("Frequency ="+f);
        System.out.println(a.length-f);
    }
}
