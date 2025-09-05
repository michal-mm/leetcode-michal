package arrays;

public class ClosedIslands {

    /**
     * Given a 2D grid consists of 0s (land) and 1s (water).
     * An island is a maximal 4-directionally connected group of 0s
     * and a closed island is an island totally
     * (all left, top, right, bottom) surrounded by 1s.
     * <p>
     * Return the number of closed islands.
     *
     */
    public int closedIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int closedIslands = 0;

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                int LAND = 0;
                if (grid[i][j] == LAND && isTotalLand(grid, i, j)) {
                    closedIslands++;
                }
            }
        }

        return closedIslands;
    }

    private boolean isTotalLand(int[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (i<0 || i>=rows || j<0 || j>=cols) {
            return false;
        }

        int WATER = 1;
        if (grid[i][j] == WATER) {
            return true;
        }

        grid[i][j] = WATER;
        boolean left = isTotalLand(grid, i, j-1);
        boolean right = isTotalLand(grid, i, j+1);
        boolean up = isTotalLand(grid, i-1, j);
        boolean down = isTotalLand(grid, i+1, j);

        return left && right && up && down;
    }

}
