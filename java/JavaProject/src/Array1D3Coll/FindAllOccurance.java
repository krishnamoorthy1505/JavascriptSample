import java.util.ArrayList;
import java.util.Scanner;

public class FindAllOccurance {
        static ArrayList<Integer> findOccurance(ArrayList<Integer> al,int B){
            //int res[]=new int[al.size()];
            ArrayList<Integer> res = new ArrayList<>();

            for(int i=0;i<al.size();i++){
                int val=al.get(i);
                if(val == B){
                    res.add(i);
                }
            }
            return res;
        }
        public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(5);
        al.add(2);
        al.add(8);
        al.add(7);
        al.add(5);
        Scanner sc = new Scanner(System.in);
        int m =  sc.nextInt();
        ArrayList<Integer> a=findOccurance(al,m);
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }
       
        //System.out.println(primeNumber(al));


    }

}
