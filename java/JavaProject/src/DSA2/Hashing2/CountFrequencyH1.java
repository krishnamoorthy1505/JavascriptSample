import java.util.HashMap;

public class CountFrequencyH1 {
    public static void main(String[] args) {
        int A[] = {2,1,2,3,1,5,4,2,1,2};
        int Q[] = { 2,1,9,5};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(hm.containsKey(A[i])==true){
                int freq = hm.get(A[i]);
                hm.put(A[i],freq+1);
            }
            else{
                hm.put(A[i],1);
            }
        }
        for(int i=0;i<Q.length;i++){
            if(hm.containsKey(Q[i])==true){
                System.out.print(Q[i] +" "+hm.get(Q[i]));
                System.out.println();
            }
            else{
                System.out.println(Q[i]+" "+0);
            }
        }
    }
}
