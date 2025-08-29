package arrays;

public class MaxSubarraySumWithDeletion {

	/**
	 * Given an array of integers, return the maximum sum 
	 * for a non-empty subarray (contiguous elements) 
	 * with at most one element deletion. In other words, 
	 * you want to choose a subarray and optionally 
	 * delete one element from it so that there is still 
	 * at least one element left and the sum of the remaining 
	 * elements is maximum possible.
	 * 
	 * Note that the subarray needs to be non-empty after deleting one element.
	 * 
	 * Example 1:
	 * Input: arr = [1,-2,0,3]
	 * Output: 4
	 * 
	 * 
	 * @param arr
	 * @return
	 */
	public int maximumSum(int[] arr) {
		int bestSum = Integer.MIN_VALUE;
		int sumOfSubArray = 0;
		int sumWithDeleteSubArray = 0;
		int sumNoDeleteSubArray = 0;
		
		for (int elem: arr) {
			// try what if we remove one elem
			sumWithDeleteSubArray = Math.max(sumNoDeleteSubArray, sumWithDeleteSubArray+elem);
			// try what if we don't remove elems
			sumNoDeleteSubArray = Math.max(elem, sumNoDeleteSubArray+elem);
			// pick best one (remove vs no-remove)
			sumOfSubArray = Math.max(sumWithDeleteSubArray, sumNoDeleteSubArray);
			// update best result
			bestSum = Math.max(bestSum, sumOfSubArray);
		}
		
		return sumOfSubArray;
	}
}
