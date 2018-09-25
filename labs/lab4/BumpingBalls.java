package lab4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class BumpingBalls {
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt("How many balls do you want?");
		int i = ap.nextInt("The number of iterations?");
		int [] ball = new int [n];
		double [] x = new double [n];
		double [] y = new double [n];
		double [] vx = new double [n];
		double [] vy = new double [n];
		double a = 0.0;
		double b = 0.0;
		double d = 0.0;
		double c = 0.0;
		for(int k=0; k<n; ++k) {
			int r = (int) (Math.random()*10);
			int rr = (int) (Math.random()*10);
			vx[k] = Math.random()*Math.pow((-1), r)*0.03;
			vy[k] = Math.random()*Math.pow((-1), rr)*0.03;
		}
		for(int k=0; k<n; ++k) {
			x[k] = Math.random();
			y[k] = Math.random();
		}
		for(int p = 0; p<n; ++p) {
			a = x[p];
			b = y[p];
			StdDraw.setPenColor(Color.ORANGE);
			StdDraw.setPenRadius(0.05);
			StdDraw.point(a, b);
			StdDraw.pause(10);
			StdDraw.show(10);
		}
		while((a>=0&&a<1)||(b<1&&b>=0)) {
			StdDraw.clear();
			for(int k=0; k<n; ++k) {
				if ((Math.abs(x[k]) >= 1)||(x[k]<=0)) {
						vx[k] = -vx[k];
				} 
				if ((Math.abs(y[k]) >= 1)||(y[k]<=0)) {
						vy[k] = -vy[k];
				} 
				
				for(int p = 0; p<n; ++p) {
					double q1 = 0.0;
					double q2 = 0.0;
					for(int l = 0; l<n; ++l) {
						q1 = x[p]-x[l];
						q2 = y[p]-y[l];
						double qx = Math.abs(q1);
						double qy = Math.abs(q2);
						double q = Math.sqrt(qx*qx+qy*qy);
						if((q<=0.1)&&q!=0) {
							vx[p] = -vx[p];
							vy[p] = -vy[p];
						}
					}
				}
				x[k] = x[k]+vx[k];
				y[k] = y[k]+vy[k];
				a = x[k];
				b = y[k];
				StdDraw.setPenColor(Color.ORANGE);
				StdDraw.setPenRadius(0.05);
				StdDraw.point(a, b);
				StdDraw.show(1);
			}	
			StdDraw.show(100);
		}
		
		
		
		
		
		
		
		
			
	
	}

}
