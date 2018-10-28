package studio7;

public class fraction {
	
	private int numerator, denominator;
	
	public fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int getNumerator() {
		return this.numerator;
	}
	public int getDenominator() {
		return this.denominator;
	}
	public void add(fraction f1) {
		int newNum= this.numerator* f1.denominator;
		int newNum2= f1.numerator*this.denominator;
		int newDen= this.denominator*f1.denominator;
		this.denominator= newDen;
		this.numerator=newNum+newNum2;
	}
 
	public void multiple(fraction f1) {
		int newNum= this.numerator* f1.numerator;
		int newDen= this.denominator*f1.denominator;
		this.denominator= newDen;
		this.numerator=newNum;
	}
	
	public fraction reciprocal() {
		fraction f = new fraction (denominator, numerator);
		return f;
	}
 
	public void simplify() {
		for(int i=2; i<this.numerator;i++) {
			if((numerator%i)==0 && (denominator%i)==0)
			{
				this.numerator= this.numerator/i;
				this.denominator= this.denominator/i;
			}
		}
	}
	
	public String toString() {
		String s = "";
		s += (this.numerator + "/" + this.denominator);
		return s;
	}
 
}
