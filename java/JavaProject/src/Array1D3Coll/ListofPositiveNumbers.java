import java.util.ArrayList;

public class ListofPositiveNumbers {
        static ArrayList<Integer> positiveNum(ArrayList<Integer> al){
            ArrayList<Integer> res=new ArrayList<>();

            for(int i=0;i<al.size();i++){
                int val = al.get(i);
                if(val<0){
                    res.add(val);
                }
            }
            return res;
        }
        public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(-4);
        al.add(5);
        al.add(3);
        al.add(8);
        al.add(70);
        al.add(35);
       
        System.out.println(positiveNum(al));


    }

    
}
