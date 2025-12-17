package arrays;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JumpGameTest {

	@Test
	public void testSpec1() {
		int[] input = {6,4,14,6,8,13,9,7,10,6,12};
		int d = 2;
		int expected = 4;
		
		JumpGame jg = new JumpGame();

		assertEquals(expected, jg.maxJumps(input, d));
	}
	
	@Test
	public void testSpec2() {
		int[] input = {3,3,3,3,3};
		int d = 3;
		int expected = 1;
		
		JumpGame jg = new JumpGame();
		assertEquals(expected, jg.maxJumps(input, d));
	}
	
	@Test
	public void testSpec3() {
		int[] input = {7,6,5,4,3,2,1};
		int d = 1;
		int expected = 7;
		
		JumpGame jg = new JumpGame();
		assertEquals(expected, jg.maxJumps(input, d));
	}
}
