package arrays;

public class LongestNiceSubarray {

	public int longestNiceSubarray(int[] nums) {
		/* 
		 * 010 & 001 -> 000 (010 | 001 -> 011)
		 * 100 & 011 -> 000 (111)
		 */
		
		/*
		 * We track total OR value to check against elem with AND)
		 * if totalOR & elem == 0 -> OK, totalOR |= num 
		 *    check if it is longer than current seen and update length if needed
		 * else: totalOR = elem; currLen = 1;
		 */
		
		int maxLen = 1;
		int totalOR = nums[0];
		int currLen = 1;
		
		for (int i=1; i<nums.length; i++ ) {
			int isNice = totalOR & nums[i];
			if (isNice == 0) {
				totalOR = totalOR | nums[i];
				currLen += 1;
				maxLen = Math.max(maxLen, currLen);
			} else {
				totalOR = nums[i];
				currLen = 1;
			}
		}

		return maxLen;
	}
}
