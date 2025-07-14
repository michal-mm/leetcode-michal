package strings;

import java.util.stream.IntStream;

public class LongestPalindromicSubstr {

    private boolean isPalindrome (String s) {
        // char[] chars = s.toCharArray();
        // for (int i=0; i<chars.length; i++) {
        //     if (chars[i] != chars[chars.length-1-i]) 
        //     return false;
        // }
        // return true;

        return IntStream.range(0, s.length())
            .allMatch(i -> s.charAt(i) == s.charAt(s.length()-1-i));

        // why not to use String::reverse??? :-)

    }

    public String longestPalindromicSubstring (String input) {

        /* 
         * iterate from input length, then input length-1, etc. until 2
         */

        for (int substrLen=input.length(); substrLen>=1; substrLen--) {
            // check each substring of lenght 'substrLen'
            // abbc -> 4
            for (int i=0; i<=input.length()-substrLen; i++) {
                String substr = input.substring(i, i+substrLen-1);
                if (isPalindrome(substr)) {
                    return substr;
                }
            }
        }

        return "";
    }
}
