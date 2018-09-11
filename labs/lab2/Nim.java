package lab2;

import cse131.ArgsProcessor;

public class Nim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int k = 0;
		int sticks = ap.nextInt("How many sticks is there?");
		boolean f = ap.nextBoolean("Do you want to play first?");
		int removeC = 0;
		int removeH = 0;
		if(f==true) {
			System.out.println("Humen starts");
			for (int i=0; sticks>0; i=i+2) {
				if(sticks<2) {
					i = i+1;
					System.out.print("Round "+i+", ");
					System.out.print(sticks+" sticks at starts, ");
					removeH = 1;
					System.out.print("Human took "+removeH+", ");
					sticks = sticks-removeH;
					System.out.println("so "+sticks+" remain");
					System.out.println("Human wins!");
					sticks = sticks-1;
				}
				
				else {
					removeH = ap.nextInt("How many sticks do you want to remove?");
					for(;removeH>2;) {
						removeH = ap.nextInt("How many sticks do you want to remove?");
					}
					System.out.print("Round "+i+", ");
					System.out.print(sticks+" sticks at starts, ");
					System.out.print("Human took "+removeH+", ");
					sticks = sticks-removeH;
					System.out.println("so "+sticks+" remain");
					if(sticks==0) {
						System.out.println("Human wins!");
					}
					
					if(sticks!=0) {
					if(sticks==1) {
						k = i+1;
						System.out.print("Round "+k+", ");
						System.out.print(sticks+" sticks at starts, ");
						System.out.print("Computer took "+removeC+", ");
						sticks = sticks-removeC;
						System.out.println("so "+sticks+" remain");
						System.out.println("Computer wins!");
					}
					else {
					if(Math.random()<0.5) {
						removeC = 1;
					}
					else {
						removeC = 2;
					}
					k = i+1;
					System.out.print("Round "+k+", ");
					System.out.print(sticks+" sticks at starts, ");
					System.out.print("Computer took "+removeC+", ");
					sticks = sticks-removeC;
					System.out.println("so "+sticks+" remain");
					if(sticks==0) {
						System.out.println("Computer wins!");
					}}
				}
				
			}
		}}
		else{
			System.out.println("Computer starts");
			for (int i=0; sticks>0; i=i+2) {
				if(sticks<2) {
					System.out.print("Round "+i+", ");
					System.out.print(sticks+" sticks at starts, ");
					removeC = 1;
					System.out.print("Computer took "+removeC+", ");
					sticks = sticks-removeC;
					System.out.println("so "+sticks+" remain");
					System.out.println("Computer wins!");
					sticks = sticks-1;
				}
				
				else {
					if(Math.random()<0.5) {
						removeC = 1;
					}
					else {
						removeC = 2;
					}
					
					System.out.print("Round "+i+", ");
					System.out.print(sticks+" sticks at starts, ");
					System.out.print("Computer took "+removeC+", ");
					sticks = sticks-removeC;
					System.out.println("so "+sticks+" remain");
					if(sticks==1) {
						i = i+1;
						removeH = 1;
						System.out.print("Round "+i+", ");
						System.out.print(sticks+" sticks at starts, ");
						System.out.print("Human took "+removeH+", ");
						sticks = sticks-removeH;
						System.out.println("so "+sticks+" remain");
						System.out.println("Human wins!");
						sticks = sticks-1;
					}
					if(sticks==0) {
						System.out.println("Computer wins!");
					}
					
					if(sticks>0) {
					removeH = ap.nextInt("How many sticks do you want to remove?");
					for(;removeH>2;) {
						removeH = ap.nextInt("How many sticks do you want to remove?");
					}
					k = i+1;
					System.out.print("Round "+k+", ");
					System.out.print(sticks+" sticks at starts, ");
					System.out.print("Human took "+removeH+", ");
					sticks = sticks-removeH;
					System.out.println("so "+sticks+" remain");
					if(sticks==0) {
						System.out.println("Human wins!");
						
					}
					}

				}
				
			}
		}
		
		

	}

}
