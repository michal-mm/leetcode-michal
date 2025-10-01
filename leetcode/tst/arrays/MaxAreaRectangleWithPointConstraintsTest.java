package arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxAreaRectangleWithPointConstraintsTest {

    @Test
    public void testSpec1() {
        int[][] points = {{1,1},{1,3},{3,1},{3,3}};
        int output = 4;

        MaxAreaRectangleWithPointConstraints maxArea = new MaxAreaRectangleWithPointConstraints();

        assertEquals(output, maxArea.maxRectangleArea(points));
    }

    @Test
    public void testSpec2() {
        int[][] points = {{1,1},{1,3},{3,1},{3,3},{2,2}};
        int output = -1;

        MaxAreaRectangleWithPointConstraints maxArea = new MaxAreaRectangleWithPointConstraints();

        assertEquals(output, maxArea.maxRectangleArea(points));
    }

    @Test
    public void testSpec3() {
        int[][] points = {{1,1},{1,3},{3,1},{3,3},{1,2},{3,2}};
        int output = 2;

        MaxAreaRectangleWithPointConstraints maxArea = new MaxAreaRectangleWithPointConstraints();

        assertEquals(output, maxArea.maxRectangleArea(points));
    }
}
