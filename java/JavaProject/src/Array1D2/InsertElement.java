//package Array1D2;

import java.util.Scanner;

public class InsertElement {
        public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int[]Arr=new int[N];
        for(int i = 0; i < N; i++){
            Arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        int val = sc.nextInt();
        int []Arr1=new int[N+1];
        for(int i = 0;i < N+1; i++){
            //System.out.print(i);

            if(i < pos-1){
                Arr1[i]=Arr[i];
                //System.out.print(Arr1[i]);
            }
            else if(i == pos-1){
                Arr1[i] = val;
               //System.out.print(Arr1[i]);

            }
            else{
                Arr1[i] = Arr[i-1];
            }
        }
        for(int i =0 ;i < N+1; i++){
             System.out.print(Arr1[i]+" ");
         }
         
    }
}

