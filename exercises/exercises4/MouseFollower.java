package exercises4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class MouseFollower {

	public static void main(String[] args) {
		
		
		while (true) {
			StdDraw.clear();
			//
			// Render one frame of your animation below here
			//
			StdDraw.setPenColor(Color.green);
			StdDraw.setPenRadius(0.05);
			while(true) {
				StdDraw.clear();
				double x = StdDraw.mouseX();
				double y = StdDraw.mouseY();
				StdDraw.pause(100);
				StdDraw.point(x, y);
				StdDraw.pause(100);
				StdDraw.show(10);
			}

			
			//  
			// End of your frame
			//
			// Stdraw.show(..) achieves double buffering and
			//   avoids the tight spinning loop
			
		}

	}

}
