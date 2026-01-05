package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordsObtainedAfterAddingLetter {

    public int wordCount(String[] startWords, String[] targetWords) {
        int result = 0;
        Map<Integer, List<String>> numOfLetters2Strings = new HashMap<>();

        numOfLetters2Strings
                .computeIfAbsent(startWords.length, _ -> new ArrayList<>()).addAll(Arrays.asList(startWords));

        for (String word: targetWords) {
            List<String> prefixes = numOfLetters2Strings.getOrDefault(word.length()-1, new ArrayList<>());
            for (String prefix: prefixes) {
                // do a check for each word against the "word"
                int[] wordOccurence = charOccurenceMap(word);
                int[] prefixOccurence = charOccurenceMap(prefix);
                if (onlyOnePositionIsDifferent(wordOccurence, prefixOccurence)) {
                    result++;
                    break;
                }
            }
        }

        return result;
    }

    private boolean onlyOnePositionIsDifferent(int[] target, int[] prefix) {
        int numOfSameElems = 0;
        int differentElem = -1;

        for (int i=0; i<target.length; i++) {
            if (target[i] == prefix[i]) {
                numOfSameElems++;
            } else {
                differentElem = i;
            }
        }

//        System.out.println("same elems: " + numOfSameElems + " delta elem: " + differentElem);

        return numOfSameElems == target.length-1
                && target[differentElem] == prefix[differentElem] + 1;
    }

    private int[] charOccurenceMap(String s) {
        int[] result = new int[26];

        for (char c: s.toCharArray()) {
            result[c-'a']++;
        }

        return result;
    }
}
