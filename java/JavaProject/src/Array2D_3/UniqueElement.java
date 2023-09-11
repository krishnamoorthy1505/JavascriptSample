//package Array2D_3;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueElement {
    static boolean isUnique(ArrayList<Integer> A,int val){
        int n = A.size();
        int count=0;
        for(int i=0;i<n;i++){
            if(A.get(i)==val){
                count++;
            }
            
        }
        if(count>1){
            return false;
        }
        else{
            return true;
        }
    }
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        int m = A.get(0).size();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            //int count = 0;
            ArrayList<Integer> unique=new ArrayList<>();
            int val=0;
            //System.out.println(val);
            for(int j = 0;j<m;j++){
                val = A.get(i).get(j);
                if(isUnique(A.get(i),val) == true){
                    unique.add(val);
                }
                              
            }
           
            res.add(unique);
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
