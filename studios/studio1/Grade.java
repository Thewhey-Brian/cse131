package studio1;

import cse131.ArgsProcessor;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		String n0 = ap.nextString("What's your name?");
		int n1 = ap.nextInt("Your participation grade?");
		int n2 = ap.nextInt("Your quizzes grade?");
		int n3 = ap.nextInt("Your tudios grade?");
		int n4 = ap.nextInt("Your labs grade?");
		int n5 = ap.nextInt("Your extensions grade?");
		int n6 = ap.nextInt("Your exam one grade?");
		int n7 = ap.nextInt("Your exam two grade?");
		int n8 = ap.nextInt("Your exam tree grade?");
		double n9 = 0.1*n1+0.02*n2+0.08*n3+0.25*n4+0.25*n5+0.15*(n6+n7+n8-Math.min(Math.min(n6, n7),n8));
		int n10=(int)n9;
		boolean n11 = n10 % 10 > 3;
		boolean n12 = n10 % 10 < 3;
		System.out.println(n0+":");
		System.out.println("Total score:"+n9);
		System.out.println("Final grade for this score:"+n10);
		System.out.println("Final grade has a......");
		System.out.println(" Plus: "+n11);
		System.out.println(" Minus: "+n12);
		

	}

}
