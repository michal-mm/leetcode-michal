package strings;

public class WordSearchClaude extends WordSearch {

	// Direction vectors for up, down, left, right
	private static final int[][] DIRECTIONS = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public boolean exist(char[][] board, String word) {
		if (board == null || board.length == 0 || word == null || word.isEmpty()) {
			return false;
		}

		int rows = board.length;
		int cols = board[0].length;
		char[] wordChars = word.toCharArray();

		// Try starting from each cell in the board
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (board[i][j] == wordChars[0]) {
					boolean[][] visited = new boolean[rows][cols];
					if (dfs(board, wordChars, i, j, 0, visited)) {
						return true;
					}
				}
			}
		}

		return false;
	}

	private boolean dfs(char[][] board, char[] word, int row, int col, int index, boolean[][] visited) {
		// Base case: found complete word
		if (index == word.length) {
			return true;
		}

		// Check bounds and conditions
		if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || visited[row][col]
				|| board[row][col] != word[index]) {
			return false;
		}

		// Mark current cell as visited
		visited[row][col] = true;

		// Try all four directions
		for (int[] dir : DIRECTIONS) {
			int newRow = row + dir[0];
			int newCol = col + dir[1];

			if (dfs(board, word, newRow, newCol, index + 1, visited)) {
				visited[row][col] = false; // backtrack
				return true;
			}
		}

		// Backtrack: unmark current cell
		visited[row][col] = false;
		return false;
	}
}
