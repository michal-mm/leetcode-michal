package arrays;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TransformArrayByParityTest {

	@Test
	public void testSpec1() {
		int[] nums = {4,3,2,1};
		int[] output = {0,0,1,1};
		
		TransformArrayByParity tabp = new TransformArrayByParity();
		
		assertArrayEquals(output, tabp.transformArray(nums));
		assertArrayEquals(output, tabp.transformArrayWithoutSorting(nums));
	}
	
	@Test
	public void testSpec2() {
		int[] nums = {1,5,1,4,2};
		int[] output = {0,0,1,1,1};
		
		TransformArrayByParity tabp = new TransformArrayByParity();
		
		assertArrayEquals(output, tabp.transformArray(nums));
		assertArrayEquals(output, tabp.transformArrayWithoutSorting(nums));
	}
}
