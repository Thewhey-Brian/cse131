package lab5;

import cse131.NotYetImplementedException;

public class BinarySearch {
	/**
	 * Calculates the floored midpoint of two specified integer values.
	 * 
	 * For example: a: 300 and b: 400 returns 350. a: 300 and b: 401 also returns
	 * 350. a: 300 and b: 402 returns 351.
	 * 
	 * @param a a value
	 * @param b another value
	 * @return the midpoint of a and b
	 */
	public static int calculateMidPoint(int a, int b) {
		int ans = 0;
		ans = (a+b)/2;
		return ans;
	}
	/**
	 * Searches the specified sorted array for the value specified by key. If the
	 * array contains key, then it returns an index which holds the value, otherwise
	 * it returns -1. If array contains multiple elements with the specified key
	 * value, there is no guarantee which index will be returned.
	 * 
	 * If the array is unsorted, then the results are undefined.
	 * 
	 * This method must not mutate (that is: change the contents of) the specified
	 * array, nor would it have any real reason to do so.
	 * 
	 * @param array the array to be searched
	 * @param key   the value to be searched for
	 * @return an index of an occurrence of key, if it is contained in the array;
	 *         otherwise -1.
	 */
	public static int findIndexInSorted(String[] array, String key) {
		//Sort.selectionSortInPlace(array);
		int s = 0;
		int e = array.length-1;
		int mid = (s+e)/2;
		if(array.length==0) {
			return -1;
		}
		while(s<=e) {
			if(Strings.equals(array[mid], key)) {
				return mid;
			}
			else {
				if(Strings.isGreaterThan(key, array[mid])) {
					s = mid+1;
				}
				else {
					e = mid-1;
				}
				mid = (s+e)/2;
			}
		}
		if(s>e) {
			return -1;
		}
		else {
			return mid;
		}
			
		
		
			
		
	}
}
