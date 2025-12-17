package structures;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinNumCellsVisitedTest {

	@Test
	public void testSpec1 () {
		int [][] grid = {{3,4,2,1},{4,2,3,1},{2,1,0,0},{2,4,0,0}};
		int expected = 4;
		
		MinNumCellsVisited mcv = new MinNumCellsVisited();
		assertEquals(expected, mcv.minimumVisitedCels(grid));
	}

	@Test
	public void testSpec2 () {
		int [][] grid = {{3,4,2,1},{4,2,1,1},{2,1,1,0},{3,4,1,0}};
		int expected = 3;
		
		MinNumCellsVisited mcv = new MinNumCellsVisited();
		assertEquals(expected, mcv.minimumVisitedCels(grid));
	}

	@Test
	public void testSpec3 () {
		int [][] grid = {{2,1,0},{1,0,0}};
		int expected = -1;
		
		MinNumCellsVisited mcv = new MinNumCellsVisited();
		assertEquals(expected, mcv.minimumVisitedCels(grid));
	}
}
