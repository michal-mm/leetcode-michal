package arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubArraysAboveAverageTest {

	@Test
	public void testSpec1() {
		int[] arr = {2,2,2,2,5,5,5,8};
		int k = 3;
		int threshold = 4;
		
		int expected = 3;
		
		SubArraysAboveAverage saaa = new SubArraysAboveAverage();
		
		assertEquals(expected, saaa.numOfSubarrays(arr, k, threshold));
	}
	
	@Test
	public void testSpec2() {
		int[] arr = {11,13,17,23,29,31,7,5,2,3};
		int k = 3;
		int threshold = 5;
		
		int expected = 6;
		
		SubArraysAboveAverage saaa = new SubArraysAboveAverage();
		
		assertEquals(expected, saaa.numOfSubarrays(arr, k, threshold));
	}
}
