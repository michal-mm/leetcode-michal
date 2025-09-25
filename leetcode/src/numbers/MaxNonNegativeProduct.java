package numbers;

public class MaxNonNegativeProduct {

    /**
     * You are given a m x n matrix grid. Initially,
     * you are located at the top-left corner (0, 0),
     * and in each step, you can only move right or down in the matrix.
     * ---
     * Among all possible paths starting from the top-left corner (0, 0)
     * and ending in the bottom-right corner (m - 1, n - 1),
     * find the path with the maximum non-negative product.
     * The product of a path is the product of all integers
     * in the grid cells visited along the path.
     * ---
     * Return the maximum non-negative product modulo 10^9 + 7.
     * If the maximum product is negative, return -1.
     * ---
     * Notice that the modulo is performed after getting the maximum product.
     * ---
     * Input: grid = [[-1,-2,-3],[-2,-3,-3],[-3,-3,-2]]
     * Output: -1
     * Explanation: It is not possible to get non-negative product
     * in the path from (0, 0) to (2, 2), so return -1.
     * ----
     * @param grid mxn array
     * @return max product or -1 if the max product is negative
     */
    public int maxProductPath(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        long[][]max = new long[rows][cols];
        long[][] min = new long[rows][cols];
        int modulo = (int) (1e9)+7;

        // init firs row and column
        max[0][0] = grid[0][0];
        min[0][0] = grid[0][0];
        for (int i=1; i<cols; i++) {
            max[0][i] = max[0][i-1]*grid[0][i];
            min[0][i] = min[0][i-1]*grid[0][i];
        }

        for(int i=1; i<rows; i++) {
            max[i][0] = max[i-1][0]*grid[i][0];
            min[i][0] = min[i-1][0]*grid[i][0];
        }


        for (int i=1; i<rows; i++) {
            for (int j=1; j<cols; j++) {
                if (grid[i][j] < 0) {
                    min[i][j] = Math.min(max[i-1][j]*grid[i][j], max[i][j-1]*grid[i][j]);
                    max[i][j] = Math.max(min[i-1][j]*grid[i][j], min[i][j-1]*grid[i][j]);
                } else if (grid[i][j] == 0) {
                    min[i][j] = 0;
                    max[i][j] = 0;
                } else {
                    min[i][j] = Math.min(min[i-1][j]*grid[i][j], min[i][j-1]*grid[i][j]);
                    max[i][j] = Math.max(max[i-1][j]*grid[i][j], max[i][j-1]*grid[i][j]);
                }
            }
        }

        return max[rows-1][cols-1] >=0 ? (int) (max[rows-1][cols-1]%modulo) : -1;
    }
}
