package exercises6;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		assertEquals(0, Add.add(0, 0));
		assertEquals(20, Add.add(2, 18));
		assertEquals(9, Add.add(4, 5));
		assertEquals(-6, Add.addAny(-2,-4));
		assertEquals(10, Add.addAny(12, -2));
		//
		// write other test cases here:
		//
	}

}
