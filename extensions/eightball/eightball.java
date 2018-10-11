package eightball;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class eightball {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		StdDraw.setPenColor(Color.black );
		StdDraw.setPenRadius(0.02);
		StdDraw.filledCircle(0.5, 0.5, 0.5);
		double d = 0;
		double[] x = new double[3];
		double[] y = new double[3];
		String[] p = new String[10];
		String[] n = new String[5];
		String[] a = new String[5];
		p[0]="It is certain"; p[1]="It is decidedly so"; p[2]="Without a doubt"; p[3]="Yes definitly"; p[4]="You may rely on it"; p[5]="As I see it, yes"; p[6]="Most likely"; p[7]="Outlook good"; p[8]="Yes"; p[9]="Signs point to yes";
		n[0]="Don't count on it"; n[1]="My reply is no"; n[2]="My sources say no"; n[3]="Outlook not so good"; n[4]="Very doubtful";
		a[0]="Reply hazy try again"; a[1]="Ask again later"; a[2]="Better not tell you now"; a[3]="Cannot predict now"; a[4]="Concentrate and ask again"; 
		x[0] = 0.15; x[1] = 0.85; x[2] = 0.5;
		y[0] = 0.75; y[1] = 0.75; y[2] = 0.12;
		StdDraw.setPenColor(Color.blue);
		StdDraw.filledPolygon(x, y);
		while(true) {
			double v = Math.random();
			String user = ap.nextString("Want to have a try?");
			if(v<0.33333) {
				//positive
				int num = (int)(Math.random()*100)/10;
				for(int i=0; i<101; ++i) {
					d = 3.6*i;
					StdDraw.clear();
					StdDraw.setPenColor(Color.black );
					StdDraw.setPenRadius(0.02);
					StdDraw.filledCircle(0.5, 0.5, 0.5);
					StdDraw.setPenColor(new Color(0, 0, (int) (2.55*i)));
					StdDraw.filledPolygon(x, y);
					for(int j=10; 10*j-i>0; --j) {
						for(int k=1; k<6; ++k) {
							StdDraw.setPenColor(new Color(0, (int) (2.55*i), 0));
							StdDraw.text(0.5, 0.55, p[num], d-(10*j-i)*0.6+5.6);
							StdDraw.show(1);
						}
					}
				}
			}
		else {
				if(v>0.66666) {
					//negative
					int num = (int)(Math.random()*100)/20;
					for(int i=0; i<101; ++i) {
						d = 3.6*i;
						StdDraw.clear();
						StdDraw.setPenColor(Color.black );
						StdDraw.setPenRadius(0.02);
						StdDraw.filledCircle(0.5, 0.5, 0.5);
						StdDraw.setPenColor(new Color(0, 0, (int) (2.55*i)));
						StdDraw.filledPolygon(x, y);
						for(int j=10; 10*j-i>0; --j) {
							for(int k=1; k<6; ++k) {
								StdDraw.setPenColor(new Color((int) (2.55*i), 0, 0));
								StdDraw.text(0.5, 0.55, n[num], d-(10*j-i)*0.6+5.6);
								StdDraw.show(1);
							}
						}
					}
					
				}
				else {
					//try again
					int num = (int)(Math.random()*100)/20;
					for(int i=0; i<101; ++i) {
						d = 3.6*i;
						StdDraw.clear();
						StdDraw.setPenColor(Color.black );
						StdDraw.setPenRadius(0.02);
						StdDraw.filledCircle(0.5, 0.5, 0.5);
						StdDraw.setPenColor(new Color(0, 0, (int) (2.55*i)));
						StdDraw.filledPolygon(x, y);
						for(int j=10; 10*j-i>0; --j) {
							for(int k=1; k<6; ++k) {
								StdDraw.setPenColor(new Color((int) (2.55*i), (int) (2.55*i), 0));
								StdDraw.text(0.5, 0.55, a[num], d-(10*j-i)*0.6+5.6);
								StdDraw.show(1);
							}
						}
					}
					
				}
			}
			
		}
		
	}

}
