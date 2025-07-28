package arrays;

import junit.framework.TestCase;

public class MaxPointsInSquareTest extends TestCase{
	
	public void testSpec1 () {
		MaxPointsInSquare mpis = new MaxPointsInSquare();
		int [][] input = {{2,2},{-1,-2},{-4,4},{-3,1},{3,-3}};
		String s = "abdca";
		int expected = 2;
		
		assertEquals(expected, mpis.maxPointsInsideSquare(input, s));
	}
	
	public void testSpec2 () {
		MaxPointsInSquare mpis = new MaxPointsInSquare();
		int [][] input = {{1,1},{-2,-2},{-2,2}};
		String s = "abb";
		int expected = 1;
		
		assertEquals(expected, mpis.maxPointsInsideSquare(input, s));
	}
	
	public void testSpec3 () {
		MaxPointsInSquare mpis = new MaxPointsInSquare();
		int [][] input = {{1,1},{-1,-1},{2,-2}};
		String s = "ccd";
		int expected = 0;
		
		assertEquals(expected, mpis.maxPointsInsideSquare(input, s));
	}
}
