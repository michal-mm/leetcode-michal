package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfOpersToMakeArrayEmpty {

    /**
     * You are given a 0-indexed array nums consisting of positive integers.
     * ---
     * There are two types of operations that you can apply on the array any number of times:
     * ---
     * Choose two elements with equal values and delete them from the array.
     * Choose three elements with equal values and delete them from the array.
     * Return the minimum number of operations required to make the array empty,
     * or -1 if it is not possible.
     * ---
     * Example 1:
     * ---
     * Input: nums = [2,3,3,2,2,4,2,3,4]
     * Output: 4
     * @param nums - numbers
     * @return - number of minimum moves or -1 if not feasible
     */
    public int minOperations(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<>();

        Arrays.stream(nums)
                .forEach(aNum -> numbers.put(aNum, numbers.getOrDefault(aNum,0)+1));

        int minNumOfMoves = 0;

        for (int val : numbers.values()) {

            if (val == 1) {
                // not possible :)
                return -1;
            } else if (val % 3 == 0) {
                minNumOfMoves += val/3;
            } else if (val % 3 == 1) {
                minNumOfMoves += (val-4)/3 + 2;
            } else if (val % 3 == 2) {
                minNumOfMoves +=  val/3 + 1;
            }
        }

        return minNumOfMoves;
    }

}
