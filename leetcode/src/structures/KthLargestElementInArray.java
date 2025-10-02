package structures;

import java.util.PriorityQueue;

@SuppressWarnings("DataFlowIssue")
public class KthLargestElementInArray {

    /**
     * Given an integer array nums and an integer k,
     * return the kth largest element in the array.
     * ---
     * Note that it is the kth largest element in the sorted order, not the kth distinct element.
     * ----
     * Can you solve it without sorting?
     * ----
     * Example 1:
     *-----
     * Input: nums = [3,2,1,5,6,4], k = 2
     * Output: 5
     * @param nums - array with numbers
     * @param k - kth param
     * @return - kth largest item
     */
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queuedNumbers = new PriorityQueue<>();

        for (int num : nums) {
            if (queuedNumbers.size() < k) {
                queuedNumbers.add(num);
            } else if ( num > queuedNumbers.peek()) {
                queuedNumbers.poll();
                queuedNumbers.add(num);
            }
        }

        return queuedNumbers.poll();
    }
}
