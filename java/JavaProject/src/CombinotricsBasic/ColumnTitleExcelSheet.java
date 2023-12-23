import java.util.Scanner;

public class ColumnTitleExcelSheet {
    public static String findColumn(int A){
        String s = "";
        //System.out.println(mod);
        while(A>0){
            int mod = A%26;

            if(mod == 0){
                 s = 'Z'+"";
            }
            else{
                s = (char)(mod -1   + 65)+s;
            }
            A = (A -1 )/26;
        }
        return  s;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String col = findColumn(n);
        System.out.println(col);


    }

}
