import java.util.ArrayList;
import java.util.Scanner;

public class OddElement {
        public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        int m =A.get(0).size();
        ArrayList <ArrayList<Integer>> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList <Integer> even = new ArrayList<>();
            for(int j=0;j<m;j++){
                int val = A.get(i).get(j);
                if(val%2!=0){
                    even.add(val);
                }

            }
            res.add(even);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> mat=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> res = new ArrayList<>();
            for(int j=0;j<m;j++){
                int n1=sc.nextInt();
                res.add(n1);
            }
            mat.add(res);
        }
        //System.out.println(mat);
        System.out.println(solve(mat));
        
    }
    
        
}
    

