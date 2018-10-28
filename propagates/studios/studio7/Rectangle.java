package studio7;

public class Rectangle {
	private double length, width;
	public Rectangle(double length, double width) {
		this.length= length;
		this.width= width;
	}
	
	public double getArea(){
		return length*width;
	}
	public double perimeter() {
		return 2*length+2*width;
	}
	public boolean square() {
		if(length==width) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean largerArea(Rectangle r1) {
		if(this.getArea()>r1.getArea()) {
			return true;
		}
		else {
			return false;
		}
	}
}
