package strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HappyStringsTest {

    @Test
    public void testSpec1() {
        int n = 1;
        int k = 3;
        String expected = "c";

        HappyStrings hs = new HappyStrings();

        assertEquals(expected, hs.getHappyString(n, k));
    }

    @Test
    public void testSpec2() {
        int n = 1;
        int k = 4;
        String expected = "";

        HappyStrings hs = new HappyStrings();

        assertEquals(expected, hs.getHappyString(n, k));
    }

    @Test
    public void testSpec3() {
        int n = 3;
        int k = 9;
        String expected = "cab";

        HappyStrings hs = new HappyStrings();

        assertEquals(expected, hs.getHappyString(n, k));
    }
}
