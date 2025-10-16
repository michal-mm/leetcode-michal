package arrays;

import java.util.Arrays;

public class KRadiusSubArrAverage {

    /**
     * You are given a 0-indexed array nums of n integers, and an integer k.
     * ---
     * The k-radius average for a subarray of nums centered at some index i
     * with the radius k is the average of all elements in nums between
     * the indices i - k and i + k (inclusive). If there are less than k elements
     * before or after the index i, then the k-radius average is -1.
     * ---
     * Build and return an array avgs of length n where avgs[i] is the k-radius
     * average for the subarray centered at index i.
     * ---
     * The average of x elements is the sum of the x elements divided by x,
     * using integer division. The integer division truncates toward zero,
     * which means losing its fractional part.
     * ---
     * For example, the average of four elements 2, 3, 1, and 5
     * is (2 + 3 + 1 + 5) / 4 = 11 / 4 = 2.75, which truncates to 2.
     * ---
     * Example:
     * ---
     * Input: nums = [7,4,3,9,1,8,5,2,6], k = 3
     * Output: [-1,-1,-1,5,4,4,-1,-1,-1]
     * ----
     * @param nums - array of input numbers
     * @param k - k-radius
     * @return array of averages
     */
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] averages = new int[n];

        // init averages with -1 everywhere
        Arrays.fill(averages, -1);

        long[] subSumsLeftToRight = new long[n];
        subSumsLeftToRight[0] = nums[0];
        for (int i = 1; i< n; i++) {
            subSumsLeftToRight[i] = nums[i]+ subSumsLeftToRight[i-1];
            if (i > k) {
                subSumsLeftToRight[i] -= nums[i-k-1];
            }
        }

        long[] subSumsRightToLeft = new long[n];
        subSumsRightToLeft[n -1] = nums[n -1];
        for (int i=n-2; i>=0; i--) {
            subSumsRightToLeft[i] = nums[i] + subSumsRightToLeft[i+1];
            if (i<n-1-k) {
                subSumsRightToLeft[i] -= nums[i+k+1];
            }
        }

        for (int i=k; i<n-k; i++) {
            long sum = subSumsLeftToRight[i] + subSumsRightToLeft[i] - nums[i];
            averages[i] = (int) (sum / (2*k+1));
        }

        return averages;
    }
}
