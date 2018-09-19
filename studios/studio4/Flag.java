package studio4;

import java.awt.Color;
import java.awt.Font;

import cse131.ArgsProcessor;
import sedgewick.StdAudio;
import sedgewick.StdDraw;
import sedgewick.StdIn;

public class Flag {

	
	public static void main(String[] args) {
		//
		ArgsProcessor.useStdInput("music");

        // repeat as long as there are more integers to read in
        while (!StdIn.isEmpty()) {

            // read in the pitch, where 0 = Concert A (A4)
            int pitch = StdIn.readInt();

            // read in duration in seconds
            double duration = StdIn.readDouble();

            // build sine wave with desired frequency
            double hz = 440 * Math.pow(2, pitch / 12.0);
            int N = (int) (StdAudio.SAMPLE_RATE * duration);
            double[] c = new double[N+1];
            for (int i = 0; i <= N; i++) {
                c[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
            }

            // play it using standard audio
            StdAudio.play(c);
        }
		//  Add code for your studio below here.
		//
		double x = 0.0;
		double y = 0.0;
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.02);
		StdDraw.rectangle(0.5, 0.5, 0.45, 0.3);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5, 0.5, 0.45, 0.3);
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.setPenRadius(0.026);
		x = 0.16;
		y = 0.69;
		StdDraw.line(x-0.05, y+0.02, x+0.05, y+0.02);
		StdDraw.line(x+0.05, y+0.02, x-0.03, y-0.05);
		StdDraw.line(x-0.03, y-0.05, x, y+0.05);
		StdDraw.line(x, y+0.05, x+0.03, y-0.05);
		StdDraw.line(x+0.03, y-0.05, x-0.05, y+0.02);
		x = 0.11;
		y = 0.55;
		StdDraw.line(x-0.03, y+0.01, x+0.03, y+0.01);
		StdDraw.line(x+0.03, y+0.01, x-0.015, y-0.03);
		StdDraw.line(x-0.015, y-0.03, x, y+0.03);
		StdDraw.line(x, y+0.03, x+0.015, y-0.03);
		StdDraw.line(x+0.015, y-0.03, x-0.03, y+0.01);
		x = 0.32;
		y = 0.74;
		StdDraw.line(x-0.03, y+0.01, x+0.03, y+0.01);
		StdDraw.line(x+0.03, y+0.01, x-0.015, y-0.03);
		StdDraw.line(x-0.015, y-0.03, x, y+0.03);
		StdDraw.line(x, y+0.03, x+0.015, y-0.03);
		StdDraw.line(x+0.015, y-0.03, x-0.03, y+0.01);
		x = 0.22;
		y = 0.57;
		StdDraw.line(x-0.03, y+0.01, x+0.03, y+0.01);
		StdDraw.line(x+0.03, y+0.01, x-0.015, y-0.03);
		StdDraw.line(x-0.015, y-0.03, x, y+0.03);
		StdDraw.line(x, y+0.03, x+0.015, y-0.03);
		StdDraw.line(x+0.015, y-0.03, x-0.03, y+0.01);
		x = 0.29;
		y = 0.65;
		StdDraw.line(x-0.03, y+0.01, x+0.03, y+0.01);
		StdDraw.line(x+0.03, y+0.01, x-0.015, y-0.03);
		StdDraw.line(x-0.015, y-0.03, x, y+0.03);
		StdDraw.line(x, y+0.03, x+0.015, y-0.03);
		StdDraw.line(x+0.015, y-0.03, x-0.03, y+0.01);
		
		double a = 0.18;
		double b = 0.74;
		StdDraw.setPenColor(Color.BLACK);
		//Font font = new Font("Arial", Font.BOLD, 36);
		//StdDraw.setFont(font);
		//StdDraw.text(0.18, 0.74, "CHINA");
		//StdDraw.text(0.82, 0.24, "CHINA");
		while(a<=0.83) {
			StdDraw.setPenColor(Color.BLACK);
		//	StdDraw.setFont(font);
			StdDraw.text(a, b, "CHINA");
			StdDraw.show(1000);
			a = a+0.128;
			b = b-0.1;
		}

    	
		
	}

	
}
