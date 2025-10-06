package strings;

import java.util.*;


public class IncreasingDecreasingString {
    /**
     * You are given a string s. Reorder the string using the following algorithm:
     * ----
     * 1. Remove the smallest character from s and append it to the result.
     * 2. Remove the smallest character from s that is greater
     * than the last appended character, and append it to the result.
     * 3. Repeat step 2 until no more characters can be removed.
     * 4. Remove the largest character from s and append it to the result.
     * 5. Remove the largest character from s that is smaller
     * than the last appended character, and append it to the result.
     * 6. Repeat step 5 until no more characters can be removed.
     * 7. Repeat steps 1 through 6 until all characters from s have been removed.
     * ----
     * If the smallest or largest character appears more than once,
     * you may choose any occurrence to append to the result.
     * ---
     * Return the resulting string after reordering s using this algorithm.
     * ----
     * Example 1:
     * ---
     * Input: s = "aaaabbbbcccc"
     * Output: "abccbaabccba"
     * Explanation: After steps 1, 2 and 3 of the first iteration, result = "abc"
     * After steps 4, 5 and 6 of the first iteration, result = "abccba"
     * First iteration is done. Now s = "aabbcc" and we go back to step 1
     * After steps 1, 2 and 3 of the second iteration, result = "abccbaabc"
     * After steps 4, 5 and 6 of the second iteration, result = "abccbaabccba"
     *
     * @param s input string
     * @return output string
     */
    public String sortString(String s) {
        Map<Character, Integer> charCount = new TreeMap<>();
        StringBuilder result = new StringBuilder(s.length());

        for (char c : s.toCharArray()) {
            charCount.merge(c, 1, Integer::sum);
        }

        // repeat points 1-6 until there are chars to process
        while (!charCount.isEmpty()) {
            // perform steps 1-2-3
            appendInOrder(charCount, result, true);

            // steps 4-5-6
            if (!charCount.isEmpty()) {
                appendInOrder(charCount, result, false);
            }
        }

        return result.toString();
    }

    private void appendInOrder(Map<Character, Integer> charCount, StringBuilder result, boolean ascending) {
        Character[] chars = charCount.keySet().toArray(new Character[0]);

        if (ascending) {
            for (Character c : chars) {
                appendAndDecrement(c, charCount, result);
            }
        } else {
            for (Character c : Arrays.stream(chars).toList().reversed()) {
                appendAndDecrement(c, charCount, result);
            }
        }
    }

    private void appendAndDecrement(Character c, Map<Character, Integer> charCount, StringBuilder result) {
        int count = charCount.get(c);
        result.append(c);

        if (count == 1) {
            charCount.remove(c);
        } else {
            charCount.put(c, count - 1);
        }
    }

}