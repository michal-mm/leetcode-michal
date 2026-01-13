package arrays;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class MaximalScoreAfterKOpers {

    public long maxKelements(int[] nums, int k) {
        // Create max heap using reverse order comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        // Add all elements to the heap
        for (int num : nums) {
            maxHeap.offer(num);
        }

        return IntStream.range(0, k)
            .mapToLong(_ -> getMaxValAndUpdate(maxHeap))
            .sum();
    }

    private static long getMaxValAndUpdate(PriorityQueue<Integer> maxHeap) {
        int maxVal = maxHeap.poll();
        int updated = maxVal / 3;
        if (maxVal % 3 != 0) updated++;
        maxHeap.offer(updated);
        return maxVal;
    }
}
