package studio2;

import cse131.ArgsProcessor;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		double time = ap.nextInt("How many times do you want to play?");
		double pi = 0.0;
		int n = 0;
		for (int i=1; i<time; ++i) {
			double x = Math.random();
			double y = Math.random();
			if(x*x+y*y<1) {
				n = n+1;
			}
		}
		pi = 4*n/time;
		System.out.println(pi);
		

		
	}

}
