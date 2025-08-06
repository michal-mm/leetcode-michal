package arrays;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxBags {
	
	/**
	 * You have n bags numbered from 0 to n - 1. 
	 * You are given two 0-indexed integer arrays capacity and rocks. 
	 * The i-th bag can hold a maximum of capacity[i] rocks 
	 * and currently contains rocks[i] rocks. 
	 * 
	 * You are also given an integer additionalRocks, 
	 * the number of additional rocks you can place in any of the bags.
	 * 
	 * Return the maximum number of bags that could have full capacity 
	 * after placing the additional rocks in some bags.
	 * 
	 * @param rocks
	 * @param additionalRocks
	 * @return
	 */

	public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {

		// 1) build antiRocks array where antiRocks[i]=0 if i-th bag is full
		//     if it's not full, the value will represent num of rocks to add to make it full
		//
		// 2) sort ascending
		//
		// 3) iterate through antiRocks array and use additionalRocks to utilize capacity
		//
		// ITERATE while there are additionalRocks>0 AND we didn't through entire antiRocks array
		
		int numOfBags = capacity.length;
		int[] antiRocks = new int [numOfBags];
		// 1)
		for (int i=0; i<numOfBags; i++) {
			antiRocks[i] = capacity[i] - rocks[i];
		}
		
		// 2)
		Arrays.sort(antiRocks);
		
		// 3)
		for (int i=0; i<numOfBags && additionalRocks>0; i++) {
			if (antiRocks[i] > additionalRocks) {
				antiRocks[i] -= additionalRocks;
				additionalRocks = 0;
			} else {
				additionalRocks -= antiRocks[i];
				antiRocks[i] = 0;
			}
		}
		
		return (int) IntStream.range(0, numOfBags)
			.filter(idx -> antiRocks[idx] == 0)
			.count();
	}
}
