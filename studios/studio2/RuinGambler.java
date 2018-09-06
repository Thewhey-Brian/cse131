package studio2;

import cse131.ArgsProcessor;

public class RuinGambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int startA = ap.nextInt("The amount of money that you start with?");
		double winC = ap.nextDouble("The probability that you win the gamble?");
		int winA = ap.nextInt("If you reach this amount of money, than you won.");
		int totalP = ap.nextInt("The number of time you simulate the problem?");
		double lossC = 1-winC;
		double ruin = 0;
		if(lossC!=winC) {
			double a = Math.pow(lossC/winC, startA);
			double b = Math.pow(lossC/winC, winA);
			double c = 1-(Math.pow(lossC/winC, winA));
			ruin = (a-b)/c;
			System.out.println(ruin);
		}
		else {
			ruin = 1-startA/winA;
		}
	    int n=0;
		for(int i=1; i<totalP+1; ++i) {
			System.out.print(" Simulation "+i+": ");
			int startA1 = startA;
			int j = 1;
			for(j=1; startA1>0&&startA1<winA; ++j) {
				if(Math.random()<winC) {
					startA1 = startA1+1;
				}
				else {
					startA1 = startA1-1;
					
				}
			}
			System.out.print(j+" rounds         ");
			if(startA1!=0) {
				System.out.println("WIN!!!");
			}
			else {
				System.out.println("LOSS:(");
			}
			if(startA1==0) {
				n = n+1;
			}
			
		}
		System.out.println(" ");
		System.out.print("Losses: "+n);
		System.out.println("      Simulations: "+totalP);
		double rate = (n*0.1)/(totalP*0.1);
		System.out.print("Actual Ruin Rate: "+rate);
		System.out.println("      Expect Ruin Rate: "+ruin);
		
		
		

	}

}
