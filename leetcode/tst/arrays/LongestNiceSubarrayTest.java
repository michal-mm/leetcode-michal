package arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestNiceSubarrayTest {

	@Test
	public void testSpec1() {
		int[] nums = {1,3,8,48,10};
		int expected = 3;
		
		LongestNiceSubarray lns = new LongestNiceSubarray();
		
		assertEquals(expected, lns.longestNiceSubarray(nums));
	}
	
	@Test
	public void testSpec2() {
		int[] nums = {3,1,5,11,13};
		int expected = 1;
		
		LongestNiceSubarray lns = new LongestNiceSubarray();
		
		assertEquals(expected, lns.longestNiceSubarray(nums));
	}
}
