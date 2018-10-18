package studio6;

import java.awt.Color;

import sedgewick.StdDraw;

public class CantorStool {
	
		// TODO Auto-generated method stub
		public static void ct(double x, double y, double hsize, double wsize) {
			if(wsize<0.01) {
				return;
			}
			
			StdDraw.filledRectangle(x, y, wsize, hsize);
			
			StdDraw.pause(500);
			
			ct(x-wsize*2/3, y-6*hsize/4, hsize/2, wsize/3);
			ct(x+wsize*2/3, y-6*hsize/4, hsize/2, wsize/3);
		

	}
		
		public static void main(String[] args) {
			StdDraw.setPenColor(Color.BLACK);
			ct(0.5, 0.75, 0.25, 0.5);
		}

}
