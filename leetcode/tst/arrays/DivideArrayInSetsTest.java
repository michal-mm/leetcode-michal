package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideArrayInSetsTest {

	@Test
	public void testSpec1() {
		int[] nums = {1,2,3,3,4,4,5,6};
		int k = 4;
		boolean expected = true;
		
		DivideArrayInSets dais = new DivideArrayInSets();
		
		assertEquals(expected, dais.isPossibleDivide(nums, k));
	}
	
	@Test
	public void testSpec2() {
		int[] nums = {3,2,1,2,3,4,3,4,5,9,10,11};
		int k = 3;
		boolean expected = true;
		
		DivideArrayInSets dais = new DivideArrayInSets();
		
		assertEquals(expected, dais.isPossibleDivide(nums, k));
	}
	
	@Test
	public void testSpec3() {
		int[] nums = {1,2,3,4};
		int k = 3;
		boolean expected = false;
		
		DivideArrayInSets dais = new DivideArrayInSets();
		
		assertEquals(expected, dais.isPossibleDivide(nums, k));
	}
	
	@Test
	public void testSpec4() {
		int[] nums = {1,2,3,4,5,7};
		int k = 3;
		boolean expected = false;
		
		DivideArrayInSets dais = new DivideArrayInSets();
		
		assertEquals(expected, dais.isPossibleDivide(nums, k));
	}
	
	@Test
	public void testSpec5() {
		int[] nums = {1,2,3,1,5,7};
		int k = 3;
		boolean expected = false;
		
		DivideArrayInSets dais = new DivideArrayInSets();
		
		assertEquals(expected, dais.isPossibleDivide(nums, k));
	}
}
