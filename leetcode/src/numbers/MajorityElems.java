package numbers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElems {

	/**
	 * Given an integer array of size n, f
	 * ind all elements that appear more than ⌊ n/3 ⌋ times.
	 * 
	 * 
	 * @param nums
	 * @return
	 */
    public List<Integer> majorityElement(int[] nums) {
     
    	int min = nums.length / 3;
    	Map<Integer, Integer> elems = new HashMap<>();
    	
    	for (int elem: nums) {
    		elems.put(elem, elems.getOrDefault(elem, 0)+1);
    	}
    	
    	return elems.keySet().stream()
    			.filter(key -> elems.get(key)>min)
    			.toList();
    }
}
