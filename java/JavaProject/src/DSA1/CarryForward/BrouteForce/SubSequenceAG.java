/* Problem Description
You have given a string A having Uppercase English letters.

You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.



Problem Constraints
1 <= length(A) <= 105


Example Input
Input 1:

 A = "ABCGAG"
Input 2:

 A = "GAB"


Example Output
Output 1:

 3
Output 2:

 0

 */
//package BrouteForce;

public class SubSequenceAG {
    static int countAGPairs(String str){
        int n = str.length();
        int ans=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i) == 'A'){
                int count = 0;
                //System.out.println(1);
                for(int j=i+1;j<n;j++){
                    if(str.charAt(j)=='G'){
                        //System.out.println(2);
                        count++;
                    }
                }
                //System.out.println(count);
                ans+=count;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=countAGPairs("AMBGAGKG");
        System.out.println(n);
    }
    
}
