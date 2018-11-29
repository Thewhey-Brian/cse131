package lab9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import lab8.CoefficientArrayUtils;
import lab8.DensePolynomial;
import lab8.Polynomial;

public class SparsePolynomial implements Polynomial {
	
	private final Map<Integer, Double> c;
	
	public SparsePolynomial(Map<Integer, Double> c) {
		this.c = c;
	}

	public SparsePolynomial() {
		Map<Integer, Double> p = new HashMap<Integer, Double>();
		this.c = p;
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
			Polynomial ans = new SparsePolynomial(this.c);
			return ans;
		}
		Map<Integer, Double> map = MapDegreeToCoefficientUtils.createNextMap(coefficient, degree, c);
		Polynomial d = new SparsePolynomial(map);
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
		for(int i=0; i<=100; i++) {
			if(c.get(i) != null) {
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
		if(c.get(degree)==null) {
			return 0.0;
		}
		else {
			return c.get(degree);
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
		if(c.keySet()==null) {
			return 0;
		}
		else {
			for(int degree : c.keySet()) {
				ans = ans + c.get(degree)*Math.pow(x, degree);
			}
//			for(int i=0; i<100; ++i) {
//				if(c.get(i)!=null){
//					ans = ans + c.get(i)*Math.pow(x, i);				
//				}
//			}
			return ans;
		}
	}
	
	/**
	 * Returns a new Polynomial that is the derivative of this one. Be sure not to
	 * modify this Polynomial.
	 * 
	 * @return
	 */
	public Polynomial derivative() {
		Map<Integer, Double> map = MapDegreeToCoefficientUtils.copyMap(c);
		map.put(c.size()-1, 0.0);
		map.put(0, 0.0);
		for(int i=1; i<100; ++i) {
			if(c.get(i)!=null){
				Double coe = i * c.get(i);
				map.put(i-1, coe);
				map.remove(i);
			}
		}
		Polynomial ans = new SparsePolynomial(map);
		return ans;
	}
	
	/**
	 * Return a new Polynomial that is the sum of this one and the other one. Be
	 * sure not to disturb this Polynomial.
	 * 
	 * @param other another Polynomial
	 * @return the sum of this and the other Polynomial
	 */
	public Polynomial sum(Polynomial other) {
		Map<Integer, Double> map = MapDegreeToCoefficientUtils.copyMap(c);
		if(other.degree()+1<1) {
			Polynomial ans = new SparsePolynomial(map);
			return ans;
		}
		else {
			for(int i=0; i<other.degree()+1; ++i) {
				if(other.getCoefficientAtDegree(i)!=0) {
					map = MapDegreeToCoefficientUtils.createNextMap(other.getCoefficientAtDegree(i), i, map);
				}
			}
			Polynomial ans = new SparsePolynomial(map);
			return ans;
		}
	}

	@Override
	public String toString() {
		String ans = "";
		for(int i=100; i>0; --i) {
			if(c.get(i)!=null){
				ans = ans + c.get(i) + "x^" + i;
			}
		}
		ans = ans + c.get(0);
		return ans;
	}
	
	


	
	

}
