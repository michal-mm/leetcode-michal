package arrays;

import junit.framework.TestCase;

public class ArrayPartitionTest extends TestCase {

	public void testSpec1 () {
		ArrayPartition ap = new ArrayPartition();
		int[] arr = {1,15,7,9,2,5,10}; 
		int k = 3;
		int expected = 84;
		
		assertEquals(expected, ap.maxSumAfterPartitioning(arr, k));
	}
	
	public void testSpec2 () {
		ArrayPartition ap = new ArrayPartition();
		int[] arr = {1,4,1,5,7,3,6,1,9,9,3}; 
		int k = 4;
		int expected = 83;
		
		assertEquals(expected, ap.maxSumAfterPartitioning(arr, k));
	}
	
	public void testSpec3 () {
		ArrayPartition ap = new ArrayPartition();
		int[] arr = {1}; 
		int k = 1;
		int expected = 1;
		
		assertEquals(expected, ap.maxSumAfterPartitioning(arr, k));
	}
}
