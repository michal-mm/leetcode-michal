package arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LongestContinousIncreasingSubseqTest {
    
    @Test
    void testSpec1() {
        int[] nums = {1,3,5,4,7};
        int output = 3;

        var lc = new LongestContinousIncreasingSubseq();

        assertEquals(output, lc.findLengthOfLCIS(nums));
    }

    @Test
    void testSpec2() {
        int[] nums = {2,2,2,2,2};
        int output = 1;

        var lc = new LongestContinousIncreasingSubseq();

        assertEquals(output, lc.findLengthOfLCIS(nums));
    }
}
