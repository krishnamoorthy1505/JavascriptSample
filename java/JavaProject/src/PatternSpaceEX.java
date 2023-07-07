/**
 * PatternSpaceEX
 */
public class PatternSpaceEX {
    public static void main(String[] args) {
        int n=8;
        int i,j;
attP        for(i=1;i<=n;i++){

            for (j=1;j<=n/2;j++){
                if(i==j)
                System.out.print(j);
               /*  else if(i>4 && j==n-i){
                    System.out.print(j);
                }
                */ 
                else
                System.out.print(" ");
            }
            j=j-2;
            while(j>0){
                if(i==j)
                System.out.print(j);
                else
                System.out.print(" ");
                j--;
            }


                System.out.println();
        }
    }

    
}