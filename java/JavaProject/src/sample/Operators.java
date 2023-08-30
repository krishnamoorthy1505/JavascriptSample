//package sample;

public class Operators {
    public static void main(String[] args) {


        // int a = 5;
		// int b = 2;
		// double c = (double)a/b; //double/int -> double 
        // System.out.println(c);
        
        // int a=100000;
        // int b=400000;
        // int c=a*b;
        // System.out.println(c); //wrong value c=1345294336

        // int a=100;
        // int b=400;
        // int c=a*b;
        // System.out.println(c);//correct

        // long a=100000;
        // int b=400000;
        // long c=a*b;
        // System.out.println(c);//correct c=40000000000

        //    long a = 10000000000000000L;
		//    int b = 40000000;
		//    long c = a*b;
		//    System.out.println(c); //some wrong value

        // long a=100000;
        // int b=400000;
        // int c=a*b;
        // System.out.println(c); //error possible lossy conversion from long to int

        /* 2 steps 
		  1. calculation 
		  2. assignment of calculated result in left side variable
		*/

       	// int a = 100000;
		// int b = 400000;
		// long c = (long)(a*b);
		// System.out.println(c); //some wrong result c=1345294336

        // int a = 100000;
		// int b = 400000;
		// long c = (long) a*b;
		// System.out.println(c); 
		
		
		// int a = 100000;
		// int b = 400000;
		// long c = a*(long)b;
		// System.out.println(c);
		
		
		// int a = 100000;
		// int b = 400000;
		// long c = (long)a*(long)b;
		// System.out.println(c);

        // int a = 5;
		// int b = 2;
		// double c = a/b; //int/int -> int 
		// System.out.println(c);

		// double a = 5;
		// int b = 2;
		// double c = a/b; 
		// System.out.println(c);

   		// int a = 5;
		// int b = 2;
		// double c = a/(double)b;  
		// System.out.println(c);

       	// int total_marks = 500;
		// int marks_scored = 460;
		// double percent = (marks_scored / total_marks) * 100;
		// System.out.println(percent); //0.0

       	int total_marks = 500;
		int marks_scored = 460;
		double percent = (marks_scored /(double) total_marks)*100 ;
        
		System.out.println(percent); 
		
		





    }
    
}
