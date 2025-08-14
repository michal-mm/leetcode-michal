package numbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PerfectNumberTest {

	@Test
	public void testSpec1() {
		int num = 28;
		boolean expected = true;
		
		PerfectNumber pn = new PerfectNumber();
		
		assertEquals(expected, pn.checkPerfectNumber(num));
	}
	
	@Test
	public void testSpec2() {
		int num = 7;
		boolean expected = false;
		
		PerfectNumber pn = new PerfectNumber();
		
		assertEquals(expected, pn.checkPerfectNumber(num));
	}
}
