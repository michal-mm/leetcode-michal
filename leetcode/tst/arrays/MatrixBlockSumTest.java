package arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MatrixBlockSumTest {

	@Test
	public void testSpec1() {
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		int k = 1;
		int[][] expected = {{12,21,16},{27,45,33},{24,39,28}};
		
		MatrixBlockSum mbs = new MatrixBlockSum();
		
		assertArrayEquals(expected[0], mbs.matrixBlockSum(mat, k)[0]);
		assertArrayEquals(expected[1], mbs.matrixBlockSum(mat, k)[1]);
		assertArrayEquals(expected[2], mbs.matrixBlockSum(mat, k)[2]);
	}
	
	@Test
	public void testSpec2() {
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		int k = 2;
		int[][] expected = {{45,45,45},{45,45,45},{45,45,45}};
		
		MatrixBlockSum mbs = new MatrixBlockSum();
		
		assertArrayEquals(expected[0], mbs.matrixBlockSum(mat, k)[0]);
		assertArrayEquals(expected[1], mbs.matrixBlockSum(mat, k)[1]);
		assertArrayEquals(expected[2], mbs.matrixBlockSum(mat, k)[2]);
	}
}
