package numbers;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxProductFirstLastTest {

	@Test
	public void testSpec1() {
		int[] nums = {-1,-9,2,3,-2,-3,1};
		int m = 1;
		int expected = 81;
		
		MaxProductFirstLast mpfl = new MaxProductFirstLast();
		
		assertEquals(expected, mpfl.maximumProduct(nums, m));
	}
	
	@Test
	public void testSpec1a() {
		int[] nums = {-1,-3,2,3,-2,-4,1};
		int m = 1;
		int expected = 16;
		
		MaxProductFirstLast mpfl = new MaxProductFirstLast();
		
		assertEquals(expected, mpfl.maximumProduct(nums, m));
	}
	
	@Test
	public void testSpec2() {
		int[] nums = {1,3,-5,5,6,-4};
		int m = 3;
		int expected = 20;
		
		MaxProductFirstLast mpfl = new MaxProductFirstLast();
		
		assertEquals(expected, mpfl.maximumProduct(nums, m));
	}
	
	@Test
	public void testSpec3() {
		int[] nums = {2,-1,2,-6,5,2,-5,7};
		int m = 2;
		int expected = 35;
		
		MaxProductFirstLast mpfl = new MaxProductFirstLast();
		
		assertEquals(expected, mpfl.maximumProduct(nums, m));
	}
}
