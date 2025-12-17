package arrays;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MonOpersToMoveAllBallsTest {

    @Test
    public void testSpec1() {
        String boxes = "110";
        int[] expected = {1,1,3};

        MinOpersToMoveAllBalls motmb = new MinOpersToMoveAllBalls();

        assertArrayEquals(expected, motmb.minOperations(boxes));
    }

    @Test
    public void testSpec2() {
        String boxes = "001011";
        int[] expected = {11,8,5,4,3,4};

        MinOpersToMoveAllBalls motmb = new MinOpersToMoveAllBalls();

        assertArrayEquals(expected, motmb.minOperations(boxes));
    }
}
