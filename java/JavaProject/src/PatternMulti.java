public class PatternMulti {
    public static void main(String[] args) {
        int n=10;
        int i,j;
        for(i=1;i<=n-1;i++){
            for(j=1;j<=i;j++){
                System.out.print(i*j +" " );
            }
            System.out.println();
        }
    }
}
