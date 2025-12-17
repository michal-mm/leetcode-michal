package arrays;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovingStonesTest {

	@Test
	public void testSpec1() {
		int[] stones = {7,4,9};
		int[] expected = {1,2};
		
		MovingStones ms = new MovingStones();
		
		assertArrayEquals(expected, ms.numMovesStonesII(stones));
	}
	
	@Test
	public void testSpec2() {
		int[] stones = {6,5,4,3,10};
		int[] expected = {2,3};
		
		MovingStones ms = new MovingStones();
		
		assertArrayEquals(expected, ms.numMovesStonesII(stones));
	}
}
