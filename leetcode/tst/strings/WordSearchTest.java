package strings;

import junit.framework.TestCase;

public class WordSearchTest extends TestCase{

	public void testSpec1() {
		WordSearch ws = new WordSearch();
		WordSearch wsc = new WordSearchClaude();
		char [][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "ABCCED";
		boolean expected = true;
		
		assertEquals(expected, ws.exist(board, word));
		assertEquals(expected, wsc.exist(board, word));
 	}
	
	public void testSpec2() {
		WordSearch ws = new WordSearch();
		WordSearch wsc = new WordSearchClaude();
		char [][]board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "SEE";
		boolean expected = true;
		
		assertEquals(expected, ws.exist(board, word));
		assertEquals(expected, wsc.exist(board, word));
 	}
	
	public void testSpec3() {
		WordSearch ws = new WordSearch();
		WordSearch wsc = new WordSearchClaude();
		char [][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "ABCB";
		boolean expected = false;
		
		assertEquals(expected, ws.exist(board, word));
		assertEquals(expected, wsc.exist(board, word));
 	}
	
}
