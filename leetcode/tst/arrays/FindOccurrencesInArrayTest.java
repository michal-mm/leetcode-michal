package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindOccurrencesInArrayTest {

    @Test
    public void testSpec1() {
        int[] nums = {1,3,1,7};
        int[] queries = {1,3,2,4};
        int x = 1;

        int[] expected = {0,-1,2,-1};

        FindOccurrencesInArray foia = new FindOccurrencesInArray();
        var result = foia.getOccurrences(nums, queries, x);
        var resultNoStreamApi = foia.getOccurrencesNoStreamApi(nums, queries, x);

        assertArrayEquals(expected, result);
        assertArrayEquals(expected, resultNoStreamApi);
    }

    @Test
    public void testSpec2() {
        int[] nums = {1,2,3};
        int[] queries = {10};
        int x = 5;

        int[] expected = {-1};

        FindOccurrencesInArray foia = new FindOccurrencesInArray();
        var result = foia.getOccurrences(nums, queries, x);
        var resultNoStreamApi = foia.getOccurrencesNoStreamApi(nums, queries, x);

        assertArrayEquals(expected, result);
        assertArrayEquals(expected, resultNoStreamApi);
    }
}
