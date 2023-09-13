import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllDiagnals {
    static void printAllDiagnal(ArrayList<ArrayList<Integer>> A){
        int n = A.size();
        int m = A.get(0).size();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
       
        //all diagonals starting from 0th row 
        for(int c =0;c<m;c++){
            int r=0,j=c;
            ArrayList<Integer> list=new ArrayList<>();
            //All Diagnal Start from i to j
            while(r<n && j>=0){
                list.add(A.get(r).get(j));
                r++;
                j--;
            }
            res.add(list);
        }
        System.out.println(res);

        for(int r=1;r<n;r++){
            int i=r,j=m-1;
            ArrayList<Integer> list=new ArrayList<>();
            while(i<n && j>=0){
                list.add(A.get(i).get(j));
                //r++; result 1 st row only
                i++;
                j--;
            }
            res.add(list);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        for(int i = 0;i<n;i++){
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j < m;j++){
                int n1 =sc.nextInt();
                list.add(n1);
            }
            mat.add(list);
        }
        printAllDiagnal(mat);
        System.out.println(mat);

}
    
}
