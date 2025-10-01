package arrays;

public class BeautifulTowers {

    /**
     * You are given an array heights of n integers representing the number
     * of bricks in n consecutive towers. Your task is to remove some bricks
     * to form a mountain-shaped tower arrangement. In this arrangement,
     * the tower heights are non-decreasing, reaching a maximum peak value
     * with one or multiple consecutive towers and then non-increasing.
     * ---
     * Return the maximum possible sum of heights of a mountain-shaped tower arrangement.
     * ---
     * Example 1:
     * ---
     * Input: heights = [5,3,4,1,1]
     * Output: 13
     * Explanation:
     * We remove some bricks to make heights = [5,3,3,1,1], the peak is at index 0.
     * @param heights - array of int with heights
     * @return sum of heights
     */
    public long maximumSumOfHeights(int[] heights) {
        long maxSum = 0;
        long totalSum = 0;

        for (int item : heights) {
            totalSum += item;
        }

        for (int i=0; i<heights.length; i++) {
            maxSum = Math.max(maxSum, maxWithPeakAtIdx(heights, i, totalSum, maxSum));
        }

        return maxSum;
    }

    private long maxWithPeakAtIdx(int[] heights, int idx, long totalSum, long currentMax) {
        long trimmedTotal = totalSum;
        // assumption: we don't modify the peak!
        int prevElem;

        // check to the left
        prevElem = heights[idx];
        for (int i=idx-1; i>=0; i--) {
            if (prevElem < heights[i]) {
                trimmedTotal -= (heights[i]-prevElem);
                if (trimmedTotal < currentMax) {
                    // doesn't make sense to check further since we can't reach better
                    return 0;
                }
            } else {
                prevElem = heights[i];
            }
        }

        // check to the right
        prevElem = heights[idx];
        for(int i=idx+1; i<heights.length; i++) {
            if(prevElem < heights[i]) {
                trimmedTotal -= (heights[i]-prevElem);
                if (trimmedTotal < currentMax) {
                    return 0;
                }
            } else {
                prevElem = heights[i];
            }
        }

        return trimmedTotal;
    }
}
