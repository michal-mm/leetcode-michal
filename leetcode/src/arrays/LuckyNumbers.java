package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LuckyNumbers {

    private int getMinValInRow(int[][] matrix, int row) {
        return Arrays.stream(matrix[row])
            .min()
            .getAsInt();
    }

    private int getMaxValInCol(int[][] matrix, int col) {
        return IntStream.range(0, matrix.length)
            .map(j -> matrix[j][col])
            .max()
            .getAsInt();
    }
    
    public List<Integer> luckyNumbers(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] minInRow = new int[rows];
        Arrays.fill(minInRow, -1);
        int[] maxInCol = new int[cols];
        Arrays.fill(maxInCol, -1);

        IntStream.range(0, rows)
            .forEach(i -> minInRow[i] = getMinValInRow(matrix, i));
        IntStream.range(0, cols)
            .forEach(j -> maxInCol[j] = getMaxValInCol(matrix, j));

        List<Integer> result = new ArrayList<>();

        IntStream.range(0, rows)
            .forEach(i -> IntStream.range(0, cols)
                .forEach(j -> {
                    if (maxInCol[j] == minInRow[i])
                        result.add(matrix[i][j]);
                }));

        return result;
    }
}
