package numbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaximumSplitOfEvenInt {

	/**
	 * You are given an integer finalSum. 
	 * Split it into a sum of a maximum number of unique positive even integers.
	 * 
	 * For example, given finalSum = 12, the following splits 
	 * are valid (unique positive even integers summing up to finalSum): 
	 * (12), (2 + 10), (2 + 4 + 6), and (4 + 8). 
	 * Among them, (2 + 4 + 6) contains the maximum number of integers. 
	 * Note that finalSum cannot be split into (2 + 2 + 4 + 4) 
	 * as all the numbers should be unique.
	 * 
	 * Return a list of integers that represent a valid split containing 
	 * a maximum number of integers. If no valid split exists for finalSum, 
	 * return an empty list. You may return the integers in any order.
	 * 
	 * Example 1:
	 * Input: finalSum = 12
	 * Output: [2,4,6]
	 * 
	 * 
	 * @param finalSum
	 * @return
	 */
	public List<Long> maximumEvenSplit(long finalSum) {
		List<Long> result = new ArrayList<>();
		
		// return empty list if the number is not even
		if (finalSum%2 != 0) {
			return new ArrayList<>();
		}
				
		// 16
		// 2 + 14 -> ...
		//  add 2, process 14
		//    2+12, 4+10, .currentSet..
		// 4 + 12 -> ...
		// 6 + 10 -> ...
		// 8 + 8 -> ... 
		// 10 + 6 -> ... STOP
		
		long num = 2;
		long sum = 0;
		
		while (sum <= finalSum) {
			long delta = finalSum - sum;
			if (delta < num) {
				// fix it, last elem has to be last elem + delta
				long updatedLast = result.getLast() + delta;
				result.removeLast();
				result.add(updatedLast);
				// it's the last possible elem, break the loop
				break;
			} else {
				result.add(num);
				sum += num;
				num += 2;
			}
		}
		
		
		
		return result;
	}
}
