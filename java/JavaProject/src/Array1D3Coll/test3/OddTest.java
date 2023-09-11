//package test3;

import java.util.ArrayList;
import java.util.Collections;
public class OddTest {

    static ArrayList<Integer> oddNumber(ArrayList<Integer> A){
                    int n = A.size();
        ArrayList<Integer> res=new ArrayList();
        for(int i=0;i<n;i++){
            int val = A.get(i);
            System.out.println(val);
            int odd=0;
            if(val<0){
                System.out.println("1");
                if(val % 2 !=0){
                    //odd=val;
                    res.add(val);

                }
            }
        }
        Collections.sort(res);
        return res;

        }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(-5);
        al.add(3);
        al.add(-8);
        al.add(-7);
        al.add(1);
        
        System.out.println(oddNumber(al));

    }

}
