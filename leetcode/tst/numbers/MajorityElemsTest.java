package numbers;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MajorityElemsTest {

	@Test
	public void testSpec1() {
		int[] nums = {3,2,3};

		List<Integer> expected = List.of(3);
		
		MajorityElems me = new MajorityElems();
		List<Integer> result = me.majorityElement(nums);
		List<Integer> resultBoyerMoore = me.majorityElementWithBoyerMoore(nums);
		
		assertEquals(expected.size(), result.size());
		assertEquals(expected.size(), resultBoyerMoore.size());
		for(int expectedElem: expected) {
			assertTrue(result.contains(expectedElem));
			assertTrue(resultBoyerMoore.contains(expectedElem));
		}
	}
	
	@Test
	public void testSpec2() {
		int[] nums = {1};
		List<Integer> expected = List.of(1);
		
		MajorityElems me = new MajorityElems();
		List<Integer> result = me.majorityElement(nums);
		List<Integer> resultBoyerMoore = me.majorityElementWithBoyerMoore(nums);
		
		assertEquals(expected.size(), result.size());
		assertEquals(expected.size(), resultBoyerMoore.size());
		for(int expectedElem: expected) {
			assertTrue(result.contains(expectedElem));
			assertTrue(resultBoyerMoore.contains(expectedElem));
		}
	}
	
	@Test
	public void testSpec3() {
		int[] nums = {1,2};
		List<Integer> expected = List.of(1,2);
		
		MajorityElems me = new MajorityElems();
		List<Integer> result = me.majorityElement(nums);
		List<Integer> resultBoyerMoore = me.majorityElementWithBoyerMoore(nums);
		
		assertEquals(expected.size(), result.size());
		assertEquals(expected.size(), resultBoyerMoore.size());
		for(int expectedElem: expected) {
			assertTrue(result.contains(expectedElem));
			assertTrue(resultBoyerMoore.contains(expectedElem));
		}
	}
}
