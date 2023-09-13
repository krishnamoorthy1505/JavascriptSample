//package IF_1;

/* Problem Description

You have been given a dataset for marks of 2 subjects, 
scored by students of classes ClassA and ClassB. 
You now want to compare the performances of class A and class B
 by finding out the average performance of the classes. 
 Write a program to find if class A performed better. 
 Print True is Class A is strictly better else return False.
 */


import java.util.Scanner;

public class ClassPerformence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A1 = sc.nextInt();
        int A2 = sc.nextInt();
        int B1 = sc.nextInt();
        int B2 = sc.nextInt();
        double classA = (A1+A2)/2d;
        System.out.println(classA);
        double classB = (B1+B2)/2d;
        System.out.println(classB);
        if(classA > classB)
            System.out.println("YES");
        else    
            System.out.println("NO");
    }
}
