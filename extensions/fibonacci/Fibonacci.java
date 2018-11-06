package fibonacci;

public class Fibonacci {
	
	/**
	 * Below copy your solution to recursive Fibonacci from studio
	 * @param n
	 * @return fib(n), computed recursively
	 */
	public static int recursive(int n) {
		if(n>1) {
			return recursive(n -1) + recursive(n-2);
		}
		else {
			return n;
		}
	}
	
	/**
	 * Below write your solution to Fibonacci, using iteration
	 * @param n
	 * @return fib(n), computed iteratively
	 */
	public static int iterative(int n) {
		int ans = 0;
		int h = 1, t = 1;
		if(n==1) {
			ans = 1;
		}
		else 
		{
			if(n==2) {
				ans = 1;
			}
			else {
				for(int i=0; i<n-2; ++i) {
					ans = h+t;
					h = t;
					t = ans;
			}
		}

		}
		
		return ans;
	}

}
