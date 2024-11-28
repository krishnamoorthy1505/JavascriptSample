import java.util.HashSet;

public class DistinctElement {
    public static void main(String[] args) {
        int A[]={3,9,3,4,5};
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<A.length;i++){
            hs.add(A[i]);
        }
        System.out.println(hs.size());
    }
}
