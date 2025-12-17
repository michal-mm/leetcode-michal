package arrays;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfFairPairsTest {

    @Test
    public void testSpec1() {
        int[] nums = {0,1,7,4,4,5};
        int lower = 3;
        int upper = 6;
        long expected = 6;

        NumberOfFairPairs nofp = new NumberOfFairPairs();

        assertEquals(expected, nofp.countFairPairs(nums, lower, upper));
    }

    @Test
    public void testSpec2() {
        int[] nums = {1,7,9,2,5};
        int lower = 11;
        int upper = 11;
        long expected = 1;

        NumberOfFairPairs nofp = new NumberOfFairPairs();

        assertEquals(expected, nofp.countFairPairs(nums, lower, upper));
    }
}
