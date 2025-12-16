package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindOccurrencesInArray {

    public int [] getOccurrences(int[] nums, int[] queries, int x) {
        List<Integer> indices = new ArrayList<>();
        IntStream.range(0, nums.length)
                .filter(i -> nums[i] == x)
                .forEach(indices::add);

        return Arrays.stream(queries)
                .map(ith -> ith <= indices.size() ?
                        indices.get(ith-1) : -1)
                .toArray();
    }
}
