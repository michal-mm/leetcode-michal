package arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestWellPerformingIntervalTest {

	@Test
	public void testSpec1() {
		int[] hours = {9,9,6,0,6,6,9};
		int expected = 3;
		
		LongestWellPerformingInterval lwpi = new LongestWellPerformingInterval();
		
		assertEquals(expected, lwpi.longestWPI(hours));
	}
	
	@Test
	public void testSpec2() {
		int[] hours = {6,6,6};
		int expected = 0;
		
		LongestWellPerformingInterval lwpi = new LongestWellPerformingInterval();
		
		assertEquals(expected, lwpi.longestWPI(hours));
	}
}
