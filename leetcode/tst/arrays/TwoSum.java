package arrays;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoSum {

    public int [] getIndicesforTarget (int [] nums, int target) {

        /* 
         * input: 
         *  nums: 2,7,11,15
         *  target: 9
         * output: [0,1]
         * 
         * - calc sums for each pair of nums; return the first pair if indices 
         *      that meet the goal of (nums[i]+nums[j])==targert
         * 
         * 
         */
        return IntStream.range(0, nums.length-1)
            .boxed()
            .flatMap(i -> IntStream.range(i+1, nums.length)
                .filter(j -> nums[i]+nums[j] == target)
                .mapToObj(j -> new int [] {i,j}))
            .findFirst()
            .get();
    }
}
