package arrays;

public class LongestIncDecArray {

    public Object getLongestSubarray(int[] nums) {

        /* checks increasing seq */
        int increasing = longestIncreasing(nums);
        int decreasing = longestDecreasing(nums);

        return increasing > decreasing ? increasing : decreasing;
    }

    private int longestIncreasing(int[] nums) {
        int result = 1;
        int tempSeq = 1;
    
        for (int i=1; i<nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                tempSeq += 1;
                if (tempSeq > result) {
                    result = tempSeq;
                }
            } else {
                tempSeq = 1;
            }
        }
        return result;
    }

    private int longestDecreasing(int[] nums) {
        int result = 1;
        int tempSeq = 1;

        for (int i=1; i<nums.length; i++) {
            if (nums[i] < nums[i-1]) {
                tempSeq += 1;
                if (tempSeq > result) {
                    result = tempSeq;
                }
            } else {
                tempSeq = 1;
            }
        }
        return result;
    }

    /* 
     * either increasing or decreasing
     * input: int [] nums = [1,4,3,3,2]
     * output: int
     * 
     * - iterate through the table
     * - if in the increasing seq
     */
}
