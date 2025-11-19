package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {

        var newArr = Arrays.stream(arr)
                .flatMap(i -> {
                    if (i == 0) {
                        return IntStream.of(i, i);
                    } else {
                        return IntStream.of(i);
                    }
                })
                .limit(arr.length)
                .toArray();

        System.arraycopy(newArr, 0, arr, 0, arr.length);
    }
}
