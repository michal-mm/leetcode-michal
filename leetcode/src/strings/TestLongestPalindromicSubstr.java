package strings;

import junit.framework.TestCase;

public class TestLongestPalindromicSubstr extends TestCase {

    public void testSpec1 () {
        String input = "babad";
        String output = "bab";

        LongestPalindromicSubstr lps = new LongestPalindromicSubstr();
        assertEquals(output, lps.longestPalindromicSubstring(input));
    }

    public void testSpec2 () {
        String input = "cbbd";
        String output = "bb";

        LongestPalindromicSubstr lps = new LongestPalindromicSubstr();
        assertEquals(output, lps.longestPalindromicSubstring(input));
    }

     public void testSpec3 () {
        String input = "abcd";
        String output = "a";

        LongestPalindromicSubstr lps = new LongestPalindromicSubstr();
        assertEquals(output, lps.longestPalindromicSubstring(input));
    }
}
