package arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxSubarraySumWithDeletionTest {

	@Test
	public void testSpec1() {
		int[] arr = {1,-2,0,3};
		int expected = 4;
		
		MaxSubarraySumWithDeletion msswd = new MaxSubarraySumWithDeletion();
		
		assertEquals(expected, msswd.maximumSum(arr));
	}
	
	@Test
	public void testSpec2() {
		int[] arr = {1,-2,-2,3};
		int expected = 3;
		
		MaxSubarraySumWithDeletion msswd = new MaxSubarraySumWithDeletion();
		
		assertEquals(expected, msswd.maximumSum(arr));
	}
	
	@Test
	public void testSpec3() {
		int[] arr = {-1,-1,-1,-1};
		int expected = -1;
		
		MaxSubarraySumWithDeletion msswd = new MaxSubarraySumWithDeletion();
		
		assertEquals(expected, msswd.maximumSum(arr));
	}
	
	@Test
	public void testSpec4() {
		int[] arr = {1,-2,0,3,-2,3};
		int expected = 6;
		
		MaxSubarraySumWithDeletion msswd = new MaxSubarraySumWithDeletion();
		
		assertEquals(expected, msswd.maximumSum(arr));
	}
}
