package lab6;

import cse131.NotYetImplementedException;
import lab5.BinarySearch;
import lab5.Strings;
import studio5x.MergeCombiner;

public class MergeSort {
	private static String[] mergeCombine(String[] a, String[] b) {
		// if you would prefer to use your implementation from the previous studio,
		// then change the line below to read:
		// final boolean IS_USE_OF_STUDIO_DESIRED = true;
		final boolean IS_USE_OF_STUDIO_DESIRED = false;
		if (IS_USE_OF_STUDIO_DESIRED) {
			return MergeCombiner.createMergeCombinedArray(a, b);
		} else {
			String[] result = new String[a.length + b.length];

			int aReadIndex = 0;
			int bReadIndex = 0;

			int writeIndex = 0;

			// go through both arrays, selecting from the array with the earlier
			// alphabetically string, updating the appropriate indices, of course.
			while (aReadIndex < a.length && bReadIndex < b.length) {
				if (Strings.isLessThan(a[aReadIndex], b[bReadIndex])) {
					result[writeIndex] = a[aReadIndex];
					aReadIndex++;
				} else {
					result[writeIndex] = b[bReadIndex];
					bReadIndex++;
				}
				writeIndex++;
			}

			// copy over the remaining items from a, if it was not the one that completed.
			while (aReadIndex < a.length) {
				result[writeIndex] = a[aReadIndex];
				aReadIndex++;
				writeIndex++;
			}

			// copy over the remaining items from b, if it was not the one that completed.
			while (bReadIndex < b.length) {
				result[writeIndex] = b[bReadIndex];
				bReadIndex++;
				writeIndex++;
			}

			return result;
		}
	}
	public static String[] createSortedArrayInRange(String[] array, int min, int maxExclusive) {
		int i = 0;
		int j = 0;
		if(maxExclusive-min==1) {
			String ans[] = new String[1];
			ans[0] = array[min];
			return ans;
		}
		
		else {
			j = (maxExclusive-min)/2+min;
			i = (maxExclusive-min)/2+min+1;
			//return mergeCombine(createSortedArrayInRange(array, min, (maxExclusive-min)/2+min), createSortedArrayInRange(array, (maxExclusive-min)/2+min+1, maxExclusive));
			return mergeCombine(createSortedArrayInRange(array, min, j), createSortedArrayInRange(array, i, maxExclusive));

		}
			
	}
	public static String[] createSortedArray(String[] array) {
		// handle the 0 array length case here, so the recursive
		// createSortedArrayInRange need not worry about it.
		if (array.length > 0) {
			return createSortedArrayInRange(array, 0, array.length);
		} else {
			return new String[0];
		}
	}
}
