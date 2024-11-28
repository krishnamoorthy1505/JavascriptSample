import java.util.*;

class Main {
	
	static int[]strg;
	
	static int fib(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		
		if(strg[n] != -1) {
			return strg[n];	
		}
		
		int ans = fib(n-1) + fib(n-2);
		strg[n] = ans;
		
		return ans; 
	}
	
	static int solve(int n) {
		strg = new int[n+1];
		Arrays.fill(strg,-1);	
		
		return fib(n);
	}
	
	public static void main(String args[]) {
Scanner sc = new Scanner(System.in)	;
int n =sc.nextInt();
	System.out.println(solve(n));
	}
}