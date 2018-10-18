package studio6;

import cse131.ArgsProcessor;

public class Beer {
	
	public static void bottlesOfBeer(int n) {
		if(n!=0) {
			
			System.out.println(n+"bottles of beer on the wall, "+n+" bottles of beer; you take one down, pass it around, "+(n-1)+" bottles of beer on the wall.");
			bottlesOfBeer(n-1);
		}
		if(n==0) {
			return;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt("How many beers do you want?");
		bottlesOfBeer(n);
	}

}
