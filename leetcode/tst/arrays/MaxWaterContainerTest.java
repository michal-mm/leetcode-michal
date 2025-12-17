package arrays;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxWaterContainerTest {

    @Test
    public void testSpec1() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int output = 49;

        MostWaterContainer mwc = new MostWaterContainer();

        assertEquals(output, mwc.maxArea(height));
    }

    @Test
    public void testSpec2() {
        int[] height = {1,1};
        int output = 1;

        MostWaterContainer mwc = new MostWaterContainer();

        assertEquals(output, mwc.maxArea(height));
    }
}
