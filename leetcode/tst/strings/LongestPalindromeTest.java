package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromeTest {

	@Test
	public void testSpec1() {
		LongestPalindrome lp = new LongestPalindrome();
		String input = "abccccdd";
		int expected = 7;
		
		assertEquals(expected, lp.longestPalindrome(input));
	}
	
	@Test
	public void testSpec2() {
		LongestPalindrome lp = new LongestPalindrome();
		String input = "a";
		int expected = 1;
		
		assertEquals(expected, lp.longestPalindrome(input));
	}
}
