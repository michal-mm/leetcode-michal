package strings;

import java.util.HashSet;
import java.util.Set;
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
}
