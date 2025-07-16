package harmonious;

import junit.framework.TestCase;

public class TestLongestHarmoniousSubseq extends TestCase {

    public void testConstructor () {
        LongestHarmoniousSubseq lhs = new LongestHarmoniousSubseq();
        assertNotNull(lhs);
    }

    public void testSpec1 () {
        LongestHarmoniousSubseq lhs = new LongestHarmoniousSubseq();
        int [] nums = {1,3,2,2,5,2,3,7};
        assertEquals(5, lhs.findLHS(nums));
    }

    public void testSpec1Decl () {
        LongestHarmoniousSubseq lhs = new LongestHarmoniousSubseq();
        int [] nums = {1,3,2,2,5,2,3,7};
        assertEquals(5, lhs.findDeclarativeLHS(nums));
    }

    public void testSpec2 () {
        LongestHarmoniousSubseq lhs = new LongestHarmoniousSubseq();
        int [] nums = {1,2,3,4};
        assertEquals(2, lhs.findLHS(nums));
    }

    public void testSpec2Decl () {
        LongestHarmoniousSubseq lhs = new LongestHarmoniousSubseq();
        int [] nums = {1,2,3,4};
        assertEquals(2, lhs.findDeclarativeLHS(nums));
    }

    public void testSpec3 () {
        LongestHarmoniousSubseq lhs = new LongestHarmoniousSubseq();
        int [] nums = {1,1,1,1};
        assertEquals(0, lhs.findLHS(nums));
    }

        public void testSpec3Decl () {
        LongestHarmoniousSubseq lhs = new LongestHarmoniousSubseq();
        int [] nums = {1,1,1,1};
        assertEquals(0, lhs.findDeclarativeLHS(nums));
    }
}
