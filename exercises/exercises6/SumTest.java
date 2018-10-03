package exercises6;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {

	@Test
	public void test() {
		assertEquals(6, Sum.sum(3));
		assertEquals(10, Sum.sum(4));
	}

}
