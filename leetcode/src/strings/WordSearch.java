package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordSearch {
	
	/* 
	 *   0123 -> n
	 * 0 ABCE
	 * 1 SFCS
	 * 2 ADEE
	 * m
	 * -> ABCCED -> TRUE
	 * 
	 * Store lists of each letter ('A' -> ( (0,0), (0,2) )
	 * Iterate over words from word
	 * the first letter, if doesn't exist in grid -> false
	 * 1. If a letter from the list is in 1 move distance then continue checking (we have a seq)
	 * 2. If it is the last char then return true
	 * 3. if it's not last then iterate further for each of the chars that are in the distance of 1 move
	 * 
	 */

	
	private static int X = 0;
	private static int Y = 1;
	
	private static int [][] DIRECTIONS = { {-1,0}, {1,0}, {0,-1}, {0,1}};
	
	public boolean exist (char [][] board, String word) {
		
		HashMap <Character, List<int[]>> charToPoitions = getCharToPositionsMapping(board);
		
		char [] wordChars = word.toCharArray();
		// first word char not in the grid -> stop immediately
		if (!charToPoitions.containsKey(wordChars[0])) {
			return false;
		}
		
		boolean [][] visited = new boolean [board.length][board[0].length];
		
		for (int[] elem: charToPoitions.get(wordChars[0])) {
			if (existRecursive(visited, 0, elem, board, wordChars)) {
				return true;
			}
		}
		
		return false;
	}
	
	private boolean existRecursive (boolean [][] visited, int index, int [] current, char [][] grid, char[] wordChars) {
		
		if (index == wordChars.length) {
			return true;
		}
		
		int gridXN = grid.length;
		int gridYM = grid[0].length;
		
		if (current[X] < 0 || current[X] >= gridXN ||
				current[Y] < 0 || current[Y] >= gridYM ||
				visited[current[X]][current[Y]] ||
				grid[current[X]][current[Y]] != wordChars[index]) {
			return false;
		}
	
		visited[current[X]][current[Y]] = true;
		
		for (int [] dir : DIRECTIONS) {
			int newX = current[X] + dir[X];
			int newY = current[Y] + dir[Y];
			
			boolean tmpResult = existRecursive(visited, index+1, new int []{newX, newY}, grid, wordChars);
			if (tmpResult) {
				visited[current[X]][current[Y]] = false;
				return true;
			}
		}
		
		visited[current[X]][current[Y]] = false;
		
		return false;
	}
	
	private HashMap<Character, List<int[]>> getCharToPositionsMapping(char [][] grid) {
		HashMap <Character, List<int[]>> mapping = new HashMap<Character, List<int[]>>();
		
		for (int i=0; i<grid.length; i++) {
			for (int j=0; j<grid[0].length; j++) {
				char c  = grid[i][j];
				if (mapping.containsKey(c)) {
					mapping.get(c).add(new int [] {i,j});
				} else {
					List <int[]> tmpList = new ArrayList<int[]>();
					tmpList.add(new int [] {i,j});
					mapping.put(c, tmpList);
				}
			}
		}
		
		return mapping;
	}
}
