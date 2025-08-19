package structures;

import java.util.ArrayList;
import java.util.List;

public class MaxEarningsTaxi {

	/**
	 * There are n points on a road you are driving your taxi on. 
	 * The n points on the road are labeled from 1 to n in the direction you are going, 
	 * and you want to drive from point 1 to point n to make money by picking up passengers. 
	 * You cannot change the direction of the taxi.
	 * 
	 * The passengers are represented by a 0-indexed 2D integer array rides, 
	 * where rides[i] = [starti, endi, tipi] denotes the ith passenger 
	 * requesting a ride from point starti to point endi who is willing to give a tipi dollar tip.
	 * 
	 * For each passenger i you pick up, you earn endi - starti + tipi dollars. 
	 * You may only drive at most one passenger at a time.
	 * 
	 * Given n and rides, return the maximum number of dollars 
	 * you can earn by picking up the passengers optimally.
	 * 
	 * Note: You may drop off a passenger and pick up a different passenger at the same point.
	 * 
	 * 
	 * @param n
	 * @param rides
	 * @return
	 */
    public long maxTaxiEarnings(int n, int[][] rides) {
    	
    	// dp[i] - is maximum earning at i-th position
    	long[] dp = new long[n+1];
    	
    	// helper array of lists of rides ending at i-th position
    	List<int[]>[] ridesEndingAt = new List[n+1];
    	for (int i=1; i<=n; i++) {
    		ridesEndingAt[i] = new ArrayList<>();
    	}
    	
    	for(int[] ride : rides) {
    		ridesEndingAt[ride[1]].add(ride);
    	}
    	
    	
    	for (int i=1; i<=n; i++) {
    		// even if no ride, the i+1-th position can get max from i-th
    		dp[i] = dp[i-1];
    		for (int[] ride: ridesEndingAt[i]) {
    			int start = ride[0];
    			int end = ride[1];
    			int tip = ride[2];
    			int profit = end - start + tip;
    			
    			dp[i] = Math.max(dp[i],  dp[start] + profit );
    		}
    	}
    	
    	return dp[n];
    }
}
