package exercises2;

import cse131.ArgsProcessor;

public class BadSwap {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int x = ap.nextInt("Enter x");
		int y = ap.nextInt("Enter y");
		int z = 0;
		
		if (x > y) {
			z = y;     // Bad
			y = x;
			x = z;     // swap!!
		}
		
		System.out.println("x and y are now"
				+ x + " and " + y);
		
		//
		// Student fill in with comments below this line:
		//   Why does the code above *not* swap the values of
		//      x and y?
		//   Note that the bad swap executes only if x>y
		//
		// Your answer:
		//
		// Because when x>y, like 5>3, the code "y=x"-> x=y=3. Then the code "y=x" means nothing!
		// So there need another integer to put the value of x when we swap them.
		//
		//
		//
		//

	}

}
