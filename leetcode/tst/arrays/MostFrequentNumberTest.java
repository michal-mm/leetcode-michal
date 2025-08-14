package arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MostFrequentNumberTest {

	@Test
	public void testSpec1() {
		int [] nums = {1,100,200,1,100};
		int key = 1;
		int expected = 100;
		
		MostFrequentNumber mfn = new MostFrequentNumber();
		
		assertEquals(expected, mfn.mostFrequent(nums, key));
	}
	
	@Test
	public void testSpec2() {
		int [] nums = {2,2,2,2,3};
		int key = 2;
		int expected = 2;
		
		MostFrequentNumber mfn = new MostFrequentNumber();
		
		assertEquals(expected, mfn.mostFrequent(nums, key));
	}
}
