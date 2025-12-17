package strings;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringTest  {

	private final LongestSubstring longestSbstr = new LongestSubstring();

	@Test
	public void testSpec1 () {
		String input = "abcabcbb";
		int output = 3;
		
		assertEquals(output, longestSbstr.longestSubstring(input));
		assertEquals(output, longestSbstr.prettyLongestSubstring(input));
	}

	@Test
	public void testSpec2 () {
		String input = "bbbbb";
		int output = 1;
		
		assertEquals(output, longestSbstr.longestSubstring(input));
		assertEquals(output, longestSbstr.prettyLongestSubstring(input));
	}

	@Test
	public void testSpec3 () {
		String input = "pwwkew";
		int output = 3;
		
		assertEquals(output, longestSbstr.longestSubstring(input));
		assertEquals(output, longestSbstr.prettyLongestSubstring(input));
	}
	
}
