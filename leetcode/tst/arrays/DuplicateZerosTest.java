package arrays;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DuplicateZerosTest {

    @Test
    public void testSpec1() {
        int[] input = {1,0,2,3,0,4,5,0};
        int[] expected = {1,0,0,2,3,0,0,4};

        DuplicateZeros dz = new DuplicateZeros();
        dz.duplicateZeros(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testSpec2() {
        int[] input = {1,2,3};
        int[] expected = {1,2,3};

        DuplicateZeros dz = new DuplicateZeros();
        dz.duplicateZeros(input);

        assertArrayEquals(expected, input);
    }
}
