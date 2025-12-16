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

    public int [] getOccurrencesNoStreamApi(int[] nums, int[] queries, int x) {
        List<Integer> indices = new ArrayList<>();
        for (int i=0; i< nums.length; i++) {
            if (nums[i] == x) {
                indices.add(i);
            }
        }

        int[] result = new int[queries.length];
        for (int i=0; i<queries.length; i++) {
            result[i] = queries[i]<=indices.size() ? indices.get(queries[i]-1) : -1;
        }

        return result;
    }
}
