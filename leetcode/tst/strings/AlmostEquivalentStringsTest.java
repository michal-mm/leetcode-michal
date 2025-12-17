package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlmostEquivalentStringsTest {

    @Test
    public void testSpec1() {
        String word1 = "aaaa";
        String word2 = "bccb";
        boolean expected = false;

        AlmostEquivalentStrings aes = new AlmostEquivalentStrings();

        assertEquals(expected, aes.checkAlmostEquivalent(word1, word2));
    }

    @Test
    public void testSpec2() {
        String word1 = "abcdeef";
        String word2 = "abaaacc";
        boolean expected = true;

        AlmostEquivalentStrings aes = new AlmostEquivalentStrings();

        assertEquals(expected, aes.checkAlmostEquivalent(word1, word2));
    }

    @Test
    public void testSpec3() {
        String word1 = "cccddabba";
        String word2 = "babababab";
        boolean expected = true;

        AlmostEquivalentStrings aes = new AlmostEquivalentStrings();

        assertEquals(expected, aes.checkAlmostEquivalent(word1, word2));
    }
}
