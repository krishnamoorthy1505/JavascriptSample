public class DataType {
    public static void main(String[] args) {
        // long x = 10000;
		// int y = (int)x;
		// System.out.print(y);
        // long n = 10000000000l; // 10^10  //error
		// System.out.print(n);

        // long a = 10; 
		// int b = (int)a;  //error
		// System.out.print(b);

        //float fv = 3.84; //error (lossy conversion double to float)
		// System.out.println(fv);
       /*  long d=100000;
        int e=400000;
        long e1=d*e;
        System.out.println(e1);*/

       /*  int a=1000000;
        int b=4000000;
        long c=(long)(a*b);
        System.out.println(c);//wrong result */

        /* int a=1000000;
        int b=4000000;
        long c=(long) a*b;
        System.out.println(c);*/
       
       
        // long a=1000000;
        // int b=4000000;
        // int c=a * b;
        // System.out.println(c);


		// int a = 100000;
		// int b = 400000;
		// long c = (long)a*(long)b;
		// System.out.println(c);  


        // int a = 5;
		// int b = 2;
		// double c = a/b; //int/int -> int 
		// System.out.println(c);
		
		
		// int a = 5;
		// int b = 2;
		// double c = (double)a/b; //double/int -> double 
		// System.out.println(c);


        // int total_marks = 500;
		// int marks_scored = 460;
		// double percent = (marks_scored / total_marks) * 100;
		// System.out.println(percent); //0.0
		
		
		//making the above calculation correct 
		// int total_marks = 500;
		// int marks_scored = 460;
		// double percent = ((double)marks_scored / total_marks) * 100;
		// System.out.println(percent); 

        //  int a = 10; //a = 11, b = 10
		//  int b = a++; //use a first then increment a
		//  System.out.println(a + " " + b);

         int a = 10; 
		 int b = a++ + ++a; 
		 System.out.println(a + " " + b);



		
		
    }
}
