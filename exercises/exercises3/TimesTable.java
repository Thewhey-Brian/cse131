package exercises3;

import cse131.ArgsProcessor;

public class TimesTable {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("Max value for table?");
		System.out.print("     ");
		//  Table should include rows and columns for 0...N  
		//     making N+1 rows and columns
		for(int a=0; a<(N+1); ++a) {
			System.out.print(a+"  ");
		}
		System.out.println("  ");
		for(int a=0; a<(N+1); ++a) {
			System.out.print("----");
		}
		System.out.print("     ");
		
		int [][] table = new int[N+1][N+1];
		for(int i=0; i<(N+1); ++i) {
			System.out.println(" ");
			System.out.print(i+" |");
			for(int j=0; j<(N+1); ++j) {
				table[i][j] = (i*j);
				}
			for(int c=0; c<N+1; ++c) {
				int entry=table[i][c];
				if(entry<10) {
					System.out.print("  "+table[i][c]);
				}
				else {
					System.out.print(" "+table[i][c]);
				}
			}
		}
		
	}

}
