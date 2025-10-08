package arrays;

import java.util.HashMap;
import java.util.Map;

public class DivideArrayIntoEqualPairs {

    /**
     * You are given an integer array nums consisting of 2 * n integers.
     * ---
     * You need to divide nums into n pairs such that:
     * ---
     * Each element belongs to exactly one pair.
     * The elements present in a pair are equal.
     * Return true if nums can be divided into n pairs, otherwise return false.
     * ---
     * Example 1:
     * ----
     * Input: nums = [3,2,3,2,2,2]
     * Output: true
     * Explanation:
     * There are 6 elements in nums, so they should be divided into 6 / 2 = 3 pairs.
     * If nums is divided into the pairs (2, 2), (3, 3), and (2, 2), it will satisfy all the conditions.
     * @param nums - tab of numbers
     * @return = true/false
     */
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int number : nums) {
            numbers.put(number, (numbers.getOrDefault(number, 0)+1)%2);
        }

        return numbers.values().stream()
                .filter(item -> item != 0)
                .findFirst()
                .isEmpty();
    }
}
