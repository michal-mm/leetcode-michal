package strings;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplaceAllQTest {

	@Test
	public void testSpec1() {
		String input = "?zs";
		String expected = "azs";
		
		ReplaceAllQ raq = new ReplaceAllQ();
		
		assertEquals(expected, raq.modifyString(input));
	}
	
	@Test
	public void testSpec2() {
		String input = "ubv?w";
		String expected = "ubvaw";
		
		ReplaceAllQ raq = new ReplaceAllQ();
		
		assertEquals(expected, raq.modifyString(input));
	}
}
