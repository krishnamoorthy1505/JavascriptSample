import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllDiagnals {
    static void printAllDiagnal(ArrayList<ArrayList<Integer>> A){
        

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
