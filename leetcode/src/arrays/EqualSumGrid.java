package arrays;

public class EqualSumGrid {

	/**
	 * You are given an m x n matrix grid of positive integers. 
	 * Your task is to determine if it is possible to make either 
	 * one horizontal or one vertical cut on the grid such that:
	 * 
	 * Each of the two resulting sections formed by the cut is non-empty.
	 * The sum of elements in both sections is equal, or can be made equal 
	 * by discounting at most one single cell in total (from either section).
	 * 
	 * If a cell is discounted, the rest of the section must remain connected.
	 * 
	 * Return true if such a partition exists; otherwise, return false.
	 * 
	 * Note: A section is connected if every cell in it can be reached 
	 * from any other cell by moving up, down, left, or right through other cells in the section.
	 * 
	 * Example 1:
	 * Input: grid = [[1,4],[2,3]]
	 * Output: true
	 * 
	 * 
	 * @param grid
	 * @return
	 */
	public boolean canPartitionGrid(int[][] grid) {
		int numOfRows = grid.length;
		int numOfCols =  grid[0].length;
		
		int totalSum = 0;
		
		// rowSums[i] = grid[i][0]+...+grid[i][numOfCols-1]
		int[] rowSums = new int[numOfRows];
		int[] colSums = new int[numOfCols];
		
		for (int i=0; i<numOfRows; i++) {
			for (int j=0; j< numOfCols; j++) {
				rowSums[i] += grid[i][j];
				colSums[j] += grid[i][j];
				totalSum += grid[i][j];
			}
		}
		
		// iterate over rows moving the cut line down
		int upperSum = rowSums[0];
		int lowerSum = totalSum;
		for (int i=1; i<numOfRows; i++) {
			lowerSum -= rowSums[i-1];
			if (upperSum == lowerSum) {
				// we found the clear cut line
				return true;
			} else if (upperSum < lowerSum) {
				// check if one can remove one item in the bottom part
				if (canRemoveByRow(grid, i, numOfRows-1, lowerSum-upperSum)) {
					return true;
				}
			} else {
				// check if one can remove one elem in the upper part
				if (canRemoveByRow(grid, 0, i-1, upperSum-lowerSum)) {
					return true;
				}
			}
			lowerSum += rowSums[i];
		}
		
		int leftSum = colSums[0];
		int rightSum = totalSum;
		// iterate over columns moving the cut line from left to right
		for (int i=1; i<numOfCols; i++) {
			rightSum -= colSums[i-1];
			if (leftSum == rightSum) {
				// we found clear cut line
				return true;
			} else if (leftSum < rightSum) {
				if (canRemoveByCol(grid, i, numOfCols-1, rightSum-leftSum)) {
					return true;
				}
			} else {
				if(canRemoveByCol(grid, 0, i-1, leftSum-rightSum)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	private boolean canRemoveByRow(int[][] grid, int rowFrom, int rowTo, int delta) {
		int numOfRows = grid.length;
		int numOfCols =  grid[0].length;
		
		if (rowFrom == rowTo && numOfCols == 1) {
			// can't remove, we have just one item
			return false;
		}
		
		if (numOfCols == 1) {
			// only one column, so we only can remove first and last elem
			// (rowFrom or rowTo)
			if (grid[rowFrom][0] == delta || grid[rowTo][0] == delta) {
				return true;
			}
		}
		
		for (int i=rowFrom; i<=rowTo; i++) {
			for (int j=0; j<numOfCols; j++) {
				if(grid[i][j] == delta) {
					return true;
				}
			}
		}
		
		// no elem matching needed delta was found -> false
		return false;
	}
	
	private boolean canRemoveByCol(int[][] grid, int colFrom, int colTo, int delta) {
		int numOfRows = grid.length;
		int numOfCols =  grid[0].length;
		
		if (colFrom == colTo && numOfRows == 1) {
			// can't remove, we have just one item
			return false;
		}
		
		if (numOfRows == 1) {
			// only one column, so we only can remove first and last elem
			// (rowFrom or rowTo)
			if (grid[0][colFrom] == delta || grid[0][colTo] == delta) {
				return true;
			}
		}
		
		for (int i=colFrom; i<=colTo; i++) {
			for (int j=0; j<numOfRows; j++) {
				if(grid[j][i] == delta) {
					return true;
				}
			}
		}
		
		// no elem matching needed delta was found -> false
		return false;
	}
}
