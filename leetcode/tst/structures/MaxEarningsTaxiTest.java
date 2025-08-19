package structures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxEarningsTaxiTest {

	@Test
	public void testSpec1() {
		int n = 5;
		int[][] rides = {{2,5,4},{1,5,1}};
		int output = 7;
		
		MaxEarningsTaxi met = new MaxEarningsTaxi();
		
		assertEquals(output, met.maxTaxiEarnings(n, rides));
	}
	
	@Test
	public void testSpec2() {
		int n = 20;
		int[][] rides = {{1,6,1},{3,10,2},{10,12,3},{11,12,2},{12,15,2},{13,18,1}};
		int output = 20;
		
		MaxEarningsTaxi met = new MaxEarningsTaxi();
		
		assertEquals(output, met.maxTaxiEarnings(n, rides));
	}
}
