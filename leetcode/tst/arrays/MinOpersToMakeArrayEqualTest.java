package arrays;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinOpersToMakeArrayEqualTest {

    @Test
    public void testSpec1() {
        int n = 3;
        int expected = 2;

        MinOpersToMakeArrayEqual motmae = new MinOpersToMakeArrayEqual();

        assertEquals(expected, motmae.minOperations(n));
    }

    @Test
    public void testSpec2() {
        int n = 6;
        int expected = 9;

        MinOpersToMakeArrayEqual motmae = new MinOpersToMakeArrayEqual();

        assertEquals(expected, motmae.minOperations(n));
    }
}
