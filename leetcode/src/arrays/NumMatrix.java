package arrays;

public class NumMatrix {
	
	private int [][] sums;
	
	
	/*
	 * in sums[i][j] we store sum of all elems from (0,0) to (i,j);
	 */
	
	public NumMatrix(int [][] matrix) {
		sums = new int[matrix.length][matrix[0].length];
		
		// fill sums with intermediate sums
		for (int row=0; row<sums.length; row++) {
			for (int col=0; col<sums[0].length; col++) {
				sums[row][col] = matrix[row][col] + getVal(sums, row, col-1) + getVal(sums, row-1, col) - getVal(sums, row-1, col-1);
			}
		}
	}
	
	
	public int sumRegion(int row1, int col1, int row2, int col2) {
        return sums[row2][col2] - getVal(sums, row2, col1-1) - getVal(sums, row1-1, col2) + getVal(sums, row1-1, col1-1);
    }


	private int getVal(int[][] matrix, int row, int col) {
		if (0 <= row && row < matrix.length && 0 <= col && col < matrix[0].length)
			return matrix[row][col];
		else 
			return 0;
	}

}
