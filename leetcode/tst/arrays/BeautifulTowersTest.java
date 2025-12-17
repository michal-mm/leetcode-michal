package arrays;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeautifulTowersTest {

    @Test
    public void testSpec1() {
        int[] heights = {5,3,4,1,1};
        long expectedOutput = 13;

        BeautifulTowers bt = new BeautifulTowers();

        assertEquals(expectedOutput, bt.maximumSumOfHeights(heights));
    }

    @Test
    public void testSpec2() {
        int[] heights = {6,5,3,9,2,7};
        long expectedOutput = 22;

        BeautifulTowers bt = new BeautifulTowers();

        assertEquals(expectedOutput, bt.maximumSumOfHeights(heights));
    }

    @Test
    public void testSpec3() {
        int[] heights = {3,2,5,5,2,3};
        long expectedOutput = 18;

        BeautifulTowers bt = new BeautifulTowers();

        assertEquals(expectedOutput, bt.maximumSumOfHeights(heights));
    }
}
