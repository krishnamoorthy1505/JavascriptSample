//package sample;

public class PostandPreINCREMENT {
    public static void main(String[] args) {
        // int a=10;
        // int b=a++;
        // System.out.println("a = "+a+" b = "+b);//a=11 b=10;

        // int a=10;
        // int b=++a;
        // System.out.println("a = "+a+" b = "+b);//a=11 b=11;

        // int a=10;
        // int b=20;
        // System.out.println("a = "+a+" b = "+b);//a=10 b=20;

        // int c=a++ + b++;
        // System.out.println("a = "+a+" b = "+b+" c = "+c);//a=11 b=10;
        int a=10;
        int b= a++ + ++a;
        System.out.println(a + " " + b);

        float fv = 35f / 0;
		System.out.println(fv);

    }
    
}
