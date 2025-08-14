package strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
