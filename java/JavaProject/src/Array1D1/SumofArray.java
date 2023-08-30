//package Array1D1;

public class SumofArray {
    static int sumArray(int a[]){
        int sum=0;
        int length=a.length;
        for(int i=0;i<length;i++){
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        int sum = sumArray(a);
        System.out.println(sum);
    }
}
