package harmonious;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestLongestHarmoniousSubseq  {

    @Test
    public void testConstructor () {
        LongestHarmoniousSubseq lhs = new LongestHarmoniousSubseq();
        assertNotNull(lhs);
    }

    @Test
    public void testSpec1 () {
        LongestHarmoniousSubseq lhs = new LongestHarmoniousSubseq();
        int [] nums = {1,3,2,2,5,2,3,7};
        assertEquals(5, lhs.findLHS(nums));
    }

    @Test
    public void testSpec1Decl () {
        LongestHarmoniousSubseq lhs = new LongestHarmoniousSubseq();
        int [] nums = {1,3,2,2,5,2,3,7};
        assertEquals(5, lhs.findDeclarativeLHS(nums));
    }

    @Test
    public void testSpec2 () {
        LongestHarmoniousSubseq lhs = new LongestHarmoniousSubseq();
        int [] nums = {1,2,3,4};
        assertEquals(2, lhs.findLHS(nums));
    }

    @Test
    public void testSpec2Decl () {
        LongestHarmoniousSubseq lhs = new LongestHarmoniousSubseq();
        int [] nums = {1,2,3,4};
        assertEquals(2, lhs.findDeclarativeLHS(nums));
    }

    @Test
    public void testSpec3 () {
        LongestHarmoniousSubseq lhs = new LongestHarmoniousSubseq();
        int [] nums = {1,1,1,1};
        assertEquals(0, lhs.findLHS(nums));
    }

    @Test
    public void testSpec3Decl () {
        LongestHarmoniousSubseq lhs = new LongestHarmoniousSubseq();
        int [] nums = {1,1,1,1};
        assertEquals(0, lhs.findDeclarativeLHS(nums));
    }
}
