package arrays;

public class MostWaterContainer {
    /**
     * You are given an integer array height of length n.
     * There are n vertical lines drawn such that
     * the two endpoints of the ith line are (i, 0) and (i, height[i]).
     * ---
     * Find two lines that together with the x-axis form a container,
     * such that the container contains the most water.
     * ---
     * Return the maximum amount of water a container can store.
     * ---
     * Notice that you may not slant the container.
     * ---
     * @param height array
     * @return max area
     */
    public int maxArea(int[] height) {
        // we have to find indexes i and j (i!=j) such that
        // |j-i| x Min(i,j) is max

        int maxProduct = 0;
        int leftIdx = 0;
        int rightIdx = height.length-1;

        while (leftIdx < rightIdx) {
            int currProduct = (rightIdx-leftIdx) * Math.min(height[leftIdx], height[rightIdx]);
            maxProduct = Math.max(maxProduct, currProduct);

            if (height[leftIdx] < height[rightIdx]) {
                // left is less than right, so lets check another left
                leftIdx++;
            } else {
                // right is less than left, so let's check another right
                rightIdx--;
            }
        }

        return maxProduct;
    }
}
