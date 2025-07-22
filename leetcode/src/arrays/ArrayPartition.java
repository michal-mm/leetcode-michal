package arrays;

public class ArrayPartition {

	public int maxSumAfterPartitioning(int[] arr, int k) {
		/* 
		 * Input: arr = [1,15,7,9,2,5,10], k = 3
		 * Output: 84
		 * 
		 * [1]->[15]->[7,...]
		 *    ->[15,7]->[9]->[2,...]
		 *            [9,2]->[...]
		 *    ->[15,7,9]->[...]
		 * [1,15]->[7]->[9,...]
		 *       ->[7,9]->[...]
		 * [1,15,7]->[9]->[...]
		 *         ->[9,2]->[...]
		 *         
		 * DP[0] - max sum achievable until idx 0 (1) -> 1
		 * DP[0] = max (arr[0]) 
		 * DP[1] = max ( (arr[0] + arr[1]) , max(arr[0],arr[1])+max(arr[0],arr[1]))
		 *         (1),(15)  -> 16
		 *         (15,15) -> 30
		 * DP[2] = max {
		 *         (1),(15),(7)   -> 23
		 *         (1),(15,7)     -> 31
		 *         (1,15),(7)     -> 37
		 *         (15),(15),(15) -> 45
		 *             } 
		 *                =>
		 * DP[3] = [15,7,9]
		 */
		int n = arr.length;
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int maximum = 0;
            int maxSum = 0;
            for (int j = 1; j <= k && i - j >= 0; j++) {
                maximum = Math.max(maximum, arr[i - j]);
                maxSum = Math.max(maxSum, dp[i - j] + maximum * j);
            }
            dp[i] = maxSum;
        }

        return dp[n];
    }
}
