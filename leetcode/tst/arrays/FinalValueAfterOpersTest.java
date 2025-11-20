package arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FinalValueAfterOpersTest {

    @Test
    public void testSpec1() {
        String[] opers = {"--X","X++","X++"};
        int expected = 1;

        var fv = new FinalValueAfterOpers();

        assertEquals(expected, fv.finalValueAfterOperations(opers));
    }

    @Test
    public void testSpec2() {
        String[] opers = {"++X","++X","X++"};
        int expected = 3;

        var fv = new FinalValueAfterOpers();

        assertEquals(expected, fv.finalValueAfterOperations(opers));
    }

    @Test
    public void testSpec3() {
        String[] opers = {"X++","++X","--X","X--"};
        int expected = 0;

        var fv = new FinalValueAfterOpers();

        assertEquals(expected, fv.finalValueAfterOperations(opers));
    }
}
