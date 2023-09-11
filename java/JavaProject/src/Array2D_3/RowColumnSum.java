import java.util.ArrayList;
import java.util.Scanner;

public class RowColumnSum {
        static public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        int n=A.size();
        int m = A.get(0).size();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=A.get(i).get(j);
            }
            res.add(sum);
        }
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=A.get(j).get(i);
            }
            res.add(sum);
        }
    return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> mat=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> in = new ArrayList<>();
            for(int j=0;j<m;j++){
                int val=sc.nextInt();
                in.add(val);
            }
            mat.add(in);
        }
        System.out.println(solve(mat));
        
    }
    
}
