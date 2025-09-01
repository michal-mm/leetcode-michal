package numbers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class MajorityElemsTest {

	@Test
	public void testSpec1() {
		int[] nums = {3,2,3};
		List<Integer> expected = List.of(3);
		
		MajorityElems me = new MajorityElems();
		List<Integer> result = me.majorityElement(nums);
		
		assertEquals(expected.size(), result.size());
		for(int expectedElem: expected) {
			assertTrue(result.contains(expectedElem));
		}
	}
	
	@Test
	public void testSpec2() {
		int[] nums = {1};
		List<Integer> expected = List.of(1);
		
		MajorityElems me = new MajorityElems();
		List<Integer> result = me.majorityElement(nums);
		
		assertEquals(expected.size(), result.size());
		for(int expectedElem: expected) {
			assertTrue(result.contains(expectedElem));
		}
	}
	
	@Test
	public void testSpec3() {
		int[] nums = {1,2};
		List<Integer> expected = List.of(1,2);
		
		MajorityElems me = new MajorityElems();
		List<Integer> result = me.majorityElement(nums);
		
		assertEquals(expected.size(), result.size());
		for(int expectedElem: expected) {
			assertTrue(result.contains(expectedElem));
		}
	}
}
