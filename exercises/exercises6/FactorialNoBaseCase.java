package exercises6;

public class FactorialNoBaseCase {
	
	public static int factorial(int n) {
		if(n!=0) {
			return n * factorial(n-1);
		}
		else {
			return 1;
		}
		// don't have the base cases
		
	}

	public static void main(String[] args) {
		int ans = factorial(2);
		System.out.println("Answer is " + ans);
	}
}
