package strings;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueLengthPalindromeTest {

	@Test
	public void testSpec1() {
		String s = "aabca";
		int expected = 3;
		
		UniqueLengthPalindrome ulp = new UniqueLengthPalindrome();
		
		assertEquals(expected, ulp.countPalindromicSubsequence(s));
	}
	
	@Test
	public void testSpec2() {
		String s = "adc";
		int expected = 0;
		
		UniqueLengthPalindrome ulp = new UniqueLengthPalindrome();
		
		assertEquals(expected, ulp.countPalindromicSubsequence(s));
	}
	
	@Test
	public void testSpec3() {
		String s = "bbcbaba";
		int expected = 4;
		
		UniqueLengthPalindrome ulp = new UniqueLengthPalindrome();
		
		assertEquals(expected, ulp.countPalindromicSubsequence(s));
	}
}
