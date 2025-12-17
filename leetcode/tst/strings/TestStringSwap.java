package strings;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStringSwap {

    @Test
    public void testSpec1 () {
        StringSwap sw = new StringSwap();
        assertTrue(sw.areAlmostEqual("bank", "kanb"));
    }

    @Test
    public void testSpec2 () {
        StringSwap sw = new StringSwap();
        assertFalse(sw.areAlmostEqual("attac", "defend"));
    }

    @Test
    public void testSpec3 () {
        StringSwap sw = new StringSwap();
        assertTrue(sw.areAlmostEqual("kelb", "kelb"));
    }
}
