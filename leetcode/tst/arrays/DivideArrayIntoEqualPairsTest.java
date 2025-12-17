package arrays;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideArrayIntoEqualPairsTest {

    @Test
    public void testSpec1() {
        int[] nums = {3,2,3,2,2,2};
        boolean expected = true;

        DivideArrayIntoEqualPairs daiep = new DivideArrayIntoEqualPairs();

        assertEquals(expected, daiep.divideArray(nums));
    }

    @Test
    public void testSpec2() {
        int[] nums = {1,2,3,4};
        boolean expected = false;

        DivideArrayIntoEqualPairs daiep = new DivideArrayIntoEqualPairs();

        assertEquals(expected, daiep.divideArray(nums));
    }
}
