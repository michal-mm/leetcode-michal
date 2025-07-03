package strings;

public class TestStringSwap extends TestCase {

    public void testSpec1 () {
        StringSwap sw = new StringSwap();
        assertEquals(true, sw.areAlmostEqual("bank", "knab"));
    }
}
