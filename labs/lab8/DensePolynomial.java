package lab8;

import java.util.Arrays;

public class DensePolynomial {
	
	private final double[] c;

	public DensePolynomial() {
		int num = calculateArrayLengthRequiredFor(Polynomial.degree);
		double[] p = new double[101];
		this.c = p;
	}
	
	private DensePolynomial(double[] c) {
		this.c = c;
	}
	
	public Polynomial addTerm(double coefficient, int degree) {
		if(coefficient!=0) {
			this.c[degree] = this.c[degree] + coefficient;
		}
		Polynomial ans = new Polynomial();
		ans.c = c;
		return ans;
	}
	
	public int degree() {
		int ans = 0;
		for(int i=0; i<c.length; ++i) {
			if(c[i]!=0) {
				ans = i;
			}
		}
		return ans;
	}
	
	public double getCoefficientAtDegree(int degree) {
		if(c[degree] == 0) {
			return 0.0;
		}
		else {
			return c[degree];
		}
	}
	
	public double evaluate(double x) {
		double ans = 0;
		for(int i=0; i<c.length; ++i) {
			if(c[i]!=0) {
				ans = ans + c[i]*Math.pow(x, i);
			}
		}
		return ans;
	}
	
	public Polynomial derivative() {
		Polynomial dev = new Polynomial(this.c);
		for(int i=0; i<c.length; ++i) {
			c[i] = c[i]*i;
		}
		for(int j=1; j<c.length; ++j) {
			c[j-1] = c[j];
		}
		c[c.length-1] = 0;
		return dev;
	}
	
	public Polynomial sum(Polynomial other) {
		
	}
	
	@Override
	public String toString() {
		return "DensePolynomial [c=" + Arrays.toString(c) + "]";
	}


}
