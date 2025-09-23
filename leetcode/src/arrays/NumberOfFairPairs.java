package arrays;

import java.util.Arrays;

public class NumberOfFairPairs {

    /**
     * Given a 0-indexed integer array nums of size n
     * and two integers lower and upper, return the number of fair pairs.
     * ---
     * A pair (i, j) is fair if:
     * ---
     * 0 <= i < j < n, and
     * lower <= nums[i] + nums[j] <= upper
     * ---
     * Example 1:
     * ---
     * Input: nums = [0,1,7,4,4,5], lower = 3, upper = 6
     * Output: 6
     * Explanation: There are 6 fair pairs: (0,3), (0,4), (0,5), (1,3), (1,4), and (1,5).
     * @param nums - array with numbers
     * @param lower - lower bound
     * @param upper - upper bound
     * @return - number of pairs
     */
    public long countFairPairs(int[] nums, int lower, int upper) {
        // we are looking for any pair i!=j such that
        // lower <= nums[i]+nums[j] <= upper
        // brute force: count all pairs... O(n^2)
        // if we sort the array O(nlogn) and identify the first (smallest)
        // and the last (biggest) indexes that can be used to build pairs

        // here we make it avg. O(nlogn)...
        Arrays.sort(nums);

        return countLessThan(nums, upper) - countLessThan(nums, lower-1);
    }

    private long countLessThan(int[] nums, int limit) {
        long result = 0;

        for(int i=0, j=nums.length-1; i<j; i++) {
            while (i<j && nums[i]+nums[j]>limit) {
                j--;
            }
            result += j-i;
        }

        return result;
    }
}
