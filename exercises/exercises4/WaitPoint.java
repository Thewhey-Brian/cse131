package exercises4;

import sedgewick.StdDraw;

public class WaitPoint {

	public static void main(String[] args) {
		// wait for the mouse to be pressed and released
		while(!StdDraw.mousePressed()) {
			
		}
		System.out.println("Pressed");
		// here, the mouse has been pressed
		while(StdDraw.mousePressed()) {
			
		}
		System.out.println("Released");
		// here the mouse is released
		
		
		// draw a point at the location of the mouse
		StdDraw.setPenRadius(0.02);
		StdDraw.point(StdDraw.mouseX(), StdDraw.mouseY());
		
		// here, a q has been typed
		char key = ' ';
		while(key!='q') {
		while(!StdDraw.hasNextKeyTyped()) {
			StdDraw.pause(200);
		}
		key = StdDraw.nextKeyTyped();
		if(key == 'q') {
			StdDraw.text(0.5, 0.5, "Farewell!");
		}
		
		}

	}

}
