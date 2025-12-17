package structures;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NextGreateNodeTest {

	@Test
	public void testSpec1() {
		/*
		 * Input: head = [2,1,5]
		 * Output: [5,5,0]
		 */
		ListNode ln2 = new ListNode(5);
		ListNode ln1 = new ListNode(1, ln2);
		ListNode ln0 = new ListNode(2, ln1);
		
		int[] output = {5,5,0};
		
		NextGreaterNode ngn = new NextGreaterNode();
		
		assertArrayEquals(output, ngn.nextLargerNodes(ln0));
	}

	@Test
	public void testSpec2() {
		/*
		 * Input: head = [2,7,4,3,5]
		 * Output: [7,0,5,5,0]
		 */
		ListNode ln4 = new ListNode(5);
		ListNode ln3 = new ListNode(3, ln4);
		ListNode ln2 = new ListNode(4, ln3);
		ListNode ln1 = new ListNode(7, ln2);
		ListNode ln0 = new ListNode(2, ln1);
		
		int[] output = {7,0,5,5,0};
		
		NextGreaterNode ngn = new NextGreaterNode();
		
		assertArrayEquals(output, ngn.nextLargerNodes(ln0));
	}
}
