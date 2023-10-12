//package TC;

public class subSequence {
    static int countPairs(String str){
        int cg=0;
        int ans=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) == 'g'){
                cg++;
            }
            else if(str.charAt(i)=='a'){
                ans+=cg;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int n=countPairs("ambgagkg");
        System.out.println(n);
    }
    
}
