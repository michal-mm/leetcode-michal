package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class MostFrequentNumber {

	/**
	 * You are given a 0-indexed integer array nums. 
	 * You are also given an integer key, which is present in nums.
	 * 
	 * For every unique integer target in nums, count the number of times 
	 * target immediately follows an occurrence of key in nums. 
	 * In other words, count the number of indices i such that:
	 * 
	 * 0 <= i <= nums.length - 2,
	 * nums[i] == key and,
	 * nums[i + 1] == target.
	 * 
	 * Return the target with the maximum count. The test cases will be generated 
	 * such that the target with maximum count is unique.
	 * 
	 * 
	 * @param nums
	 * @param key
	 * @return
	 */
	public int mostFrequent(int[] nums, int key) {
		/*
		 * iterate over nums
		 * if nums[i] == key, then store target occurence in a map
		 * return the key from map with the highest value
		 */
		
		Map <Integer, Integer> targetNums  = new HashMap<Integer, Integer>();
		
		IntStream.rangeClosed(0, nums.length-2)
			.filter(idx -> nums[idx] == key)
			.forEach(idx -> {
				targetNums.putIfAbsent(nums[idx+1], 0);
				targetNums.put(nums[idx+1], targetNums.get(nums[idx+1]));
			});
		
		return targetNums.entrySet().stream()
			.max(Map.Entry.comparingByValue())
			.map(entry -> entry.getKey())
			.orElse(0);
		
	}
}
