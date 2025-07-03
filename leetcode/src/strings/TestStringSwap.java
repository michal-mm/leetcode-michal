package strings;

public class TestStringSwap extends TestCase {

    public void testSpec1 () {
        StringSwap sw = new StringSwap();
        assertEquals(true, sw.areAlmostEqual("bank", "knab"));
    }

    public void testSpec2 () {
        StringSwap sw = new StringSwap();
        assertEquals(false, sw.areAlmostEqual("attac", "defend"));
    }

    public void testSpec3 () {
        StringSwap sw = new StringSwap();
        assertEquals(true, sw.areAlmostEqual("kelb", "kelb"));
    }
}
