package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumOfSpecialCharactersTest {

    @Test
    public void testSpec1() {
        String input = "aaAbcBC";
        int expected = 3;

        var nosc = new NumOfSpecialCharacters();

        assertEquals(expected, nosc.numberOfSpecialChars(input));
        assertEquals(expected, nosc.numberOfSpecialCharsV2(input));
    }

    @Test
    public void testSpec2() {
        String input = "abc";
        int expected = 0;

        var nosc = new NumOfSpecialCharacters();

        assertEquals(expected, nosc.numberOfSpecialChars(input));
        assertEquals(expected, nosc.numberOfSpecialCharsV2(input));
    }

    @Test
    public void testSpec3() {
        String input = "abBCab";
        int expected = 1;

        var nosc = new NumOfSpecialCharacters();

        assertEquals(expected, nosc.numberOfSpecialChars(input));
        assertEquals(expected, nosc.numberOfSpecialCharsV2(input));
    }
}
