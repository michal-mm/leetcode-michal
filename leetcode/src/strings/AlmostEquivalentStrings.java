package strings;

import java.util.Arrays;

public class AlmostEquivalentStrings {

    /**
     * Two strings word1 and word2 are considered almost equivalent
     * if the differences between the frequencies of each letter
     * from 'a' to 'z' between word1 and word2 is at most 3.
     * ---
     * Given two strings word1 and word2, each of length n,
     * return true if word1 and word2 are almost equivalent, or false otherwise.
     * ---
     * The frequency of a letter x is the number of times it occurs in the string.
     * ---
     * Example 1:
     * ---
     * Input: word1 = "aaaa", word2 = "bccb"
     * Output: false
     * Explanation: There are 4 'a's in "aaaa" but 0 'a's in "bccb".
     * The difference is 4, which is more than the allowed 3.
     * @param word1 - first word
     * @param word2 - second word
     * @return true/false
     */
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int allowedDiff = 3;

        // basic check
        if (word1 == null || word2 == null || word1.length() != word2.length()) {
            return false;
        }

        int[] frequencies = new int[26];

        // calculate frequencies for the first word
        for (char c : word1.toCharArray()) {
            int idx = (int) c-'a';
            frequencies[idx]++;
        }

        // decrease frequencies by chars form second word
        for (char c : word2.toCharArray()) {
            int idx = (int) c-'a';
            frequencies[idx]--;
            // we can already break if the frequency for given index is less than -3
            if (frequencies[idx] < (-1)*allowedDiff) {
                return false;
            }
        }

        return Arrays.stream(frequencies)
                .filter(item -> item < (-1) * allowedDiff || item > allowedDiff)
                .findAny()
                .isEmpty();
    }
}
