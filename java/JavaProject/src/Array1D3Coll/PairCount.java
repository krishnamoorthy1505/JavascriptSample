package Array_1D_3Coll;
//package Array1D3Coll;

import java.util.ArrayList;
import java.util.Scanner;

public class PairCount {
    static int pairCount(ArrayList<Integer> A,int B){
        int ans=0;
        int n = A.size();
        for(int i=0;i<n;i++){
            for(int j=i+1;j < n;j++){
                if(A.get(i)+A.get(j) == B){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
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
        System.out.println(pairCount(al,B));


    }
}
