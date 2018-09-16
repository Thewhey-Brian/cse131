package lab3;

import cse131.ArgsProcessor;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DICE:  ");
		ArgsProcessor ap = new ArgsProcessor(args);
		int D = ap.nextInt("How many dices do you want?");
		int T = ap.nextInt("How many times do you want to thrown?");
		int y = 0;
		int j = D;
		int [] a = new int[D];
		int [] s = new int[6*D+2];
		double [] ratio = new double[6*D+2];
		for(int m=0; m<T; ++m) {
			int sum = 0;
			int n = 0;
			for(int i=0; i<D; ++i) {
				
				double r = Math.random();
				if(r<(1.0/6)) {
					a[i] = 1;
				}
				else {
					if(r<(2.0/6)) {
						a[i] = 2;
					}
					else {
						if(r<(3.0/6)) {
							a[i] = 3;
						}
						else {
							if(r<(4.0/6)) {
								a[i] = 4;
							}
							else {
								if(r<(5.0/6)) {
									a[i] = 5;
								}
								else {
										a[i] = 6;
								}
							}
						}
					}
				}
				
				int b = a[i];
				System.out.print("  "+b+"  ");
				sum = sum+b;
				if(i>0) {
					if(b==a[i-1]) {
						n = n+1;
					}
				}
			}
			for(j=D; j<6*D+1; ++j) {
				if(j==sum) {
					s[j]=s[j]+1;
				}
			}
			System.out.print("The sum = "+sum);
			if(n==D-1) {
				y = y+1;
			}
			System.out.println("     ");
		}

		//for(int l=D; l<6*D+1; ++l) {
		//	int u = s[j];
		//	ratio[l] = Math.round(((u*1.0)/(T*1.0))*100)/100.0;
		//}
		double rate = Math.round(((y*1.0)/(T*1.0))*100)/100.0;
		System.out.println("The fraction of times that all of the dice have the same value in a throw: "+rate);
		System.out.println("     ");
		System.out.print("Sum");
		System.out.print("   Number of times\n" + 
				"       Sum was seen       ");
		System.out.println("Ratio");
		for(int k=D; k<6*D+1; ++k) {
			int z = s[k];
			ratio[k] = Math.round(((z*1.0)/(T*1.0))*100)/100.0;
			double p = ratio[k];
			if(z!=0) {
				if(k<10) {
					System.out.print(" "+k);
					System.out.print("          "+z+" ");
					if(z<10) {
						System.out.println("            "+p);
					}
					else {
						System.out.println("           "+p);
					}
				}
				else {
					System.out.print(" "+k);
					System.out.print("         "+z+" ");
					if(z<10) {
						System.out.println("            "+p);
					}
					else {
						System.out.println("           "+p);
					}
				}
			}
		}
	}

}
