package arrays;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryArrayMinOpersTest {

	@Test
	public void testSpec1() {
		int[] nums = {0,1,1,1,0,0};
		int expected = 3;
		
		BinaryArrayMinOpers bamo = new BinaryArrayMinOpers();
		
		assertEquals(expected, bamo.minOperations(nums));
	}
	
	@Test
	public void testSpec2() {
		int[] nums = {0,1,1,1};
		int expected = -1;
		
		BinaryArrayMinOpers bamo = new BinaryArrayMinOpers();
		
		assertEquals(expected, bamo.minOperations(nums));
	}
}
