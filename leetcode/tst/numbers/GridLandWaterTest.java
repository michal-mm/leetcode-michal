package numbers;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GridLandWaterTest  {

	@Test
	public void testSpec1 () {
		int [][] grid = {{1,0,1},{0,0,0},{1,0,1}};
		int expected = 2;
		
		GridLandWater map = new GridLandWater();
		assertEquals(expected, map.maxDistance(grid));
	}

	@Test
	public void testSpec2 () {
		int [][] grid = {{1,0,0},{0,0,0},{0,0,0}};
		int expected = 4;
		
		GridLandWater map = new GridLandWater();
		assertEquals(expected, map.maxDistance(grid));
	}
}
