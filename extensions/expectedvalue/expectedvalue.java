package expectedvalue;

import cse131.ArgsProcessor;

public class expectedvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		double p = ap.nextDouble("The ratio the game company will success?");
		int value = (int) ((p*190000+(1-p)*5000)/1);
		int salary = (int) (110000+Math.random()*50000);
		boolean c = value>salary;
		int valueEU = (int)Math.sqrt((p*190000+(1-p)*5000))*3;
		int salaryEU = (int)Math.sqrt(110000+Math.random()*50000)*2;
		System.out.println("Gamer(EU): "+valueEU);
		System.out.println("Programer(EU): "+salaryEU);
		boolean d = valueEU>salaryEU;
		System.out.println("You should be a gamer and not programer in EU? "+d);

	}

}
