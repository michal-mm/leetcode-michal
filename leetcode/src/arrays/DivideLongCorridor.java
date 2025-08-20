package arrays;

public class DivideLongCorridor {

	/**
	 * Along a long library corridor, there is a line of seats and decorative plants. 
	 * You are given a 0-indexed string corridor of length n consisting of letters 'S' and 'P' 
	 * where each 'S' represents a seat and each 'P' represents a plant.
	 * 
	 * One room divider has already been installed to the left of index 0, 
	 * and another to the right of index n - 1. Additional room dividers can be installed. 
	 * For each position between indices i - 1 and i (1 <= i <= n - 1), 
	 * at most one divider can be installed.
	 * 
	 * Divide the corridor into non-overlapping sections, 
	 * where each section has exactly two seats with any number of plants. 
	 * There may be multiple ways to perform the division. 
	 * Two ways are different if there is a position with 
	 * a room divider installed in the first way but not in the second way.
	 * 
	 * Return the number of ways to divide the corridor. 
	 * Since the answer may be very large, return it modulo 10^9 + 7. 
	 * If there is no way, return 0.
	 * 
	 * Input: corridor = "SSPPSPS"
	 * Output: 3 (SS|PPSPS, SSP|PSPS, SSPP|SPS
	 * 
	 * @param corridor
	 * @return
	 */
    public int numberOfWays(String corridor) {
    	int MOD = (int) 1e9;
    	
    	int totalSeats = 0;
    	for (char c: corridor.toCharArray()) {
    		if (c == 'S') {
    			totalSeats += 1;
    		}
    	}
    	
    	// edge case handling, no seats or odd number of seats
    	if (totalSeats == 0 || totalSeats % 2 == 1) {
    		return 0;
    	}
    	
    	// edge case: just 2 seats
    	if (totalSeats == 2) {
    		return 1;
    	}
    	
    	int[] seatPositions = new int[totalSeats];
    	int seatIndex = 0;
    	for (int i=0; i<corridor.length(); i++) {
    		if (corridor.charAt(i) == 'S') {
    			seatPositions[seatIndex] = i;
    			seatIndex++;
    		}
    	}
    	
    	long ways = 1;
    	
    	for (int i=2; i<totalSeats; i+=2) {
    		int endCurrentPair = seatPositions[i-1]; // example 2
    		int startNextPair = seatPositions[i]; // example 5
    		// there are 2 plants in between and 2+1 possible ways to place walls
    		int possibleDividersBetweenCurrAndNext = startNextPair - endCurrentPair;
    		// we have to multiply existing number of ways by the next "room"
    		// if first section had  3 possible splits and the next one can have 2, then overall we have 3*2 possible
    		// if at some time we're in the situation where we can't split properly, the possibleDividers will be 0
    		// and the overall ways becomes 0
    		// one could break the for loop if ways == 0 (no reason to check further)
    		ways = (ways * possibleDividersBetweenCurrAndNext) % MOD;
    		if (ways == 0) {
    			break;
    		}
    	}
    	
        return (int) (ways%(MOD));
    }
}
