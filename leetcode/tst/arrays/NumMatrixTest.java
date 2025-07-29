package arrays;

import junit.framework.TestCase;

public class NumMatrixTest extends TestCase{
	
	public void testSpec1() {
		int [][] matrix = { {3, 0, 1, 4, 2}, 
							{5, 6, 3, 2, 1}, 
							{1, 2, 0, 1, 5}, 
							{4, 1, 0, 1, 7}, 
							{1, 0, 3, 0, 5} };
		int row1 = 2;
		int col1 = 1;
		int row2 = 4;
		int col2 = 3;
		
		int expected = 8;
		
		NumMatrix nm = new NumMatrix(matrix);
		assertEquals(expected, nm.sumRegion(row1, col1, row2, col2));
	}
	
	public void testSpec2() {
		int [][] matrix = { {3, 0, 1, 4, 2}, 
							{5, 6, 3, 2, 1}, 
							{1, 2, 0, 1, 5}, 
							{4, 1, 0, 1, 7}, 
							{1, 0, 3, 0, 5} };
		int row1 = 1;
		int col1 = 1;
		int row2 = 2;
		int col2 = 2;
		
		int expected = 11;
		
		NumMatrix nm = new NumMatrix(matrix);
		assertEquals(expected, nm.sumRegion(row1, col1, row2, col2));
	}
	
	public void testSpec3() {
		int [][] matrix = { {3, 0, 1, 4, 2}, 
							{5, 6, 3, 2, 1}, 
							{1, 2, 0, 1, 5}, 
							{4, 1, 0, 1, 7}, 
							{1, 0, 3, 0, 5} };
		int row1 = 1;
		int col1 = 2;
		int row2 = 2;
		int col2 = 4;
		
		int expected = 12;
		
		NumMatrix nm = new NumMatrix(matrix);
		assertEquals(expected, nm.sumRegion(row1, col1, row2, col2));
	}
}
