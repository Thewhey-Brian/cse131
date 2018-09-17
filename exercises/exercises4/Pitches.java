package exercises4;

import cse131.ArgsProcessor;

public class Pitches {

	public static void main(String[] args) {
		// encoding has 0 as concert A
		//    1 would be Bb, just above A
		//   -1 would be Ab, just below A
		ArgsProcessor ap = new ArgsProcessor(args);
		int pitch = ap.nextInt("What pitch1?");
		int pitch2 = ap.nextInt("What pitch2?");
		double frequence1 = 440.0*Math.pow(2, pitch/12.0);
		double frequence2 = 440.0*Math.pow(2, pitch2/12.0);
		System.out.println("Pitch1 "+pitch+"gets the frequency1 "+frequence1);
		System.out.println("Pitch2 "+pitch2+"gets the frequency2 "+frequence2);
		double ratio = frequence2/frequence1;
		System.out.println("The ratio is "+ratio);
		


	}

}
