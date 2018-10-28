/**
 * 
 */
package studio7;

/**
 * @author TomKao
 *
 */
public class testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fraction f = new fraction(2,3);
		fraction f2 = f.reciprocal();
		System.out.println(f.toString());
		System.out.println(f2.toString());
		fraction f3= new fraction (4,6);
		f3.simplify();
		System.out.println(f3.toString());

	}

}
