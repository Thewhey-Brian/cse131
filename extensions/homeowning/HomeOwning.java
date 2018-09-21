package homeowning;

import java.text.DecimalFormat;

import cse131.ArgsProcessor;

public class HomeOwning {

	public static void main(String[] args) {
	ArgsProcessor ap = new ArgsProcessor(args);
	String name = ap.nextString("What's the name of this appartment?");
	String code = ap.nextString("What the zip code is?");
	int rent = ap.nextInt("Monthly rent?");
	double interest = ap.nextDouble("Daily interest?");
	int yrent = 12*rent;
	double rent0 = (double) rent;
	double wrent = Math.round((rent0*100.0)/4.3333)/100.0;
	double yinterest = interest*365;
	double winterest = interest*7;
	System.out.println(name+" is located in the Zip Code "+code);
	System.out.println("Rent per year: "+yrent);
	System.out.println("Rent per week: "+Math.round(wrent*100.0)/100.0);
	System.out.println("  ");
	System.out.println("Interest per year: "+Math.round(yinterest*100.0)/100.0);
	System.out.println("Interest per week: "+Math.round(winterest*100.0)/100.0);
	System.out.println("  ");
	if(winterest>wrent) {
		System.out.println("I should rent");
	}
	else {
		System.out.println("I should buy my own house");
	}
	

	}

}
