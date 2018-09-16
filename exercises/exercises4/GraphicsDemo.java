package exercises4;

import java.awt.Color;

import sedgewick.StdDraw;

public class GraphicsDemo {

	public static void main(String[] args) {
		// blue point (look carefully, will be very small on your screen)
		StdDraw.setPenColor(Color.blue);
		StdDraw.point(0.5, 0.5);
		// larger green point
		StdDraw.setPenColor(Color.green);
		StdDraw.setPenRadius(0.05);
		StdDraw.point(0.25, 0.25);
		// unfilled red triangle
		StdDraw.setPenColor(Color.red);
		StdDraw.setPenRadius(0.01);
		StdDraw.line(0, 0, 0, 0.5);
		StdDraw.line(0, 0.5, 0.5, 0);
		StdDraw.line(0.5, 0, 0, 0);
		// yellow circle, filled
		StdDraw.setPenColor(Color.yellow);
		StdDraw.filledCircle(0.5, 0.5, 0.2);
		// filled blue rectangle
		StdDraw.setPenColor(Color.blue);
		StdDraw.filledRectangle(0.5, 0.5, 0.1, 0.1);


	}

}
