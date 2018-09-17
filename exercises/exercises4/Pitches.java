package exercises4;

import cse131.ArgsProcessor;

public class Pitches {

	public static void main(String[] args) {
		// encoding has 0 as concert A
		//    1 would be Bb, just above A
		//   -1 would be Ab, just below A
		ArgsProcessor ap = new ArgsProcessor(args);
		int pitch = ap.nextInt("What pitch?");
		int p7 = pitch+7;
		double frequency = 440.0*Math.pow(2, pitch/12.0);
		double f7 = 440.0*Math.pow(2, p7/12.0);
		System.out.println("Pitch "+pitch+"gets the frequency "+frequency);
		System.out.println("Pitch7 "+p7+"gets the frequency7 "+f7);
		double ratio = f7/frequency;
		System.out.println("The ratio is "+ratio);
		


	}

}
