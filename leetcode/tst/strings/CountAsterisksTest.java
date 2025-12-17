package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountAsterisksTest {

	@Test
	public void testSpec1 () {
		CountAsterisks ca = new CountAsterisks();
		String input = "l|*e*et|c**o|*de|";
		int expected = 2;
		
		assertEquals(expected, ca.countAsterisks(input));
	}

	@Test
	public void testSpec2 () {
		CountAsterisks ca = new CountAsterisks();
		String input = "iamprogrammer";
		int expected = 0;
		
		assertEquals(expected, ca.countAsterisks(input));
	}

	@Test
	public void testSpec3 () {
		CountAsterisks ca = new CountAsterisks();
		String input = "yo|uar|e**|b|e***au|tifu|l";
		int expected = 5;
		
		assertEquals(expected, ca.countAsterisks(input));
	}
}
