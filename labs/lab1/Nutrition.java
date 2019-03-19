package lab1;

import cse131.ArgsProcessor;

public class Nutrition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		String name = ap.nextString("What are you eating?");
		double carbs = ap.nextDouble("How many grams of carbonhydrates in this food?");
		double fat = ap.nextDouble("How many grams of fat in this food?");
		double protein = ap.nextDouble("How many grams of protein in this food?");
		int statedCals = ap.nextInt("How many calories stated on this food's lable?");
		double calCarbs = 4*carbs;
		double calProtein = 4*protein;
		double calFat1 = 9*fat;
		double unavailableCal = calCarbs+calProtein+calFat1-statedCals;
		double fiber = unavailableCal/4;
		double calFat = Math.round((calFat1*10))/10.0;
		double unavailableCal1 = Math.round((unavailableCal*10))/10.0;
		double fiber1 = Math.round((fiber*100))/100.0;

		System.out.println(name+" has ");
		System.out.println("  "+carbs+" grams of carbohydrates = "+calCarbs+" Calories");
		System.out.println("  "+fat+" grams of fat = "+calFat+" Calories");
		System.out.println("  "+protein+" grams of protein = "+calProtein+" Calories");
		System.out.println("  ");
		System.out.println("This food is said to have "+statedCals+" (available) calories.");
		System.out.println("With "+unavailableCal1+" unavailable Calories, this food has "+fiber1+" grams of fiber.");
		System.out.println("  ");
		double pCarbs = calCarbs/(statedCals*1.0);
		double pProtein = calProtein/(statedCals*1.0);
		double pFat = calFat/(statedCals*1.0);
		double pCarbs1 = Math.round((pCarbs*1000))/10.0;
		double pProtein1 = Math.round((pProtein*1000))/10.0;
		double pFat1 = Math.round((pFat*1000))/10.0;
		System.out.println("Approxmimately");
		System.out.println("  "+pCarbs1+"% of your food is carbohydrates");
		System.out.println("  "+pProtein1+"% of your food is protein");
		System.out.println("  "+pFat1+"% of your food is fat");
		System.out.println("  ");
		boolean a = pCarbs<0.25;
		boolean b = pFat<0.15;
		System.out.println("This food is acceptable for low-carb diet?  "+a);
		System.out.println("This food is acceptable for low-fat diet?  "+b);
		boolean c = Math.random()<0.5;
		System.out.println("By coin flip, you should eat this food?  "+c);
		System.out.println(-10%3);


	}

}
