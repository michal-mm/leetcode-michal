package arrays;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLongestIncDecArray {

    @Test
    public void testReq1 () {
        int [] nums = {1,4,3,3,2};
        LongestIncDecArray lida = new LongestIncDecArray();
        assertEquals(2, lida.getLongestSubarray(nums));
    }

    @Test
    public void testReq2 () {
        int [] nums = {3,3,3,3};
        LongestIncDecArray lida = new LongestIncDecArray();
        assertEquals(1, lida.getLongestSubarray(nums));
    }

    @Test
    public void testReq3 () {
        int [] nums = {3,2,1};
        LongestIncDecArray lida = new LongestIncDecArray();
        assertEquals(3, lida.getLongestSubarray(nums));
    }
}
