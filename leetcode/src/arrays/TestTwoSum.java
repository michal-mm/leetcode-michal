package arrays;

import static org.junit.Assert.assertArrayEquals;

import junit.framework.TestCase;

public class TestTwoSum extends TestCase {

    public void testSpec1 () {
        int [] nums = {2,7,11,15};
        int target = 9;
        int expectedOutput [] = {0,1};
        TwoSum ts = new TwoSum();

        assertArrayEquals(expectedOutput, ts.getIndicesforTarget(nums, target));
    }

    public void testSpec2 () {
        int [] nums = {3,2,4};
        int target = 6;
        int expectedOutput [] = {1,2};
        TwoSum ts = new TwoSum();

        assertArrayEquals(expectedOutput, ts.getIndicesforTarget(nums, target));
    }

     public void testSpec3 () {
        int [] nums = {3,3};
        int target = 6;
        int expectedOutput [] = {0,1};
        TwoSum ts = new TwoSum();

        assertArrayEquals(expectedOutput, ts.getIndicesforTarget(nums, target));
    }
}
