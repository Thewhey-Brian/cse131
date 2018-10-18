package lab6;

import java.awt.Color;

import sedgewick.StdDraw;

public class triangle {
	public static void ti(double x, double y, double size) {
		if(size<0.05) {
			return;
		}
		double[] a = new double[3];
		double[] b = new double[3];
		a[0] = x+size/4.0; b[0] = y+Math.sqrt(3)/4.0*size;
		a[1] = x+size*3.0/4.0; b[1] = y+Math.sqrt(3)/4.0*size;
		a[2] = x+size/2; b[2] = y;
		StdDraw.filledPolygon(a, b);
		//StdDraw.line(x, y, x+size, y);
		//StdDraw.line(x+size, y, x+size/2, y+Math.sqrt(3)/2.0*size);
		//StdDraw.line(x+size/2, y+Math.sqrt(3)/2.0*size, x, y);
		
		//StdDraw.pause(500);
		ti(x, y, size/2);
		ti(x+size/2, y, size/2);
		ti(x+size/4, y+Math.sqrt(3)/4.0*size, size/2);
	}
	
	
	public static void main(String[] args) {
		double[] a = new double[3];
		double[] b = new double[3];
		StdDraw.setPenColor(Color.black);
		a[0] = 0; b[0] = 0;
		a[1] = 0.8; b[1] = 0;
		a[2] = 0+0.8/2; b[2] = 0+Math.sqrt(3)/2.0*0.8;
		StdDraw.filledPolygon(a, b);
		StdDraw.setPenColor(Color.white);
		ti(0, 0, 0.8);
		StdDraw.show(10);
	}
		

}
