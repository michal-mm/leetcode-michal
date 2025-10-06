package strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IncreasingDecreasingStringTest {

    @Test
    public void testSpec1() {
        String input = "aaaabbbbcccc";
        String expected = "abccbaabccba";

        IncreasingDecreasingString ids = new IncreasingDecreasingString();

        assertEquals(expected, ids.sortString(input));
    }

    @Test
    public void testSpec2() {
        String input = "rat";
        String expected = "art";

        IncreasingDecreasingString ids = new IncreasingDecreasingString();

        assertEquals(expected, ids.sortString(input));
    }
}
