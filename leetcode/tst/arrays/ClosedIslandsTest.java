package arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClosedIslandsTest {

    @Test
    public void testSpec1() {
        int[][] grid = {{1,1,1,1,1,1,1,0},
                        {1,0,0,0,0,1,1,0},
                        {1,0,1,0,1,1,1,0},
                        {1,0,0,0,0,1,0,1},
                        {1,1,1,1,1,1,1,0}};
        int expected = 2;

        ClosedIslands ci = new ClosedIslands();

        assertEquals(expected, ci.closedIsland(grid));
    }

    @Test
    public void testSpec2() {
        int[][] grid = {{0,0,1,0,0},
                {0,1,0,1,0},
                {0,1,1,1,0}};
        int expected = 1;

        ClosedIslands ci = new ClosedIslands();

        assertEquals(expected, ci.closedIsland(grid));
    }

    @Test
    public void testSpec3() {
        int[][] grid = {{1,1,1,1,1,1,1},
                {1,0,0,0,0,0,1},
                {1,0,1,1,1,0,1},
                {1,0,1,0,1,0,1},
                {1,0,1,1,1,0,1},
                {1,0,0,0,0,0,1},
                {1,1,1,1,1,1,1}};
        int expected = 2;

        ClosedIslands ci = new ClosedIslands();

        assertEquals(expected, ci.closedIsland(grid));
    }
}
