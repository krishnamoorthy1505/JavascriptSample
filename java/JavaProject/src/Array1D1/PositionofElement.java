//package Array1D1;

import java.util.Scanner;

public class PositionofElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        int m=sc.nextInt();
          int f=0;
        for(int i=0;i<n;i++){
            if(A[i]==m){
               f=i; 
            }
            else if(A[i]!=m){
           // else{
                f=-1;
            }
        }
        System.out.println(f);
    }
    
}
