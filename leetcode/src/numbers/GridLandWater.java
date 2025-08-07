package numbers;

import java.util.ArrayList;
import java.util.List;

public class GridLandWater {
	
	private static int LAND = 1;
	private static int WATER = 0;
	
	/* 
	 * 0 - water
	 * 1 - land
	 * 
	 * input: [[1,0,1],[0,0,0],[1,0,1]]
	 * output: 2
	 * 
	 * #~#
	 * ~~~
	 * #~#
	 * 
	 * input: [[1,0,0],[0,0,0],[0,0,0]]
	 * output: 4
	 * 
	 * #~~
	 * ~~~
	 * ~~~
	 * 
	 *  Find water cell:
	 *  	distance (water_cell, nearest land) is MAX and return it
	 *  -1 if there's no land or water
	 *  
	 *   distance is manhattan metric
	 *   
	 *   1. Get LAND positions and store them in the list
	 *   2. For each WATER position calculate distance to all LANDs
	 *   	2A. the smallest distance is the interim result
	 *      2B. if the distance is higher than already stored then replace it
	 *   
	 *   iterate over WATER fields (for each elem in the grid, if WATER then...)
	 */
			
	public int maxDistance (int [][]grid) {
		int result = -1;
		
		List<int[]> land = new ArrayList<>();
		
		for (int i=0; i<grid.length; i++) {
			for (int j=0; j<grid.length; j++) {
				if (grid[i][j] == LAND) {
					land.add(new int[] {i,j});
				}
			}
		}
		
		for (int i=0; i<grid.length; i++) {
			for (int j=0; j<grid.length; j++) {
				if (grid[i][j] == WATER) {
					int shortestDistance = getShortestDistance(i,j, land);
					if (shortestDistance > result) {
						result = shortestDistance;
					}
				}
			}
		}
		
		return result;
	}
	
	private int getShortestDistance(int waterX, int waterY, List<int[]> landList) {
		int result = Integer.MAX_VALUE;
		int X = 0;
		int Y = 1;
		
		for (int [] coord: landList) {
			int tmpDistance = distance(waterX, waterY, coord[X], coord[Y]);
			if (tmpDistance < result) {
				result = tmpDistance;
			}
		}
		
		return result;
	}

	private int distance (int x1, int y1, int x2, int y2) {
		return (Math.max(x1, x2) - Math.min(x1, x2)) + (Math.max(y1, y2) - Math.min(y1, y2));
	}
}
