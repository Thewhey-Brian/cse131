package baseball;

import cse131.ArgsProcessor;

public class baseballstates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		String name = ap.nextString("What is his name?");
		int bats = ap.nextInt("The number of at-bats the player has?");
		int hist = ap.nextInt("he number of hits the player has?");
		double rate = Math.round(hist*1000.0/bats)/1000.0;
		boolean a = bats>=200&&rate>=0.270;
		System.out.println(name+"  "+rate);
		System.out.println("All-Star Worthy? "+a);

	}

}
