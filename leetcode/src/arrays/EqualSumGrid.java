package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualSumGrid {

	/**
	 * You are given an m x n matrix grid of positive integers. Your task is to
	 * determine if it is possible to make either one horizontal or one vertical cut
	 * on the grid such that:
	 * 
	 * Each of the two resulting sections formed by the cut is non-empty. The sum of
	 * elements in both sections is equal, or can be made equal by discounting at
	 * most one single cell in total (from either section).
	 * 
	 * If a cell is discounted, the rest of the section must remain connected.
	 * 
	 * Return true if such a partition exists; otherwise, return false.
	 * 
	 * Note: A section is connected if every cell in it can be reached from any
	 * other cell by moving up, down, left, or right through other cells in the
	 * section.
	 * 
	 * Example 1: Input: grid = [[1,4],[2,3]] Output: true
	 * 
	 * 
	 * @param grid
	 * @return
	 */
	public boolean canPartitionGrid(int[][] grid) {
		int numOfRows = grid.length;
		int numOfCols = grid[0].length;

		int totalSum = 0;

		// rowSums[i] = grid[i][0]+...+grid[i][numOfCols-1]
		int[] rowSums = new int[numOfRows];
		int[] colSums = new int[numOfCols];
		
		Map<Integer, List<int[]>> lookup = new HashMap<>();

		for (int i = 0; i < numOfRows; i++) {
			for (int j = 0; j < numOfCols; j++) {
				int value = grid[i][j];
				rowSums[i] += value;
				colSums[j] += value;
				totalSum += value;
				// build lookup map with values and their positions in the grid
				lookup.computeIfAbsent(value, list -> new ArrayList<>())
						.add(new int[] {i,j});
			}
		}

		// iterate over rows moving the cut line down
		boolean partitionByRow = true;
		boolean partitionByCol = false;
		if (canPartitionByTab(grid, totalSum, rowSums, partitionByRow, lookup)
				|| canPartitionByTab(grid, totalSum, colSums, partitionByCol, lookup)) {
			return true;
		} else {
			return false;
		}
	}

	private boolean canPartitionByTab(int[][] grid, int totalSum, 
								int[] interimSums, boolean byRow,
								Map<Integer, List<int[]>> lookup)  {
		
		int numOfCols = grid[0].length;
		int numOfRows = grid.length;
		
		int upperLeftSum = interimSums[0];
		int bottomRightSum = totalSum;
		// iterate over columns moving the cut line from left to right
		for (int i = 1; i < interimSums.length; i++) {
			bottomRightSum -= interimSums[i-1];
			
			int rowFrom = 0;
			int rowTo = numOfRows-1;
			int colFrom = 0;
			int colTo = numOfCols-1;
			int delta;
			
			if (upperLeftSum == bottomRightSum) {
				// we found clear cut line
				return true;
			} else if (upperLeftSum < bottomRightSum) {
				delta = bottomRightSum-upperLeftSum;
				if (byRow) {
					rowFrom = i;
				} else {
					colFrom = i;
				}
			} else {
				delta = upperLeftSum-bottomRightSum;
				if (byRow) {
					rowTo = i-1;
				} else {
					colTo = i-1;
				}
			}
			if (canRemoveOneItem(grid, rowFrom, rowTo, colFrom, colTo, delta, lookup)) {
				return true;
			}
			upperLeftSum += interimSums[i];
		}

		return false;
	}


	private boolean canRemoveOneItem(int[][] grid, 
									int rowFrom, int rowTo, 
									int colFrom, int colTo, 
									int delta, 
									Map<Integer, List<int[]>> lookup) {
		
		int numOfRows = grid.length;
		int numOfCols = grid[0].length;

		// edge case handling
		if (rowFrom == rowTo && colFrom == colTo) {
			// can't remove, we have just one item
			return false;
		}
		
		// edge case handling
		if (numOfRows == 1) {
			// only one column, so we only can remove first and last elem
			// (rowFrom or rowTo)
			if (grid[0][colFrom] == delta || grid[0][colTo] == delta) {
				return true;
			}
		}
		
		// edge case handling
		if (numOfCols == 1) {
			if (grid[rowFrom][0] == delta || grid[rowTo][0] == delta) {
				return true;
			}
		}
		
		List<int[]> positions = lookup.getOrDefault(delta, new ArrayList<>());
		
		for (int[] pair: positions) {
			if (rowFrom <= pair[0] && pair[0] <= rowTo &&
					colFrom <= pair[1] && pair[1] <= colTo) {
				return true;
			}
		}
		
		return false;
	}
}
