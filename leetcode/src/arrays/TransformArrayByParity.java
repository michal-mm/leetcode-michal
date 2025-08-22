package arrays;

import java.util.Arrays;

public class TransformArrayByParity {

	/**
	 * You are given an integer array nums. 
	 * Transform nums by performing the following 
	 * operations in the exact order specified:
	 * 
	 * Replace each even number with 0.
	 * Replace each odd numbers with 1.
	 * Sort the modified array in non-decreasing order.
	 * Return the resulting array after performing these operations.
	 * 
	 * Example 1:
	 * Input: nums = [4,3,2,1]
	 * Output: [0,0,1,1]
	 * Explanation:
	 * Replace the even numbers (4 and 2) with 0 
	 * and the odd numbers (3 and 1) with 1. Now, nums = [0, 1, 0, 1].
	 * After sorting nums in non-descending order, nums = [0, 0, 1, 1].
	 * 
	 * 
	 * @param nums
	 * @return
	 */
    public int[] transformArray(int[] nums) {
    	return  Arrays.stream(nums)
    		.map(item -> item%2)
    		.sorted()
    		.toArray();
    }
    
    /** 
     * Solution that avoid sorting the result table
     * and instead adds '1' at the end of the result table
     * @param nums
     * @return
     */
    public int[] transformArrayWithoutSorting(int[] nums) {
    	int[] result = new int[nums.length];
    	int idx = nums.length-1;
    	
    	for (int i=0; i<nums.length; i++) {
    		if (nums[i]%2 == 1) {
    			result[idx] = 1;
    			idx--;
    		}
    	}
    	
    	return result;
    }
}
