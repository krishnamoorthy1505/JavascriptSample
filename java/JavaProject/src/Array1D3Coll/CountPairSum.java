package Array_1D_3Coll;
//package Array1D3Coll;

import java.util.ArrayList;
import java.util.Scanner;

public class CountPairSum {
    static int pairSum(ArrayList<Integer> A,int B){
        int res=0;
        for(int i=0;i < A.size();i++){
            for(int j=i+1;j < A.size();j++){
                if(A.get(i)+A.get(j) == B){
                    res=1;
                    return res;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        //public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(5);
        al.add(3);
        al.add(8);
        al.add(7);
        al.add(1);
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        System.out.println(pairSum(al,B));


   // }
    }
}
