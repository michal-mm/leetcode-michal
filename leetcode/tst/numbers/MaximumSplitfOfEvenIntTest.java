package numbers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class MaximumSplitfOfEvenIntTest {

	@Test
	public void testSpec1() {
		long finalSum = 12;
		List<Long> expected = List.of(2L,4L,6L);
		
		MaximumSplitOfEvenInt msoei = new MaximumSplitOfEvenInt();
		List<Long> result = msoei.maximumEvenSplit(finalSum);
		
		assertEquals(expected.size(), result.size());
		for (long resultItem: result) {
			assertTrue(result.contains(resultItem));
		}
	}
	
	@Test
	public void testSpec2() {
		long finalSum = 7;
		List<Long> expected = List.of();
		
		MaximumSplitOfEvenInt msoei = new MaximumSplitOfEvenInt();
		List<Long> result = msoei.maximumEvenSplit(finalSum);
		
		assertEquals(expected.size(), result.size());
		for (long resultItem: result) {
			assertTrue(result.contains(resultItem));
		}
	}
	
	@Test
	public void testSpec3() {
		long finalSum = 28;
		List<Long> expected = List.of(6L,8L,2L,12L);
		
		MaximumSplitOfEvenInt msoei = new MaximumSplitOfEvenInt();
		List<Long> result = msoei.maximumEvenSplit(finalSum);
		
		assertEquals(expected.size(), result.size());
		for (long resultItem: result) {
			assertTrue(result.contains(resultItem));
		}
	}
	
	@Test
	public void testSpec4() {
		long finalSum = 16;
		List<Long> expected = List.of(2L,4L,10L);
		
		MaximumSplitOfEvenInt msoei = new MaximumSplitOfEvenInt();
		List<Long> result = msoei.maximumEvenSplit(finalSum);
		
		assertEquals(expected.size(), result.size());
		for (long resultItem: result) {
			assertTrue(result.contains(resultItem));
		}
	}
}
