import java.util.ArrayList;
import java.util.Scanner;

public class MinorDiagnal {
    static ArrayList<Integer> minorDiagnol(ArrayList<ArrayList<Integer>> A){
        int n = A.size();
        int m =A.get(0).size();
        int i=0,j=m-1;
        ArrayList<Integer> res=new ArrayList<>();
        while(i < n && j>=0){
            res.add(A.get(i).get(j));
            i++;
            j--;

        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> mat=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<m;j++){
                int n1=sc.nextInt();
                list.add(n1);

            }
            mat.add(list);
        }
        System.out.println(minorDiagnol(mat));
        System.out.println(mat);
    }
    
}
