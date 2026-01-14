package arrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RelativeSortArray {
    
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> resultMap = new LinkedHashMap<>();

        for (var item : arr2) {
            resultMap.putIfAbsent(item, 0);
        }

        var otherItems = new ArrayList<Integer>();

        for (var item : arr1) {
            if (resultMap.containsKey(item)) {
                resultMap.put(item, resultMap.getOrDefault(item, 0) + 1);
            } else {
                otherItems.add(item);
            }
        }

        otherItems.stream()
                .sorted()
                .forEach(i -> resultMap.put(i, resultMap.getOrDefault(i, 0) + 1));
    
        return resultMap.entrySet().stream()
                        .flatMap(this::repeatKeyByValueTimes)
                        .mapToInt(Integer::valueOf)
                        .toArray();
    }

    private Stream<Integer> repeatKeyByValueTimes(Map.Entry<Integer, Integer> entry) {
        return IntStream.range(0, entry.getValue())
            .map(_ -> entry.getKey())
            .boxed();
    }
}
