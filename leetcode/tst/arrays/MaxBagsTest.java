package arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxBagsTest {

	@Test
	public void testSpec1() {
		int [] capacity = {2,3,4,5};
		int [] rocks = {1,2,4,4};
		int additionalRocks = 2;
		int expected = 3;
		
		MaxBags mb = new MaxBags();
		
		assertEquals(expected, mb.maximumBags(capacity, rocks, additionalRocks));
	}
	
	@Test
	public void testSpec2() {
		int [] capacity = {10,2,2};
		int [] rocks = {2,2,0};
		int additionalRocks = 100;
		int expected = 3;
		
		MaxBags mb = new MaxBags();
		
		assertEquals(expected, mb.maximumBags(capacity, rocks, additionalRocks));
	}
}
