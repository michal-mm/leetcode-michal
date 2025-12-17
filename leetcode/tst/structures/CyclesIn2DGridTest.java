package structures;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CyclesIn2DGridTest {

	@Test
	public void testSpec1() {
		char [][] grid = { {'a','a','a','a'},
						   {'a','b','b','a'},
						   {'a','b','b','a'},
						   {'a','a','a','a'}
		};
		
		boolean expected = true;
		
		CyclesIn2DGrid ci2D = new CyclesIn2DGrid();
		
		assertEquals(expected, ci2D.containsCycle(grid));
	}
	
	@Test
	public void testSpec2() {
		char [][] grid = { {'c','c','c','a'},
						   {'c','d','c','c'},
						   {'c','c','e','c'},
						   {'f','c','c','c'}
		};
		
		boolean expected = true;
		
		CyclesIn2DGrid ci2D = new CyclesIn2DGrid();
		
		assertEquals(expected, ci2D.containsCycle(grid));
	}
}
