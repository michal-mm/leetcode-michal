package arrays;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestTwoSum  {

    @Test
    public void testSpec1 () {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] expectedOutput = {0,1};
        TwoSum ts = new TwoSum();

        assertArrayEquals(expectedOutput, ts.getIndicesforTarget(nums, target));
    }

    @Test
    public void testSpec2 () {
        int[] nums = {3,2,4};
        int target = 6;
        int[] expectedOutput = {1,2};
        TwoSum ts = new TwoSum();

        assertArrayEquals(expectedOutput, ts.getIndicesforTarget(nums, target));
    }

    @Test
     public void testSpec3 () {
        int[] nums = {3,3};
        int target = 6;
        int[] expectedOutput = {0,1};
        TwoSum ts = new TwoSum();

        assertArrayEquals(expectedOutput, ts.getIndicesforTarget(nums, target));
    }
}
