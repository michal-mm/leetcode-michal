package strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestSameDigitNumberStrTest {

	@Test
	public void testSpec1() {
		String num = "6777133339";
		String expected = "777";
		
		LargestSameDigitNumberStr lssns = new LargestSameDigitNumberStr();
		
		assertEquals(expected, lssns.largestGoodInteger(num));
		assertEquals(expected, lssns.betterLargestGootInteger(num));
	}
	
	@Test
	public void testSpec2() {
		String num = "2300019";
		String expected = "000";
		
		LargestSameDigitNumberStr lssns = new LargestSameDigitNumberStr();
		
		assertEquals(expected, lssns.largestGoodInteger(num));
		assertEquals(expected, lssns.betterLargestGootInteger(num));
	}
	
	@Test
	public void testSpec3() {
		String num = "42352338";
		String expected = "";
		
		LargestSameDigitNumberStr lssns = new LargestSameDigitNumberStr();
		
		assertEquals(expected, lssns.largestGoodInteger(num));
		assertEquals(expected, lssns.betterLargestGootInteger(num));
	}
}
