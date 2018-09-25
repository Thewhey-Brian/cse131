package imageprocessor;
/**
 * Name: Jake Gordon
 * Lab Section: H
 * Date:9/13
 * ImageProcessor.java
 * CSE 131 Lab 1
 */

import java.awt.Color;
import java.util.Random;



public class Filters {
	// Some sample methods:

	// This method cuts each color component of a pixel in half to produce the new image.
	public static int darker(int pixelComponent) {
		return pixelComponent/2;
	}

	// This method sums the color components of two pixels to produce a third.
	// Note that when the total exceeds 255, there is a strange effect.
	// USED IN: example_combine
	public static int combine(int pixelAComponent, int pixelBComponent) {
		return pixelAComponent+pixelBComponent;
	}

	// This method takes the color of each pixel and creates a new color without any green.  Returns an array of integers [r, g ,b].
	// USED IN: example_purplish
	public static Color purplish(Color c) {
		int red   = c.getRed();
		int green = c.getGreen();
		int blue  = c.getBlue();
		return new Color(red, 0, blue);  // FIXME
	}

	// Now that you've seen the examples, complete the following methods.
	// The headers have been completed for you.
	//
	// NB: The 'return 0' and 'return new Color(0,0,0)' lines are simply placeholders
	// to prevent the compiler from complaining.  They should be removed or modified when
	// you add your implementation.

	/**Complete the method called copy that copies
	 *the first source image to the target panel.  
	 *(Hint: This is a very simple method.)**/
	public static int copy(int pixelComponent) {
		return pixelComponent;  // FIXME
	}
	//This method averages the color components of two pixels.
	// USED IN: composite
	public static int composite(int a, int b) {
		return  (a+b)/2;  // FIXME
	}

	//This method returns the negative of a pixel by inverting its color components.
	// USED IN: negative
	public static int negative(int a) {
		return a = 255-a;  // FIXME
	}

	//This method reduces the number of possible values for a given color component
	//from 256 to 2, by returning either 0 or 255 based on the original value.
	// USED IN: posterize
	public static int posterize(int a) {
		return a = (a/128)*255 ;  // FIXME
	}

	//This method returns a color that is brighter than the original color.
	// USED IN: brighter
	//FIX ME
	public static Color brighter(Color c) {
		return c.brighter();  // FIXME
	}

	//This method returns a color that is some shade of gray, by making a new
	//color having equal RGB components. returns an array of integers [r, g ,b].
	// USED IN: grayscale
	public static Color grayscale(Color c) {
		int red   = c.getRed();
		int green = c.getGreen();
		int blue  = c.getBlue();
		int ave = (red+green+blue)/3;
		red = ave;
		green = ave;
		blue = ave;
		return new Color(ave, ave, ave);  // FIXME
		
	}

	//This method returns either black or white, based on the intensity of the
	//originally provided color. returns an array of integers [r, g ,b].
	// USED IN: blackWhite
	public static Color blackAndWhite(Color c) {
		int red   = c.getRed();
		int green = c.getGreen();
		int blue  = c.getBlue();
		int ave = (red+green+blue)/3;
		for(; ave>128; ) {
			return Color.WHITE;
		}
		return Color.black;   // FIXME
	}

	//This method combines two images by choosing for each location the brighter 
	//pixel in the same location from the two source images.
	// USED IN: combineBrighter
	public static Color combineBrighter(Color c1, Color c2) {
		int r1, g1, b1;
		r1 = c1.getRed();  // FIXME
		g1 = c1.getGreen();
		b1 = c1.getBlue();
		int sum1 = r1+g1+b1;
		int r2, g2, b2;
		r2 = c2.getRed();  // FIXME
		g2 = c2.getGreen();
		b2 = c2.getBlue();
		int sum2 = r2+g2+b2;
		for (;sum1>sum2;) {
			Color result = new Color(r1, g1, b1);
			return result;
		}
		for (;sum2>sum1;) {
			Color result = new Color(r2, g2, b2);
			return result;
		}
		return c1;
		
		//int rf = (sum1/sum2)*r1+(sum2/sum1)*r2;
		//int gf = (sum1/sum2)*g1+(sum2/sum1)*g2;
		//int bf = (sum1/sum2)*b1+(sum2/sum1)*b2;
		//Color result = new Color(rf, gf, bf);
		//return result;

	}
	/**This is the beginning of another extension*
	 * 
	 * 
	 */

	//This method performs background subtraction by returning the color blue
	//if the two colors are close enough; otherwise, it returns the first color.
	/**
	 * 
	 * @param source1Color one color
	 * @param source2Color another color
	 * @param tolerance the saturation difference between color components, such that they are considered the same
	 * @return
	 */
	public static Color bgSubtract(Color source1Color, Color source2Color, int tolerance) {
		int r1, g1, b1;
		r1 = source1Color.getRed();  // FIXME
		g1 = source1Color.getGreen();
		b1 = source1Color.getBlue();
		int sum1 = r1+g1+b1;
		int r2, g2, b2;
		r2 = source2Color.getRed();  // FIXME
		g2 = source2Color.getGreen();
		b2 = source2Color.getBlue();
		int sum2 = r2+g2+b2;
		int a = Math.max(sum1, sum2)-Math.min(sum1, sum2);
		if (a<=tolerance) {
			return Color.blue;
		}
		else {
			return source1Color;
		}

	}
	

	private static Random r = new Random();
	public static Color genRandomColor() {
		return new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));		
	}
	//This method performs background replacement by returning the color from the
	//second image if the color from the first image is blue; otherwise returns
	//the color from the first image.
	public static Color bgReplace(Color s1Color, Color s2Color) {
		int r1, g1, b1;
		r1 = s1Color.getRed();  // FIXME
		g1 = s1Color.getGreen();
		b1 = s1Color.getBlue();
		int r2, g2, b2;
		r2 = s2Color.getRed();  // FIXME
		g2 = s2Color.getGreen();
		b2 = s2Color.getBlue();
		if(b1==255) {
			Color result = new Color(r2, g2, b2);
			return result;
		}
		else {
			Color result = new Color(r1, g1, b1);
			return result;
		}
	}

}
