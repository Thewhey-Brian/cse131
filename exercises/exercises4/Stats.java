package exercises4;

import sedgewick.StdIn;
import cse131.ArgsProcessor;

public class Stats {

	public static void main(String[] args) {
		// prompt the user for the file to be used for this run
		ArgsProcessor.useStdInput("datafiles/average");
		double sum = 0;
		int count = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;		
		while(!StdIn.isEmpty()) {
			double a = StdIn.readDouble();
			sum = sum+a;
			count = count+1;
			if(a>max) {
				max = a;
			}
			if(a<min) {
				min = a;
			}
		}
		double average = sum/count;
		System.out.println("Sum: "+sum);
		System.out.println("Count: "+count);
		System.out.println("Average: "+average);
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);

		

		//
		//  Read in the data from the opened file, computing the
		//     sum, average, count, max, and min
		//  of the data
		//
		//  count is the number of doubles read from the file
		//  The other statistics should be clear from their names
		//

	}

}
