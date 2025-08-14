package arrays;

import java.util.stream.IntStream;

public class SubArraysAboveAverage {

	/**
	 * Given an array of integers arr and two integers k and threshold, 
	 * return the number of sub-arrays of size k 
	 * and average greater than or equal to threshold.
	 * 
	 * @param arr
	 * @param k
	 * @param threshold
	 * @return
	 */
	public int numOfSubarrays(int[] arr, int k, int threshold) {
		
		// use sliding window technique and iterate over table with k-size window
		int windowSum = 0;
		for (int i=0; i<k; i++) {
			windowSum += arr[i];
		}
		
		int targetSum = threshold * k;
		
		int numOfSubArrays = 0;
		
		if (windowSum >= targetSum) {
			numOfSubArrays += 1;	
		}
		
		// iterate by sliding the window through the arr
		for (int i=k; i<arr.length; i++) {
			windowSum = windowSum - arr[i-k] + arr[i];
			if (windowSum >= targetSum) {
				numOfSubArrays += 1;
			}
		}

		return numOfSubArrays;
	}
}
