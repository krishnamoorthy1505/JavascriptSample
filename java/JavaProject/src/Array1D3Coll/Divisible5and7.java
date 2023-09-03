import java.util.ArrayList;
import java.util.Scanner;

public class Divisible5and7 {
        static ArrayList<Integer> divisible(ArrayList<Integer> al){
            ArrayList<Integer> res=new ArrayList<>();
            for(int i=0; i < al.size();i++){
                int val=al.get(i);
                if(val%5==0 && val%7==0){
                    res.add(val);
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
        al.add(70);
        al.add(35);
       
        System.out.println(divisible(al));


   // }
    }

}
