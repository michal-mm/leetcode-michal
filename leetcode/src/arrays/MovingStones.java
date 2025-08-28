package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class MovingStones {

	/** 
	 * There are some stones in different positions on the X-axis. 
	 * You are given an integer array stones, the positions of the stones.
	 * 
	 * Call a stone an endpoint stone if it has the smallest or largest position. 
	 * In one move, you pick up an endpoint stone and move it 
	 * to an unoccupied position so that it is no longer an endpoint stone.
	 * 
	 * In particular, if the stones are at say, stones = [1,2,5], 
	 * you cannot move the endpoint stone at position 5, 
	 * since moving it to any position (such as 0, or 3) 
	 * will still keep that stone as an endpoint stone
	 * 
	 * The game ends when you cannot make any more moves 
	 * (i.e., the stones are in three consecutive positions).
	 * 
	 * Return an integer array answer of length 2 where:
	 * 
	 * answer[0] is the minimum number of moves you can play, and
	 * answer[1] is the maximum number of moves you can play.
	 * 
	 * Example 1:
	 * Input: stones = [7,4,9]
	 * Output: [1,2]
	 * Explanation: We can move 4 -> 8 for one move to finish the game.
	 * Or, we can move 9 -> 5, 4 -> 6 for two moves to finish the game.
	 * 
	 * Example 2:
	 * Input: stones = [6,5,4,3,10]
	 * Output: [2,3]
	 * 
	 * @param stones
	 * @return
	 */
	public int[] numMovesStonesII(int[] stones) {
		// sort stones indices 
		Arrays.sort(stones);
		
		int n = stones.length;
		
		int lowEndpoint = stones[0];
		int highEndpoint = stones[n-1];
		
		// initial edge case
		if (highEndpoint-lowEndpoint+1==n) {
			// we're already good, no free spots
			return new int[] {0,0};
		}
		
		int lowResult = n;
		// max moves is maximum of either using the left or right endpoint stone
		// moving left most (low) endpoint: stones[n-1]-stones[1]+1-(n-1)
		// moving right most (high) endpoint: stones[n-1-1]-stones[0]+1-(n-1)
		int highRestult = Math.max(stones[n-1]-stones[1]-n+2, stones[n-2]-stones[0]-n+2);
		
		int start = 0;
		for (int end=0; end<n; end++) {
			// sliding window size setting (should be less than n)
			while (stones[end]-stones[start]>=n) {
				start++;
			}
			
			if (end-start+1 == (n-1) && stones[end]-stones[start]==(n-2)) {
				lowResult = Math.min(lowResult, 2);
			} else {
				lowResult = Math.min(lowResult, n-(end-start+1));
			}
			
		}
		
		return new int[] {lowResult,highRestult};
	}
}
