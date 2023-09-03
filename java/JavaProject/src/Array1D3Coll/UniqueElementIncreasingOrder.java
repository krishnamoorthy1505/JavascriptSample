//package Array1D3Coll;

import java.util.ArrayList;
import java.util.Collections;

public class UniqueElementIncreasingOrder {
            static ArrayList<Integer> uniqueElements(ArrayList<Integer> A){
            //int val = A.get(0);
            ArrayList<Integer> res = new ArrayList<Integer>();
            for(int i=0; i < A.size();i++){
                int count=0;
                int val = A.get(i);

                for(int j =0 ;j<A.size();j++){
                    if(A.get(j) == val){
                    count++;
                }
                }
                
                if(count == 1){
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
        al.add(1);
        ArrayList<Integer> A1=uniqueElements(al);    
        System.out.println(uniqueElements(al));
        Collections.sort(A1);
        System.out.println(A1);

    }


}
