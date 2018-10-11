package studio5x;

import cse131.NotYetImplementedException;
import lab5.Strings;

public class MergeCombiner {
	/**
	 * Produces an array which is the sorted result of merging the two specified,
	 * sorted input arrays a and b.
	 * 
	 * For example, when the arrays { "E", "G", "N" } and {"B", "I", "S" } are
	 * passed to this method, the resulting array { "B", "E", "G", "I", "N", "S" }
	 * should be returned.
	 * 
	 * If either input array a or b is unsorted, then the results are undefined.
	 * 
	 * This method must not mutate (that is: change the contents of) the input
	 * arrays a or b, nor would it have any real reason to do so.
	 * 
	 * @param a
	 *            a sorted array
	 * @param b
	 *            another sorted array
	 * @return a new array which contains the contents of both a and b, sorted.
	 */
	public static String[] createMergeCombinedArray(String[] a, String[] b) {
		String[] c = new String[a.length+b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(a.length-i!=0&&b.length-j!=0) {
			if(Strings.isLessThan(a[i], b[j])) {
				c[k] = a[i];
				k = k+1;
				i = i+1;
			}
			else {
				c[k] = b[j];
				k = k+1;
				j = j+1;
			}
		}
		if(a.length-i==0) {
			while(b.length-j!=0) {
				c[k] = b[j];
				k = k+1;
				j = j+1;
			}
		}
		else {
			while(a.length-i!=0) {
				c[k] = a[i];
				k = k+1;
				i = i+1;
			}
		}
		return c;
	}
}
