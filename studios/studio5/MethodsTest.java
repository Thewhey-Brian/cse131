package studio5;

import static org.junit.Assert.*;

import org.junit.Test;

public class MethodsTest {
    /**
     * this test the sum by using for loop
     */
	@Test
	public void testSum() {
		//
		// Try something simple
		//
		assertEquals(7, Methods.sum(3, 4));
		//
		// Try something fancier
		//
		for (int i=0; i < 10; ++i) {
			assertEquals(i+i, Methods.sum(i, i));
		}
		for (int i=0; i>-10; --i) {
			assertEquals(i+i, Methods.sum(i, i));
		}
	}
	
	/**
	 * this test the mpy by choosing two value
	 */
	@Test
	public void thisTestShouldFail() {
		assertEquals(0, Methods.mpy(0,3));
		assertEquals(10, Methods.mpy(2, 5));
	}
	/**
	 * this test the pig by if the specific string
	 */
	@Test
	public void testPig() {
		assertEquals("omputercay", Methods.pig("computer"));
		assertEquals("unfay", Methods.pig("fun"));
	}
	
	/**
	 * this test the arraysum by adding a specific array
	 */
	@Test
	public void testArraySum() {
		assertEquals(6.0, Methods.sumArray(new double[] { 1, 2, 3}), 0.1);
	}
	
	/**
	 * this test the avg3 by average three specific numbers
	 */
	@Test
	public void testAvg3() {
		assertEquals(2.0, Methods.avg3(1,2,3), 0.1);		
	}
	
	/**
	 * this test the average by applying it to two specific numbers
	 */
	@Test
	public void testAverage() {
		assertEquals(0.5, Methods.average(new double[] { 0, 1 }), 0.1);
	}
	
	/**
	 * this test the absolute by testing -10
	 */
	@Test
	public void absolute() {
		assertEquals(10, Methods.absolute(-10));
	}

}
