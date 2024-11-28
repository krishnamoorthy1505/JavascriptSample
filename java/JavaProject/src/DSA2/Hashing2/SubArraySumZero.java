import java.util.HashSet;

public class SubArraySumZero {
    static boolean subArraySumZero(int A[]){
        int cs = 0;
        HashSet<Integer> hs =new HashSet<>();
        hs.add(0);
        for(int i=0;i<A.length;i++){
            cs+=A[i];
            if(hs.contains(cs)){
                return true;
            }
            else{
                hs.add(cs);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int A[] = {2,4,1,3,6,-2,5,-12,15};
        boolean res = subArraySumZero(A);
        System.out.println(res);
    }
}
