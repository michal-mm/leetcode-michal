package arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaximalScoreAfterKOpersTest {
    
    @Test
    void testSpec1() {
        int[] nums = {10,10,10,10,10};
        int k = 5;
        long expected = 50L;

        var msa = new MaximalScoreAfterKOpers();
        assertEquals(expected, msa.maxKelements(nums, k));
    }

    @Test
    void testSpec2() {
        int[] nums = {1,10,3,3,3};
        int k = 3;
        long expected = 17L;

        var msa = new MaximalScoreAfterKOpers();
        assertEquals(expected, msa.maxKelements(nums, k));
    }

    @Test
    void testSpec3() {
        int[] nums = {672579538,806947365,854095676,815137524};
        int k = 3;
        long expected = 2476180565L;

        var msa = new MaximalScoreAfterKOpers();
        assertEquals(expected, msa.maxKelements(nums, k));
    }
}
