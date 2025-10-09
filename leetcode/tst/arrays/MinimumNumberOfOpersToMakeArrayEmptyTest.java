package arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumNumberOfOpersToMakeArrayEmptyTest {

    @Test
    public void testSpec1() {
        int[] nums = {2,3,3,2,2,4,2,3,4};
        int expected = 4;

        MinimumNumberOfOpersToMakeArrayEmpty mn = new MinimumNumberOfOpersToMakeArrayEmpty();

        assertEquals(expected, mn.minOperations(nums));
    }

    @Test
    public void testSpec2() {
        int[] nums = {2,1,2,2,3,3};
        int expected = -1;

        MinimumNumberOfOpersToMakeArrayEmpty mn = new MinimumNumberOfOpersToMakeArrayEmpty();

        assertEquals(expected, mn.minOperations(nums));
    }
}
