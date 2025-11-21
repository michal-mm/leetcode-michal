package strings;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given a string s of '(' , ')' and lowercase English characters.
 * <br/>
 * Your task is to remove the minimum number
 * of parentheses ( '(' or ')', in any positions ) so that
 * the resulting parentheses string is valid and return any valid string.
 * <br/>
 * Formally, a parentheses string is valid if and only if:
 * <br/>
 * It is the empty string, contains only lowercase characters, or
 * It can be written as AB (A concatenated with B), where A and B are valid strings, or
 * It can be written as (A), where A is a valid string.
 * ---
 * Example 1:
 * ---
 * Input: s = "lee(t(c)o)de)"
 * Output: "lee(t(c)o)de"
 * Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
 */
public class MinRemoveParentheses {

    public String minRemoveToMakeValid(String s) {
        var chars = s.toCharArray();

        List<Integer> indicesToRemove = new ArrayList<>();
        int openP = 0;

        for (int i=0; i<chars.length; i++) {
            switch(chars[i]) {
                case '(' ->  {
                    indicesToRemove.add(i);
                    openP++;
                }
                case ')' -> {
                    if (openP > 0) {
                        indicesToRemove.removeLast();
                        openP--;
                    } else {
                        indicesToRemove.add(i);
                    }
                }
            }
        }

        Set<Integer> indicesToRemoveSet = Set.copyOf(indicesToRemove);

        return IntStream.range(0, chars.length)
                .filter(i -> !indicesToRemoveSet.contains(i))
                .mapToObj(i -> String.valueOf(chars[i]))
                .collect(Collectors.joining());
    }
}
