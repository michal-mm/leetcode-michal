package numbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivisibilityTest {

	@Test
	public void testSpec1() {
		int n = 99;
		boolean expected = true;
		
		Divisibility d = new Divisibility();
		
		assertEquals(expected, d.checkDivisibility(n));
	}
	
	@Test
	public void testSpec2() {
		int n = 23;
		boolean expected = false;
		
		Divisibility d = new Divisibility();
		
		assertEquals(expected, d.checkDivisibility(n));
	}
}
