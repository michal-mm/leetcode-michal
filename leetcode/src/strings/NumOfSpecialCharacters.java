package strings;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class NumOfSpecialCharacters {

    public int numberOfSpecialChars(String word) {
        Set<Character> lowerCase = new HashSet<>();
        Set<Character> upperCase = new HashSet<>();

        IntStream.range(0, word.length())
                .mapToObj(word::charAt)
                .forEach(c -> {
                    if (Character.isLowerCase(c))
                        lowerCase.add(c);
                    if (Character.isUpperCase(c))
                        upperCase.add(Character.toLowerCase(c));
                });

        lowerCase.retainAll(upperCase);

        return lowerCase.size();
    }

    public int numberOfSpecialCharsV2(String word) {
        boolean[] foundLower = new boolean[26];
        boolean[] foundUpper = new boolean[26];
        boolean[] results = new boolean[26];

        AtomicInteger result = new AtomicInteger(0);

        int bound = word.length();
        for (int i = 0; i < bound; i++) {
            char c = word.charAt(i);
            if (Character.isLowerCase(c)) foundLower[c - 'a'] = true;
            if (Character.isUpperCase(c)) foundUpper[c - 'A'] = true;
            if (foundLower[Character.toLowerCase(c) - 'a'] &&
                    foundUpper[Character.toUpperCase(c) - 'A'] &&
                    !results[Character.toLowerCase(c) - 'a']) {
                results[Character.toLowerCase(c) - 'a'] = true;
                result.incrementAndGet();
            }
        }

        return result.get();
    }
}
