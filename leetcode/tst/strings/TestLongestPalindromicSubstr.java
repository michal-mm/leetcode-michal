package strings;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLongestPalindromicSubstr  {

    @Test
    public void testSpec1 () {
        String input = "babad";
        String output = "bab";

        LongestPalindromicSubstr lps = new LongestPalindromicSubstr();
        assertEquals(output, lps.longestPalindromicSubstring(input));
    }

    @Test
    public void testSpec2 () {
        String input = "cbbd";
        String output = "bb";

        LongestPalindromicSubstr lps = new LongestPalindromicSubstr();
        assertEquals(output, lps.longestPalindromicSubstring(input));
    }

    @Test
     public void testSpec3 () {
        String input = "abcd";
        String output = "a";

        LongestPalindromicSubstr lps = new LongestPalindromicSubstr();
        assertEquals(output, lps.longestPalindromicSubstring(input));
    }
}
