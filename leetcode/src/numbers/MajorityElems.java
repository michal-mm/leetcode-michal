package numbers;

import java.util.ArrayList;
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
     
    	int threashold = nums.length / 3;
    	Map<Integer, Integer> elems = new HashMap<>();
    	
    	for (int elem: nums) {
    		elems.put(elem, elems.getOrDefault(elem, 0)+1);
    	}
    	
    	return elems.keySet().stream()
    			.filter(key -> elems.get(key)>threashold)
    			.toList();
    }
    
    public List<Integer> majorityElementWithBoyerMoore(int[] nums) {
    	List<Integer> result = new ArrayList<>();
    	
    	int threashold = nums.length / 3;
    	
    	int firstMajor = Integer.MAX_VALUE;
    	int firstSum = 0;
    	int secondMajor = Integer.MIN_VALUE;
    	int secondSum = 0;
    	
    	// find the two most frequent elems
    	for (int i=0; i<nums.length; i++) {
    		if (nums[i] == firstMajor) {
    			firstSum++;
    		} else if (nums[i] == secondMajor) {
    			secondSum++;
    		} else if (firstSum == 0) {
    			firstMajor = nums[i];
    			firstSum = 1;
    		} else if(secondSum == 0) {
    			secondMajor = nums[i];
    			secondSum = 1;
    		} else {
    			firstSum--;
    			secondSum--;
    		}
    	}
    	
    	// check if the most frequent elems occur more than n/3 times
    	firstSum = 0;
    	secondSum = 0;
    	for (int item: nums) {
    		if (item == firstMajor) {
    			firstSum++;
    		} else if (item == secondMajor) {
    			secondSum++;
    		}
    	}
    	
    	if (firstSum > threashold) {
    		result.add(firstMajor);
    	}
    	if (secondSum > threashold) {
    		result.add(secondMajor);
    	}
    	
    	return result;
    }
}
