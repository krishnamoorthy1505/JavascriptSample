//package Array1D3Coll;

import java.util.ArrayList;

public class OddNumber {
    static ArrayList<Integer> oddNumber(ArrayList<Integer> A){
        int n = A.size();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i < n;i++){
           int val = A.get(i);
           if(val % 2 !=0){
                res.add(val);
           }
        }
        return res;
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
        
        System.out.println(oddNumber(al));

    }
    
}
