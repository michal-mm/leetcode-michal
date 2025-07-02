package strings;

import java.util.stream.IntStream;

public class OriginalString {

    public int numOfWords (String word) {
        // abbcccc
        // 0123456
        return 1 + IntStream.range(1, word.length())
            .filter(i -> word.charAt(i) == word.charAt(i-1)) // stream of indexes where curr == prev | 2,4,5,6
            .toArray().length;

    }
}
