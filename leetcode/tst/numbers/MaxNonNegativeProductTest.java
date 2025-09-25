package numbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxNonNegativeProductTest {

    @Test
    public void testSpec1() {
        int[][] grid = {{-1,-2,-3},{-2,-3,-3},{-3,-3,-2}};
        int expected = -1;

        MaxNonNegativeProduct mnnp = new MaxNonNegativeProduct();

        assertEquals(expected, mnnp.maxProductPath(grid));
    }

    @Test
    public void testSpec2() {
        int[][] grid = {{1,3},{0,-4}};
        int expected = 0;

        MaxNonNegativeProduct mnnp = new MaxNonNegativeProduct();

        assertEquals(expected, mnnp.maxProductPath(grid));
    }

    @Test
    public void testSpec3() {
        int[][] grid = {{1,-2,1},{1,-2,1},{3,-4,1}};
        int expected = 8;

        MaxNonNegativeProduct mnnp = new MaxNonNegativeProduct();

        assertEquals(expected, mnnp.maxProductPath(grid));
    }
}
