package lab8;

import java.util.Arrays;

public class DensePolynomial implements Polynomial{

	private final double[] c;

	public DensePolynomial() {
		double[] p = { 0 };
		this.c = p;
	}

	public DensePolynomial(double[] d) {
		this.c = d;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(c);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DensePolynomial other = (DensePolynomial) obj;
		if (!Arrays.equals(c, other.c))
			return false;
		return true;
	}

	/**
	 * Return a new Polynomial that includes the supplied coefficient and degree
	 * term. If the supplied term is of the same degree as an already existing Term
	 * in this Polynomial, then the coefficients of the supplied and existing terms
	 * are summed in the returned new Polynomial.
	 * 
	 * This Polynomial must not be disturbed by this method. Be sure to return a new
	 * Polynomial that is like this one, but with the extra term included.
	 * 
	 * @param coefficient
	 * @param degree
	 * @return new Polynomial as described above
	 */
	public Polynomial addTerm(double coefficient, int degree) {
		if(coefficient == 0) {
			Polynomial ans = new DensePolynomial(this.c);
			return ans;
		}
		double[] ansArray = CoefficientArrayUtils.createNextCoefficients(coefficient, degree, this.c);
		Polynomial d = new DensePolynomial(ansArray);
		return d;
	}

	/**
	 * Return the degree of this Polynomial, computed as the highest degree Term of
	 * this Polynomial over all Terms with non-zero coefficients. The degree of all
	 * Polynomials is at least 0, because a Polynomial with no Terms is equivalent
	 * to 0.0 x^0
	 * 
	 * @return the degree of this Polynomial
	 */
	public int degree() {
		int ans = 0;
		for (int i = 0; i < c.length; ++i) {
			if (c[i] != 0) {
				ans = i;
			}
		}
		return ans;
	}

	/**
	 * Returns the coefficient of the term at the specified degree. If no such term
	 * exists in the Polynomial, 0.0 should be returned.
	 * 
	 * @param degree of interest
	 * @return coefficient of the degree of interest
	 */
	public double getCoefficientAtDegree(int degree) {
		if (degree > this.c.length-1) {
			return 0.0;
		} else {
			return c[degree];
		}
	}

	/**
	 * Evaluate this Polynomial at the specified value for x
	 * 
	 * @param x value of the unknown
	 * @return the sum of all terms evaluated at x
	 */
	public double evaluate(double x) {
		double ans = 0;
		for (int i = 0; i < c.length; ++i) {
			if (c[i] != 0) {
				ans = ans + c[i] * Math.pow(x, i);
			}
		}
		return ans;
	}

	/**
	 * Returns a new Polynomial that is the derivative of this one. Be sure not to
	 * modify this Polynomial.
	 * 
	 * @return
	 */
	public DensePolynomial derivative() {
		// DensePolynomial dev = new DensePolynomial(this.c);
		double[] cup = new double[c.length];
		for (int i = 0; i < c.length; ++i) {
			cup[i] = c[i];
		}
		for (int i = 0; i < c.length; ++i) {
			cup[i] = cup[i] * i;
		}
		for (int j = 1; j < c.length; ++j) {
			cup[j - 1] = cup[j];
		}
		cup[c.length - 1] = 0;
		DensePolynomial dev = new DensePolynomial(cup);
		return dev;
	}

	/**
	 * Return a new Polynomial that is the sum of this one and the other one. Be
	 * sure not to disturb this Polynomial.
	 * 
	 * @param other another Polynomial
	 * @return the sum of this and the other Polynomial
	 */
	public Polynomial sum(Polynomial other) {
		if(other.degree()+1<1) {
			return this;
		}
		else {
			double[] cup = new double[c.length];
			for (int i = 0; i < c.length; ++i) {
				cup[i] = c[i];
			}
			for (int i = 0; i < other.degree()+1; ++i) {
				double coe = other.getCoefficientAtDegree(i);
				cup = CoefficientArrayUtils.createNextCoefficients(coe, i, cup);
			}
			Polynomial sum = new DensePolynomial(cup);
			return sum;
		}
		
	}

	@Override
	public String toString() {
		String ans = "";
		for(int i=c.length-1; i>0; i--) {
			ans = ans + c[i] + "x^" + i;
		}
		ans = ans + c[0];
		return  ans;
	}

	

	
	


	



}
