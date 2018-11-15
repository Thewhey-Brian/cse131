package lab4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class BumpingBalls {
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt("How many balls do you want?");
		int i = ap.nextInt("The number of iterations?");
		int c = 0;
		double q1 = 0.0;
		double q2 = 0.0;
		double [] x = new double [n];
		double [] y = new double [n];
		double [] vx = new double [n];
		double [] vy = new double [n];
		double a = 0.0;
		double b = 0.0;
		for(int k=0; k<n; ++k) {
			int r = (int) (Math.random()*10);
			int rr = (int) (Math.random()*10);
			vx[k] = Math.random()*Math.pow((-1), r)*0.012;
			vy[k] = Math.random()*Math.pow((-1), rr)*0.012;
			x[k] = Math.random();
			y[k] = Math.random();
		}
		for(int p = 0; p<n; ++p) {
			for(int l = 0; l<n; ++l) {
				q1 = x[p]-x[l];
				q2 = y[p]-y[l];
				double qx = Math.abs(q1);
				double qy = Math.abs(q2);
				double q = Math.sqrt(qx*qx+qy*qy);
				if((q<=0.082)&&q!=0) {
					x[l] = Math.random();
					y[l] = Math.random();
				}
			}
		}
		while(true) {
			for(int k=0; k<n; ++k) {
				if ((Math.abs(x[k]+vx[k]) >= 1.0)||(x[k]+vx[k]<=0)) {
						vx[k] = -vx[k];
				} 
				if ((Math.abs(y[k]+vy[k]) >= 1.0)||(y[k]+vy[k]<=0)) {
						vy[k] = -vy[k];
				} 
			}//ball+wall
			
			for(int p = 0; p<n; ++p) {
				for(int l = 0; l<n; ++l) {
					q1 = x[p]-x[l];
					q2 = y[p]-y[l];
					double qx = Math.abs(q1);
					double qy = Math.abs(q2);
					double q = Math.sqrt(qx*qx+qy*qy);
					if((q<=0.092)&&q!=0) {
						vx[l] = -vx[l];
						vy[l] = -vy[l];
					}
				}
			}//ball+ball
			
			StdDraw.clear();
			for(int t=0; t<n; ++t) {
				x[t] = x[t]+vx[t];
				y[t] = y[t]+vy[t];
				a = x[t];
				b = y[t];
				StdDraw.setPenColor(Color.BLACK);
				StdDraw.setPenRadius(0.02);
				StdDraw.circle(a, b, 0.04);
				StdDraw.setPenColor(Color.ORANGE);
				StdDraw.setPenRadius(0.08);
				StdDraw.point(a, b);
			}
			StdDraw.show(100);
		}	
		
		
		
		
		
		
		
		
		
		
			
	
	}

}
