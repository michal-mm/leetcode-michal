package arrays;

public class MatrixBlockSum {

	/**
	 * Given a m x n matrix mat and an integer k,
	 * return a matrix answer where each answer[i][j] 
	 * is the sum of all elements mat[r][c] for:
	 * 
	 * i - k <= r <= i + k,
	 * j - k <= c <= j + k, and
	 * (r, c) is a valid position in the matrix.
	 * 
	 * Example 1:
	 * Input: mat = [[1,2,3],[4,5,6],[7,8,9]], k = 1
	 * Output: [[12,21,16],[27,45,33],[24,39,28]]
	 * 
	 * Example 2:
	 * Input: mat = [[1,2,3],[4,5,6],[7,8,9]], k = 2
	 * Output: [[45,45,45],[45,45,45],[45,45,45]]
	 * 
	 * @param mat
	 * @param k
	 * @return
	 */
    public int[][] matrixBlockSum(int[][] mat, int k) {
    	int mRows = mat.length;
    	int nCols = mat[0].length;
    	
    	int[][] result = new int[mRows][nCols];
    	
    	// interimSum[i][j] - sum of all elems from mat from [0,0] till [i,j] inclusive
    	int[][] prefixSum = buildPrefixSumArray(mat);
    	
    	for (int row=0; row<mRows; row++) {
    		for (int col=0; col<nCols; col++) {
    			result[row][col] = calculateBlockSum(k, prefixSum, row, col);
    		}
    	}
        
    	
    	return result;
    }

	private int calculateBlockSum(int k, int[][] prefixSum, int row, int col) {
    	int mRows = prefixSum.length;
    	int nCols = prefixSum[0].length;

    	// top left corner
		int rowStart = Math.max(0, row-k);
		int colStart = Math.max(0, col-k);
		
		// bottom right corner
		int rowEnd = Math.min(mRows-1, row+k);
		int colEnd = Math.min(nCols-1, col+k);

		// calculate answer
		return prefixSum[rowEnd][colEnd]
						- getElem(prefixSum, rowStart-1, colEnd)
						- getElem(prefixSum, rowEnd, colStart-1)
						+ getElem(prefixSum, rowStart-1, colStart-1);
	}

	
	private int[][] buildPrefixSumArray(int[][] mat) {
    	int mRows = mat.length;
    	int nCols = mat[0].length;
    	
    	int[][] prefixSum = new int[mRows][nCols];
    	
		for (int row=0; row<mRows; row++) {
    		for (int col=0; col<nCols; col++) {
    			prefixSum[row][col] = getElem(prefixSum, row, col-1) 
    									+ getElem(prefixSum, row-1, col) 
    									- getElem(prefixSum, row-1, col-1) // remove duplicated part from the above
    									+ mat[row][col];
    		}
    	}
		
		return prefixSum;
	}
    
	
    private int getElem(int[][] tab, int row, int col) {
    	if (0<=row && row<tab.length && 0<=col && col<tab[0].length) {
    		return tab[row][col];
    	} else {
    		return 0;
    	}
    }
}
