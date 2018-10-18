package studio6;

import cse131.NotYetImplementedException;
import sedgewick.StdDraw;

public class Circles {
	private static void recursiveCircles(double xCenter, double yCenter, double radius) {
		 if(radius<0.005) {
			 return;
		 }
		 
		 StdDraw.circle(xCenter, yCenter, radius);
		 
		 //StdDraw.pause(500);
		 
		 recursiveCircles(xCenter-radius, yCenter, (2-Math.sqrt(2))*radius/2);
		 recursiveCircles(xCenter, yCenter-radius, (2-Math.sqrt(2))*radius/2);
		 recursiveCircles(xCenter+radius, yCenter, (2-Math.sqrt(2))*radius/2);
		 recursiveCircles(xCenter, yCenter+radius, (2-Math.sqrt(2))*radius/2);
		 
	}

	public static void main(String[] args) {
		StdDraw.setXscale(-1, +1);
		StdDraw.setYscale(-1, +1);
		recursiveCircles(0, 0, 0.5);
		StdDraw.show(10);
	}
}
