package arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class KRadiusSubArrAverageTest {

    @Test
    public void testSpec1() {
        int[] nums = {7,4,3,9,1,8,5,2,6};
        int k = 3;
        int[] expected = {-1,-1,-1,5,4,4,-1,-1,-1};

        KRadiusSubArrAverage kr = new KRadiusSubArrAverage();

        assertArrayEquals(expected, kr.getAverages(nums, k));
        assertArrayEquals(expected, kr.getAveragesWithStreams(nums, k));
    }

    @Test
    public void testSpec2() {
        int[] nums = {100000};
        int k = 0;
        int[] expected = {100000};

        KRadiusSubArrAverage kr = new KRadiusSubArrAverage();

        assertArrayEquals(expected, kr.getAverages(nums, k));
        assertArrayEquals(expected, kr.getAveragesWithStreams(nums, k));
    }

    @Test
    public void testSpec3() {
        int[] nums = {8};
        int k = 100000;
        int[] expected = {-1};

        KRadiusSubArrAverage kr = new KRadiusSubArrAverage();

        assertArrayEquals(expected, kr.getAverages(nums, k));
        assertArrayEquals(expected, kr.getAveragesWithStreams(nums, k));
    }
}
