package arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivideLongCorridorTest {

	@Test
	public void testSpec1 () {
		String corridor = "SSPPSPS";
		int expected = 3;
		
		DivideLongCorridor dlc = new DivideLongCorridor();
		
		assertEquals(expected, dlc.numberOfWays(corridor));
	}
	
	@Test
	public void testSpec2 () {
		String corridor = "PPSPSP";
		int expected = 1;
		
		DivideLongCorridor dlc = new DivideLongCorridor();
		
		assertEquals(expected, dlc.numberOfWays(corridor));
	}
	
	@Test
	public void testSpec3 () {
		String corridor = "S";
		int expected = 0;
		
		DivideLongCorridor dlc = new DivideLongCorridor();
		
		assertEquals(expected, dlc.numberOfWays(corridor));
	}
}
