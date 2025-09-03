package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DivideArrayInSets {

	/**
	 * Given an array of integers nums and a positive integer k, 
	 * check whether it is possible to divide this array 
	 * into sets of k consecutive numbers.
	 * 
	 * Return true if it is possible. Otherwise, return false.
	 * 
	 * Example 1:
	 * Input: nums = [1,2,3,3,4,4,5,6], k = 4
	 * Output: true
	 * Explanation: Array can be divided into [1,2,3,4] and [3,4,5,6].
	 * 
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	public boolean isPossibleDivide(int[] nums, int k) {
		
		// edge case 
		if (nums.length % k != 0) {
			return false;
		}

		// count occurrences
		Map<Integer, Integer> count = new HashMap<>();
		for (int num: nums) {
			count.put(num, count.getOrDefault(num, 0)+1);
		}
		
		List<Integer> uniqueNums = new ArrayList<>(count.keySet());
		Collections.sort(uniqueNums);
		
		// check each unique item and see if we can build k-consequtive sets
		// we check them by groups of their frequencies
		for (int start: uniqueNums) {
			int freq = count.get(start);
			if (freq > 0) {
				for (int i=0; i<k; i++) {
					int curr = start+i;
					if (count.getOrDefault(curr, 0) < freq) {
						return false;
					}
					// decrease thre freq for the current elem
					count.put(curr, count.get(curr)-freq);
				}
			}
		}
		
		return true;
	}
}
