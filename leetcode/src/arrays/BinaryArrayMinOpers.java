package arrays;

public class BinaryArrayMinOpers {

	/**
	 * You are given a binary array nums.
	 * You can do the following operation 
	 * on the array any number of times (possibly zero):
	 * 
	 * Choose any 3 consecutive elements from the array and flip all of them.
	 * Flipping an element means changing its value from 0 to 1, and from 1 to 0.
	 * 
	 * Return the minimum number of operations required to make all 
	 * elements in nums equal to 1. If it is impossible, return -1.
	 * 
	 * 
	 * @param nums
	 * @return
	 */
	public int minOperations(int[] nums) {
		int operations = 0;
		
		// iterate from 0 to nums.len-3 and flip the 3 elems if thei-th one is 0
		for (int i=0; i<=nums.length-3; i++) {
			if (nums[i] == 0) {
				nums[i] ^= 1;
				nums[i+1] ^= 1;
				nums[i+2] ^= 1;
				operations++;
			}
		}
		
		// if last or last-1 elems are '0' then return -1, else we return operations
		int last = nums.length-1;
		if (nums[last] == 0 || nums[last-1] == 0) {
			return -1;
		} else {
			return operations;
		}
	}
}
