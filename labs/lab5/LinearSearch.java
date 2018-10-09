package lab5;

import cse131.NotYetImplementedException;

public class LinearSearch {
	/**
	 * Searches the specified array for the specified key.
	 * 
	 * For example:
	 * 
	 * when array: { "W", "A", "S", "H", "U" } is paired with key: "S" return 2.
	 * when array: { "W", "A", "S", "H", "U" } is paired with key: "Z" return -1.
	 * when array: { "A", "B", "A", "B", "A" } is paired with key: "A" return 0.
	 * when array: { "A", "B", "A", "B", "A" } is paired with key: "B" return 1.
	 * 
	 * This method must not mutate (that is: change the contents of) the specified
	 * array, nor would it have any real reason to do so.
	 * 
	 * @param array the array to be searched
	 * @param key   the value to be searched for
	 * @return the index of the first occurrence of key, if it is contained in the
	 *         array; otherwise -1.
	 */
	public static int findFirstIndexIn(String[] array, String key) {
		int ans = array.length;
		int i = 0;
		while(i<array.length) {
			if(Strings.equals(array[i], key)) {
				ans = i;
				i = array.length;
			}
			else {
				i = i+1;
			}
		}
		if(ans!=array.length) {
			return ans;
		}
		else {
			return -1;
		}
	}
}
