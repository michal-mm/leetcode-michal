package strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	public int longestSubstring (String input) {
		/* 
		 * Example 1:
		 * Input: s = "abcabcbb"
		 * Output: 3
		 * 
		 * Given a string s, find the length of the longest substring without duplicate characters.
		 * 
		 * iterate from idx=0 till input length
		 * store start and end  of the longest substr 
		 * store somewhere current longest
		 * when char at current idx (from start till end has charAt(idx) 
		 *   then: 1) make start the first occurence of charAt(idx) in the old subsrt a new start
		 *   and end to be idx
		 * 
		 */
		
		int start = 0;
		int end = 0;
		
		String longestSubstr = input.substring(start, end+1);
			
		for (int i=1; i<input.length(); i++) {
			String tmpSbstr = input.substring(start, end+1);
			int idxOfCharInSubstr = getIdxOfChar (tmpSbstr, input.charAt(i));
			
			end = i;
			
			if (idxOfCharInSubstr >= 0) {
				// there's duplicate
				start = idxOfCharInSubstr+1;
				
			} else {
				// continue, safe to add 
				if (longestSubstr.length() < (end-start)) {
					// currect substr is longer than the old one - replace
					longestSubstr = input.substring(start, end+1);
				}
			}
		}
		
		return longestSubstr.length();
	}
	
	
	private int getIdxOfChar (String str, char c) {
		int result = -1;
		
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) == c)
				return i;
		}
		
		return result;
	}
	
	public int prettyLongestSubstring(String input) {
        Set<Character> seen = new HashSet<>();
        int maxLen = 0, start = 0;
        
        for (int end = 0; end < input.length(); end++) {
            char c = input.charAt(end);
            while (seen.contains(c)) {
                seen.remove(input.charAt(start++));
            }
            seen.add(c);
            maxLen = Math.max(maxLen, end - start + 1);
        }
        
        return maxLen;
    }
}
