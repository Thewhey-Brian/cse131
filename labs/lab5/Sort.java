package lab5;

import cse131.NotYetImplementedException;

public class Sort {
	/**
	 * Searches an array from a starting fromIndex for the index of the
	 * lexicographically earliest value.
	 * 
	 * For example, when the array: { "A", "B", "D", "C", "E" } is paired with
	 * fromIndex: 2 the search would check the values "D", "C", and "E" and return
	 * the index of "C" which is 3.
	 * 
	 * This method must not mutate (that is: change the contents of) the specified
	 * array, nor would it have any real reason to do so.
	 * 
	 * @param array     the array to search
	 * @param fromIndex the index from which to search until the each of the array
	 * @return the index of the lexicographically earliest value
	 */
	public static int findIndexOfLexicographicallyEarliestValue(String[] array, int fromIndex) {
		String ans = "Z";
		int h = fromIndex;
		for(int i=fromIndex; i<array.length; ++i) {
			if(Strings.isLessThan(array[i], ans)) {
				ans = array[i];
				h = i;
			}
		}
		return h;
	}

	/**
	 * Swaps the values in the specified array at aIndex and bIndex. This will
	 * necessarily mutate (that is: change the contents of) the specified array.
	 * 
	 * For example: for array: { "A", "B", "D", "C", "E" }, aIndex: 1, and bIndex: 3
	 * the specified array will be changed to { "A", "D", "C", "B", E" }.
	 * 
	 * @param array  the array to mutate
	 * @param aIndex index whose value should be swapped with the value at
	 *               array[bIndex]
	 * @param bIndex index whose value should be swapped with the value at
	 *               array[aIndex]
	 */
	public static void swapValuesAtIndicesInPlace(String[] array, int aIndex, int bIndex) {
		String cup = "";
		cup = array[aIndex];
		array[aIndex] = array[bIndex];
		array[bIndex] = cup;
	}

	/**
	 * Sorts the specified array into ascending lexicographical order. This will
	 * necessarily mutate (that is: change the contents of) the specified array.
	 * 
	 * @param array the array to sort in place
	 */
	public static void selectionSortInPlace(String[] array) {
		String ans = "";
		String cup = "";
		int h = 0;
		for(int k=0; k<array.length; k++) {
				ans = array[k];
				for(int i=k; i<array.length; ++i) {
					if(Strings.isLessThan(array[i], ans)) {
						ans = array[i];
						h = i;
					}
				}
				cup = array[h];
				array[h] = array[k];
				array[k] = cup;
				h = k+1;
			
		}
		
		
	}

	/**
	 * Determines if the specified array is sorted in ascending lexicographical
	 * order.
	 * 
	 * This method must not mutate (that is: change the contents of) the specified
	 * array, nor would it have any real reason to do so.
	 * 
	 * @param array the array to determine whether or not it is sorted
	 * @return true if the array is sorted, otherwise false.
	 */
	public static boolean isSorted(String[] array) {
		int n = 0;
		if(array.length==0) {
			return true;
		}
		else {
			for(int i=0; i<array.length-1; ++i) {
				if(Strings.isLessThan(array[i], array[i+1])) {
					n = n + 1;
				}
			}
			if(n==array.length-1) {
				return true;
			}
			else {
				return false;
			}
		}
		
	}
}
