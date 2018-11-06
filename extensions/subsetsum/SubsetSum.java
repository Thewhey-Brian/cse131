package subsetsum;

public class SubsetSum {
	
	/**
	 * This static method will find a subset of the array that adds up to the sum provided
	 * @param allnums the set from which to find the numbers that add up to the provided sum
	 * @param sum the provided sum
	 * @return the subset of allnums that add up to sum
	 */
	public static int[] findSubset(int[] allnums, int sum) {
		int[] solution = new int[7];
		int size = allnums.length;
		boolean triger = true;	
		int pick = 1;
		int sum0 = 0;
		
		while(sum0!=sum) {
		//solution
		for(int i=0; i<7; ++i) {
			pick = (int) (Math.random()*size);	
			for(int j=0; j<i; ++j) {
				if(solution[j]==allnums[pick]) {
					triger = false;
				}
			}
			while(!triger) {
				pick = (int) (Math.random()*size);
				for(int j=0; j<i; ++j) {
					if(solution[j]==allnums[pick]) {
						triger = false;	
					}
				}
			}
			
				solution[i] = allnums[pick];
			
		}
		
		
		
		
		//sum
		for(int i=0; i<7; i++)
		{
			sum0 = sum0 + solution[i];
		}
		
			
		}
		return solution;
	}
	
}