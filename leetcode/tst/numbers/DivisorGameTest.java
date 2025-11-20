package numbers;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DivisorGameTest {

    @Test
    public void testSpec1() {
        int n = 2;

        var dg = new DivisorGame();
        assertTrue(dg.divisorGame(n));
    }

    @Test
    public void testSpec2() {
        int n = 3;

        var dg = new DivisorGame();
        assertFalse(dg.divisorGame(n));
    }
}
