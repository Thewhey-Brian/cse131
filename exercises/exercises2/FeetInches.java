package exercises2;

import cse131.ArgsProcessor;

public class FeetInches {

	public static void main(String[] args) {
		
		ArgsProcessor ap = new ArgsProcessor(args);
		int inch = ap.nextInt("How many inches?");
		int feet = inch/12;
		int inch0 = inch%12;
		if (feet>1)
		{
			if(inch0>1)
			{
				System.out.println(inch+"inches will produce: "+feet+" feet and "+inch0+" inches");
			}
			else {
				System.out.println(inch+"inches will produce: "+feet+" feet and "+inch0+" inch");
			}
		}
		
		else{
			if(inch0>1)
			{
				System.out.println(inch+" inches will produce: "+feet+" foot and "+inch0+" inches");
			}
			else {
				System.out.println(inch+" inches will produce: "+feet+" foot and "+inch0+" inch");
			}
		}
		
		//
		// Prompt the user for a number of inches
		//
		// Convert that into feet and inches
		//   BUT
		// Be sure to use the singular "foot" or "inch"
		//   where appropriate, as discussed in
		//   the introductory video
		//
		// For example, 61 inches would produce
		//    the output
		//   5 feet and 1 inch
		//

	}

}
