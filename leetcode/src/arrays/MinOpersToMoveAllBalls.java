package arrays;

public class MinOpersToMoveAllBalls {

    /**
     * You have n boxes. You are given a binary string boxes of length n,
     * where boxes[i] is '0' if the ith box is empty, and '1' if it contains one ball.
     * ---
     * In one operation, you can move one ball from a box to an adjacent box.
     * Box i is adjacent to box j if abs(i - j) == 1. Note that after doing so,
     * there may be more than one ball in some boxes.
     * ---
     * Return an array answer of size n, where answer[i] is the minimum
     * number of operations needed to move all the balls to the ith box.
     * ---
     * Each answer[i] is calculated considering the initial state of the boxes.
     * ---
     * Example 1:
     * ---
     * Input: boxes = "110"
     * Output: [1,1,3]
     * @param boxes - array representing boxes
     * @return array with minimum operations for each index
     */
    public int[] minOperations(String boxes) {
        int [] result = new int[boxes.length()];

        char[] chars = boxes.toCharArray();

        // iterate each index
        for (int i=0; i<boxes.length(); i++) {
            for (int j=0; j<boxes.length(); j++) {
                if (i == j) continue;

                if (chars[j] == '1') {
                    result[i] += Math.abs(i - j);
                }
            }
        }

        return result;
    }
}
