package strings;

import junit.framework.TestCase;

public class LongestSubstringTest extends TestCase {

	private LongestSubstring longestSbstr = new LongestSubstring();
	
	public void testSpec1 () {
		String input = "abcabcbb";
		int output = 3;
		
		assertEquals(output, longestSbstr.longestSubstring(input));
		assertEquals(output, longestSbstr.prettyLongestSubstring(input));
	}
	
	public void testSpec2 () {
		String input = "bbbbb";
		int output = 1;
		
		assertEquals(output, longestSbstr.longestSubstring(input));
		assertEquals(output, longestSbstr.prettyLongestSubstring(input));
	}
	
	public void testSpec3 () {
		String input = "pwwkew";
		int output = 3;
		
		assertEquals(output, longestSbstr.longestSubstring(input));
		assertEquals(output, longestSbstr.prettyLongestSubstring(input));
	}
	
}
