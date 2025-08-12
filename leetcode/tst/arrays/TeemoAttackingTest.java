package arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TeemoAttackingTest {

	@Test
	public void testSpec1() {
		int[] timeSeries = {1,4};
		int duration = 2;
		int expected = 4;
		
		TeemoAttacking ta = new TeemoAttacking();
		
		assertEquals(expected, ta.findPoisonedDuration(timeSeries, duration));
	}
	
	@Test
	public void testSpec2() {
		int[] timeSeries = {1,2};
		int duration = 2;
		int expected = 3;
		
		TeemoAttacking ta = new TeemoAttacking();
		
		assertEquals(expected, ta.findPoisonedDuration(timeSeries, duration));
	}
}
