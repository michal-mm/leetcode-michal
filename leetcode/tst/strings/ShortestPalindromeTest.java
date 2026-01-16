package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestPalindromeTest {

    @Test
    void testSpec1() {
        var input = "aacecaaa";
        var expected = "aaacecaaa";

        var sp = new ShortestPalindrome();
        assertEquals(expected, sp.shortestPalindrome(input));
    }

    @Test
    void testSpec2() {
        var input = "abcd";
        var expected = "dcbabcd";

        var sp = new ShortestPalindrome();
        assertEquals(expected, sp.shortestPalindrome(input));
    }
}
