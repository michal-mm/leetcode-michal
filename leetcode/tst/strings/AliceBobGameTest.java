package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AliceBobGameTest {

	@Test
	public void testSpec1 () {
		AliceBobGame game = new AliceBobGame();
		String input = "5023";
        assertFalse(game.sumGame(input));
	}

	@Test
	public void testSpec2 () {
		AliceBobGame game = new AliceBobGame();
		String input = "25??";
        assertTrue(game.sumGame(input));
	}

	@Test
	public void testSpec3 () {
		AliceBobGame game = new AliceBobGame();
		String input = "?3295???";
        assertFalse(game.sumGame(input));
	}

	@Test
	public void testSpec4 () {
		AliceBobGame game = new AliceBobGame();
		String input = "2?2?";
        assertFalse(game.sumGame(input));
	}
}
