package studio7;

public class Complex {
	private double a,b;
	
	public Complex(double a, double b){
		this.a=a;
		this.b=b;
	}
	
	public void add(Complex c1){
		this.a+= c1.a;
		this.b+= c1.b;
	}
	
	public void multiply(Complex c1) {
		double one= this.a*c1.a - this.b*c1.b;
		double two= this.a*c1.b + this.b*c1.a;
		this.a=one;
		this.b=two;	
	}
	public String toString() {
		return this.a + " + " + this.b + "i";
	}
}