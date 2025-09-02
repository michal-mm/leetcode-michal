package arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EqualSumGridTest {

	@Test
	public void testSpec1() {
		int[][] grid = {{1,4},{2,3}};
		boolean expected = true;
		
		EqualSumGrid esg = new EqualSumGrid();
		
		assertEquals(expected, esg.canPartitionGrid(grid));
	}
	
	@Test
	public void testSpec2() {
		int[][] grid = {{1,2},{3,4}};
		boolean expected = true;
		
		EqualSumGrid esg = new EqualSumGrid();
		
		assertEquals(expected, esg.canPartitionGrid(grid));
	}
	
	@Test
	public void testSpec3() {
		int[][] grid = {{1,2,4},{2,3,5}};
		boolean expected = true;
		
		EqualSumGrid esg = new EqualSumGrid();
		
		assertEquals(expected, esg.canPartitionGrid(grid));
	}
}
