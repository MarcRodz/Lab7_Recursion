package MainClasses;

import Pair.Pair;

public class recMain {
	
	public static void main(String[] args) {
		System.out.println(fib(50));
		System.out.println(fib2(50));
	}
	
	public static long fib(int n) { 
		   if (n == 1 || n == 0) return 1; 
		   else return fib(n-1) + fib(n-2); 
	}
	
	//better version of pair fibonacci
	public static Pair<Long> fib2(int n) { 
		   if (n == 1 || n == 0) return new Pair(1, 1); 
		   else return new Pair<Long>( (fib(n)), fib(n-1)); 
	}

	//deprecaded
	public static Pair<Integer> pairFib(int n) { 
		   if (n==0 || n==1) 
			   return new Pair(1, 1); 
		   Pair<Long> p = fib2(n); 
		   return new Pair(p.first() + p.second(), p.first());
	}

}