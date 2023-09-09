import java.util.ArrayList;
import java.util.Scanner;

public class MajorDiagonal {
    static ArrayList<Integer> majorDiagnol(ArrayList<ArrayList<Integer>> A){
        int n = A.size();
        int m = A.get(0).size();
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0,j=0;
        while(i < n && j < m){
            ans.add(A.get(i).get(j));
            i++;
            j++;
        }
        return ans;
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
        System.out.println(majorDiagnol(mat));

    }
    
}
