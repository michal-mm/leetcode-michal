package arrays;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsArraySortedAndRotatedTest {

    @Test
    public void testSpec1() {
        int[] nums = {3,4,5,1,2};

        IsArraySortedAndRotated isar = new IsArraySortedAndRotated();
        assertTrue(isar.check(nums));
    }

    @Test
    public void testSpec2() {
        int[] nums = {2,1,3,4};

        IsArraySortedAndRotated isar = new IsArraySortedAndRotated();
        assertFalse(isar.check(nums));
    }

    @Test
    public void testSpec3() {
        int[] nums = {1,2,3};

        IsArraySortedAndRotated isar = new IsArraySortedAndRotated();
        assertTrue(isar.check(nums));
    }
}
