package studio5;

public class Methods {
	
	/**
	 * Implemented correctly
	 * @param x one thing to add
	 * @param y the other thing to add
	 * @return the sum
	 */
	public static int sum(int x, int y) {
		return x+y;
	}
	
	/**
	 * 
	 * @param x one factor
	 * @param y another factor
	 * @return the product of the factors
	 */
	public static int mpy(int x, int y) {
		int ans = 0;
		for(int i=0; i<y; ++i) {
			ans = ans+x;
		}
		return ans;  // FIXME
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return the average of the three factors
	 */
	public static double avg3(int a, int b, int c) {
		double ans = (a + b + c)/3.0;
		return ans;
	}
	
	/**
	 * 
	 * @param array
	 * @return sum
	 */
	public static double sumArray(double[] array) {
		double sum = 0;
		for(int i=0; i<array.length; ++i) {
			sum = sum + array[i];
		}
		return sum;
	}
	
	/**
	 * 
	 * @param array
	 * @return average
	 */
	public static double average(double[] array) {
		double ans = 0;
		double sum = sumArray(array);
		ans = sum/array.length;
		return ans;
	}
	
	/**
	 * 
	 * @param a
	 * @return absolute value
	 */
	public static int absolute(int a) {
		int ans = 0;
		if(a>0) {
			ans = a;
		}
		else {
			ans = -a;
		}
		return ans;
	}
	
	/**
	 * 
	 * @param s
	 * @return pig latin
	 */
	public static String pig(String s) {
		String head = s.substring(0,1);
		String body = s.substring(1);
		String ans = body + head + "ay";
		return ans;
	}


}
