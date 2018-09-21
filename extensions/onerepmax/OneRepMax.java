package onerepmax;

import cse131.ArgsProcessor;

public class OneRepMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int weight = ap.nextInt("The successful weight?");
		int reps = ap.nextInt("The successful reps?");
		int dreps = ap.nextInt("The desired reps?");
		double a = 1+dreps*1.0/30.0;
		double rm = weight*a;
		int rm1 = (int)rm;
		int rm2 = rm1;
		int p = rm1%10;
		if(p!=5) {
			if(p>5) {
				rm1 = (int) (rm1/10+1)*10;
			}
			else {
				rm1 = (int) (rm1/10)*10+5;
			}
		}
		System.out.println("One-rep max: "+rm1);
		System.out.println("Weight for "+dreps+" reps: "+weight);
		for (int i=95; i>49; i=i-5) {
			rm =i*rm2/100;
			int y = (int)rm%10;
			if(y!=5) {
				if(y>5) {
					rm = (int) (rm/10+1)*10;
				}
				else {
					rm = (int) (rm/10)*10+5;
				}
			}
			int rm0 = (int) rm;
			System.out.println(i+"%"+" 1 RM : "+rm0);
		}

	}

}
