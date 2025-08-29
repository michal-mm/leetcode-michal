package structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreaterNode {

	/**
	 * You are given the head of a linked list with n nodes.
	 * For each node in the list, find the value of the next greater node. 
	 * That is, for each node, find the value of the first node 
	 * that is next to it and has a strictly larger value than it.
	 * 
	 * Return an integer array answer where answer[i] 
	 * is the value of the next greater node of the ith node (1-indexed). 
	 * If the ith node does not have a next greater node, set answer[i] = 0.
	 * 
	 * @param head
	 * @return
	 */
	public int[] nextLargerNodes(ListNode head) {
		List<Integer> values = getValuesFromNodes(head);
		int N = values.size();
		int[] result = new int[N];
		
		// iterate from left side to the end
		// if the next elem is greater than current then current one has next biggest
		// else we have to wait and check further elems (keep tracking these elems
		
		Stack<Integer> pendingItems = new Stack();
		
		for (int i=0; i<N; i++) {
			// check items in the stack against current item
			while (pendingItems.isEmpty() == false  && 
					values.get(pendingItems.peek()) < values.get(i)
							) {
				result[pendingItems.peek()] = values.get(i);
				pendingItems.pop();
				
			}
			pendingItems.push(i);
		}
		
		return result;
	}

	
	private List<Integer> getValuesFromNodes(ListNode head) {
		List<Integer> values = new ArrayList<Integer>();
		
		ListNode node = head;
		while (node != null) {
			values.add(node.val);
			node = node.next;
		}
		
		return values;
	}
}
