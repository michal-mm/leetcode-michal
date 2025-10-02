package structures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthLargestElementInArrayTest {

    @Test
    public void testSpec1() {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int expected = 5;

        KthLargestElementInArray kl = new KthLargestElementInArray();

        assertEquals(expected, kl.findKthLargest(nums, k));
    }

    @Test
    public void testSpec2() {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int expected = 4;

        KthLargestElementInArray kl = new KthLargestElementInArray();

        assertEquals(expected, kl.findKthLargest(nums, k));
    }
}
