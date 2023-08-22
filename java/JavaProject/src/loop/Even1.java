//package loop;

import java.util.Scanner;

public class Even1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
		int i = 0;
		while(2*i <= N) { 
			System.out.println(2*i); 
			i++; 
		}
    }
}
