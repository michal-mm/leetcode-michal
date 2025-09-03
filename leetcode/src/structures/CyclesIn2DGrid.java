package structures;

public class CyclesIn2DGrid {

	private final int[][] directions = { {-1,0}, {1,0}, {0,-1}, {0,1} };
	
	/**
	 * Given a 2D array of characters grid of size m x n, 
	 * you need to find if there exists any cycle consisting of the same value in grid.
	 * A cycle is a path of length 4 or more in the grid 
	 * that starts and ends at the same cell. 
	 * From a given cell, you can move to one of the cells adjacent to it 
	 * - in one of the four directions (up, down, left, or right), 
	 * if it has the same value of the current cell.
	 * 
	 * Also, you cannot move to the cell that you visited in your last move. 
	 * For example, the cycle (1, 1) -> (1, 2) -> (1, 1) is invalid 
	 * because from (1, 2) we visited (1, 1) which was the last visited cell.
	 * 
	 * Return true if any cycle of the same value exists in grid, otherwise, return false.
	 * 
	 *
	 * @param grid
	 * @return
	 */
    public boolean containsCycle(char[][] grid) {
        // iterate through the grid of not-visited fields
        // and look for cycles
        
        int m = grid.length;
        int n = grid[0].length;
        boolean [][] visited = new boolean [m][n];
        
        for (int i=0; i<m; i++) {
        	for (int j=0; j<n; j++) {
        		if (visited[i][j]) {
        			continue;
        		} 
        		
        		if (dfsContainsCycle(grid, visited, i, j, -1, -1)) {
        			return true;
        		}
        	}
        }
        
    	return false;
    }
    
    /**
     * 
     * @param grid
     * @param visited
     * @param row - current row
     * @param col - current column
     * @param prevRow = previous row to avoid going back to the same elem
     * @param prevCol = previous col to avoid going back to the same  elem
     * @return
     */
    private boolean dfsContainsCycle(char[][] grid, boolean[][] visited, int row, int col, int prevRow, int prevCol) {
    	visited[row][col] = true;
    	    
		for (int[] dir : directions) {
			int newRow = row + dir[0];
			int newCol = col + dir[1];

			if (isValidMove(grid, newRow, newCol) && grid[row][col] == grid[newRow][newCol]) {
				if (newRow == prevRow && newCol == prevCol) {
					// avoid going back to parent
					continue;
				}

				if (visited[newRow][newCol]) {
					// we have a cycle
					return true;
				}
				
				// continue searching - dog deeper - DFS
				if (dfsContainsCycle(grid, visited, newRow, newCol, row, col)) {
					return true;
				}
			}
		}
    
		return false;
    }
    
    private boolean isValidMove(char[][] grid, int row, int col) {
    	return (0<=row && row<grid.length && 0<=col && col<grid[0].length);
    }
}
