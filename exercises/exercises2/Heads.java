package exercises2;

import cse131.ArgsProcessor;

public class Heads {

	public static void main(String[] args) {

		// what are the concepts?
		
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int n = ap.nextInt("How many times do you want to play?");
		int sunNumFlips = 0;
		for (int i = 0; i<n; ++i) {
		int numFlips = 0;
		// now flip a coin until we see 10 heads
		for (int numHeads = 0; numHeads != 10;) {
			boolean isHeads = Math.random() < 0.5;
			if (isHeads) {
				numHeads = numHeads + 1;
			}
			numFlips = numFlips + 1;

		}
		// here, numHeads should be 10
		sunNumFlips = sunNumFlips + numFlips;

	}
	System.out.println("Number of avreage flips was " + (1.0*sunNumFlips/n));
	}
}
