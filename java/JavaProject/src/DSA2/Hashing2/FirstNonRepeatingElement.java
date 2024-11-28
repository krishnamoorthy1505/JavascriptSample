import java.util.HashMap;

public class FirstNonRepeatingElement {
    static int firstNonRepeatingElement(int[] A){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else{
                map.put(A[i],1);
            }
        }
        int res =-1;
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                if(map.get(A[i]) == 1){
                    System.out.println(A[i]);
                    return A[i];
                }
            }
        }
       // System.out.println(res);
       return -1;
    }
    public static void main(String[] args) {
        int A[] ={2,5,4,5,2,6};
        int res = firstNonRepeatingElement(A);
        System.out.println(res);
        
    }
}
