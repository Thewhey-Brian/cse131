package studio3;

import cse131.ArgsProcessor;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt("What size of array do you want?");
		int [] t = new int[n*2];
		System.out.println(t);
		for(int i=0; i<n-1; ++i) {
			t[i] = i+2;
		}
		for(int i=0; i<n; ++i) {
			if(t[i]!=0) {
				int m = n/t[i];
				for(int a=2; a<m+2;++a) {
					int s = ((i+2)*a)-2;
					t[s] = 0;
				}
			}
		}
		System.out.print("Primes under "+n+" = ");
		int u = t[0];
		System.out.print(u);
		for(int c=1; c<n-1; ++c) {
			int m = t[c];
			if(m!=0) {
	     		System.out.print(", "+m);
			}
		}
		
	}

}
