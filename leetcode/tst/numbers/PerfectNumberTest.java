package numbers;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
