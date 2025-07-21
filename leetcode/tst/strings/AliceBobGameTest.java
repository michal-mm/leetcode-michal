package strings;

import junit.framework.TestCase;

public class AliceBobGameTest extends TestCase {

	public void testSpec1 () {
		AliceBobGame game = new AliceBobGame();
		String input = "5023";
		assertEquals(false, game.sumGame(input));
	}
	
	public void testSpec2 () {
		AliceBobGame game = new AliceBobGame();
		String input = "25??";
		assertEquals(true, game.sumGame(input));
	}
	
	public void testSpec3 () {
		AliceBobGame game = new AliceBobGame();
		String input = "?3295???";
		assertEquals(false, game.sumGame(input));
	}
	
	public void testSpec4 () {
		AliceBobGame game = new AliceBobGame();
		String input = "2?2?";
		assertEquals(false, game.sumGame(input));
	}
}
