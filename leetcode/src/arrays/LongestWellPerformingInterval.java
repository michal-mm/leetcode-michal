package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestWellPerformingInterval {

	/**
	 * We are given hours, a list of the number of hours worked per day for a given employee.
	 * A day is considered to be a tiring day if and only if the number 
	 * of hours worked is (strictly) greater than 8.
	 * 
	 * A well-performing interval is an interval of days for which 
	 * the number of tiring days is strictly larger than the number of non-tiring days.
	 * 
	 * Return the length of the longest well-performing interval.
	 * 
	 * Example 1:
	 * Input: hours = [9,9,6,0,6,6,9]
	 * Output: 3
	 * Explanation: The longest well-performing interval is [9,9,6].
	 * 
	 * 
	 * @param hours
	 * @return
	 */
	public int longestWPI(int[] hours) {
		
		// get num of tiring & non-tiring days for entire array 
		// (if tiring>non-tiring) entire array is the longest
		int N = hours.length;
		int[] intervals = new int[N];
		
		for (int i=0; i<N; i++) {
			if (hours[i] > 8) {
				intervals[i] = 1;
			} else {
				intervals[i] = -1;
			}
		}
		
		// prefix sum[i] is a sum of all elems from intrerval table until i-th (but without i-th)
		// prefix sum[1] = interval[0]
		// prefix sum[2] = interval[0] + interval[1] = prefix sum[1] + interval[1]
		// prefix sum[3] = int[0]+int[1]+int[2]= prefix sum[2] + int[2]
		// prefix sum[i] = prefix sum[i-1] + int[i-1]
		int[] prefixSums = new int[N+1];
		
		Map<Integer, Integer> seen = new HashMap<Integer, Integer>();
		
		int longestInterval = prefixSums[0] > 0 ? 1 : 0;
		for (int i=1; i<=N; i++) {
			prefixSums[i] = prefixSums[i-1] + intervals[i-1];
			
			if (prefixSums[i] > 0) {
				longestInterval = i;
			} else {
				seen.putIfAbsent(prefixSums[i], i);
				if (seen.containsKey(prefixSums[i]-1)) {
					// there are elems on poistions [i] and j=seen(prefixSum[i]-1)
					// whose delta is exactly +1 - so there is another subarray
					// that has more positive items than negative - check it's length
					// by doing a simple index math and compare against currently longest interval
					longestInterval = Math.max(longestInterval, i-seen.get(prefixSums[i]-1));
				}
			}
		}
		
		return longestInterval;
	}
}
