package numbers;

import java.util.LinkedList;
import java.util.List;

public class LinkedNumbers {

	public List<Integer> getDigits (List<Integer> list1, List<Integer> list2) {
		
		/*
		 * list1  = [2,4,3]
		 * list2  = [5,6,4]
		 * output = [7,0,8]
		 * 342 + 465 = 807
		 * 
		 *  iterate over list and add n-th element and store -> sum
		 *  sum%10 is the number to go the result list
		 *  sum/10 is the additional part for the next iteration
		 *  iterate while i<list.length || add > 0  
		 *   
		 */
		
		List<Integer> result = new LinkedList<Integer>(); 
		
		int add = 0;
		int idx=0;
		int max = Math.max(list1.size(), list2.size());
		
		while (idx < max || add > 0) {
			int sum = add;
			if (idx < list1.size()) {
				sum += list1.get(idx);
			}
			if (idx < list2.size()) {
				sum += list2.get(idx);
			}
			
			int elemToAdd = sum % 10;
			result.add(elemToAdd);
			add = sum / 10;
			idx += 1;
		}
		
//		System.out.println(result);
		
		return result;
	}
}
