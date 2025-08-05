package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JumpGame {

	/**
	 * Given an array of integers arr and an integer d. 
	 * In one step you can jump from index i to index:
	 * 
	 * i + x where: i + x < arr.length and  0 < x <= d.
	 * i - x where: i - x >= 0 and  0 < x <= d.
	 * In addition, you can only jump from index i to index j 
	 * if arr[i] > arr[j] and arr[i] > arr[k] 
	 * for all indices k between i and j 
	 * (More formally min(i, j) < k < max(i, j)).
	 * 
	 * You can choose any index of the array and start jumping. 
	 * Return the maximum number of indices you can visit.
	 * 
	 * Notice that you can not jump outside of the array at any time.
	 * 
	 * @param arr
	 * @param d
	 * @return
	 */
	
	public int maxJumps(int[] arr, int d) {
		int jumps = 0;
		int n = arr.length;
		int[] memo = new int[n];
		
		for (int i=0; i<n; i++) {
			jumps = Math.max(jumps, dfs(arr, d, i, memo));
		}
		
		return jumps;	
	}
	
	
	private int dfs (int[] arr, int d, int i, int[] memo) {
		if (memo[i] != 0) {
			return memo[i];
		}
		
		int maxPath = 1;
		
		// to the right ->
		for (int j=i+1; j<=Math.min(i+d, arr.length-1); j++) {
			if (arr[j] >= arr[i]) {
				break;
			}
			maxPath = Math.max(maxPath, 1+dfs(arr, d, j, memo));
		}
			
		// to the left <-
		for (int j=i-1; j>=Math.max(i-d, 0); j--) {
			if (arr[j] >= arr[i]) {
				break;
			}
			maxPath = Math.max(maxPath, 1+dfs(arr, d, j, memo));
		}
		
		// store memo[i]
		memo[i] = maxPath;
		
		return maxPath;
	}
}
