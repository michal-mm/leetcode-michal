package strings;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

	/** 
	 * count distinctive characters in the string
	 *  - build a map<char, numOfOccurences>
	 *  for each character 
	 *   - if numOfOcc%2==0 -> then all chars can be taken
	 *   - else -> only numOfOcc/2 can be taken and mark flag add1=true
	 * @param s
	 * @return
	 */
	public int longestPalindrome(String s) {
		int result = 0;
		boolean addOneMore = false;
		char[] chars = s.toCharArray();
		
		Map<Character, Integer> charsAndOccur = new HashMap<>();

		for (char c: chars) {
			if (charsAndOccur.containsKey(c)) {
				charsAndOccur.replace(c, charsAndOccur.get(c)+1);
			} else {
				charsAndOccur.put(c, 1);
			}
		}
		
		for(int val: charsAndOccur.values()) {
			if (val%2 == 0) {
				result += val;
			} else {
				result += val-1;
				addOneMore = true;
			}
		}
		
		if (addOneMore) {
			result += 1;
		}
		
		return result;
	}
}
