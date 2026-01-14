package arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


import org.junit.jupiter.api.Test;

public class RelativeSortArrayTest {
    
    @Test
    void testSpec1() {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        int[] expected = {2,2,2,1,4,3,3,9,6,7,19};

        var rsa = new RelativeSortArray();

        assertArrayEquals(expected, rsa.relativeSortArray(arr1, arr2));
    }

    @Test
    void testSpec2() {
        int[] arr1 = {28,6,22,8,44,17};
        int[] arr2 = {22,28,8,6};
        int[] expected = {22,28,8,6,17,44};

        var rsa = new RelativeSortArray();

        assertArrayEquals(expected, rsa.relativeSortArray(arr1, arr2));
    }
}
