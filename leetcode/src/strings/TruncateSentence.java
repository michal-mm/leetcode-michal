package strings;

import java.util.Arrays;

public class TruncateSentence {

    /**
     * A sentence is a list of words that are separated
     * by a single space with no leading or trailing spaces.
     * Each of the words consists of only uppercase
     * and lowercase English letters (no punctuation).
     * ---
     * For example, "Hello World", "HELLO",
     * and "hello world hello world" are all sentences.
     * You are given a sentence s​​​​​​
     * and an integer k​​​​​​.
     * You want to truncate s​​​​​​
     * such that it contains only the first k​​​​​​ words.
     * Return s​​​​​​ after truncating it.
     * ----
     * Example 1:
     * ----
     * Input: s = "Hello how are you Contestant", k = 4
     * Output: "Hello how are you"
     * Explanation:
     * The words in s are ["Hello", "how" "are", "you", "Contestant"].
     * The first 4 words are ["Hello", "how", "are", "you"].
     * Hence, you should return "Hello how are you".
     * @param s - sentence
     * @param k - number of first words to return
     * @return - truncated string
     */
    public String truncateSentence(String s, int k) {
        String[] words = s.split("\\s+");

        return String.join(" ", Arrays.copyOf(words, k));
    }

    public String truncateSentenceWithCharArray(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();

        char[] strChars = s.toCharArray();
        int seen = 0;

        for (int i=0; i<strChars.length && seen<k; i++) {
            stringBuilder.append(strChars[i]);
            if (strChars[i] == ' ') {
                seen++;
            }
        }

        return stringBuilder.toString().trim();
    }
}
