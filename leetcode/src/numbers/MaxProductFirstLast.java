package numbers;

import java.util.Arrays;

public class MaxProductFirstLast {

	/** 
	 * You are given an integer array nums and an integer m.
	 * 
	 * Return the maximum product of the first and last elements 
	 * of any subsequence of nums of size m.


	 * @param nums
	 * @param m
	 * @return
	 */
	public long maximumProduct(int[] nums, int m) {
		
		int [] products = new int[nums.length];
		
		// use sliding window technique and iterate over the elems of length m
		// the elems m-2 (everything after first and before last) don't matter,
		// so starting analysis of i-th and j=i+m-1 is enough (plus any j++)
		// products[i] = max(nums[i] * num[j], products[i]);
		// return max from products[]
		
		for (int idx = 0; idx<nums.length-m; idx++) {
			// special case handling
			if (m == 1) {
				products[idx] = nums[idx] * nums[idx];
				continue;
			}
			
			for (int j=idx+m-1; j<nums.length; j++) {
				products[idx] = Math.max(nums[idx] * nums[j], products[idx]);	
			}
			
		}

		return Arrays.stream(products).max().orElse(0);
	}
	
	
	public long maxClaudeP(int[] nums, int m) {
	        long maxProduct = Long.MIN_VALUE;
	        
	        // Try all possible first elements (positions 0 to nums.length - m)
	        for (int first = 0; first <= nums.length - m; first++) {
	            // Try all possible last elements (at least m-1 positions after first)
	            for (int last = first + m - 1; last < nums.length; last++) {
	                long product = (long) nums[first] * nums[last];
	                maxProduct = Math.max(maxProduct, product);
	            }
	        }
	        
	        return maxProduct;
	}
}
