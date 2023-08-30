//package 1D_Array1;

public class FirstArray {
    public static void main(String[] args) {
        int[] a= new int[5];
        System.out.println(a.length);
        System.out.println(a[0]);   //Default value 0
        System.out.println(a[1]);   //Default value 0
        System.out.println(a[2]);   //Default value 0
        System.out.println(a[3]);   //Default value 0
        System.out.println(a[4]);   //Default value 0
        //System.out.println(a[5]);//Array index out of bounds exception
        a[0]=10;
        a[1]=20;
        System.out.println(a[0]+a[1]);

    }
    
}
