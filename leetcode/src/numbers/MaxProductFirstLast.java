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
		
		// iterate over the elems of length m,
		// the elems m-2 (everything after first and before last) don't matter,
		// so starting analysis of i-th and j=i+m-1 is enough (plus any j++)
		// products[i] = max(nums[i] * num[j], products[i]);
		// return max from products[]
		
		for (int first = 0; first<nums.length-m; first++) {
			// special case handling
			if (m == 1) {
				products[first] = nums[first] * nums[first];
				continue;
			}
			
			for (int last=first+m-1; last<nums.length; last++) {
				products[first] = Math.max(nums[first] * nums[last], products[first]);	
			}
			
		}

		// instead this, one can track maxValue in the for loop and check
		// constantly with every loop iteration if there is bigger maxValue
		return Arrays.stream(products).max().orElse(0);
	}
	
	
}
