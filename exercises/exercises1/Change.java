package exercises1;

import cse131.ArgsProcessor;

public class Change {

	public static void main(String[] args) {
		//
		// Below, prompt the user to enter a number of pennies
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		int pennies = ap.nextInt("Staring number of pennies? ");
		int dollars = pennies/100;
		int quarters = pennies%100/25;
		int dimes = (pennies%100-quarters*25)/10;
		int nickels = (pennies%100-quarters*25)%10/5;
		int pennies0 = (pennies%100-quarters*25)%10-nickels;
		//
		// Then, compute and print out how many 
		//    dollars, quarters, dimes, nickels, and pennies
		// should be given in exchange for those pennies, so as to
		// minimize the number of coins (see the videos)
		//
		System.out.println("For "+pennies+" pennies:\n"+dollars+" dollars\n"+quarters+" quarters\n"+dimes+" dimes\n"+nickels+" nickels\n"+pennies0+" pennies\n");
	}

}
