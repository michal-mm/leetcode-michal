package strings;

import java.util.Set;
import java.util.stream.IntStream;

public class ReplaceAllQ {

	/**
	 * Given a string s containing only lowercase English letters and the '?' character, 
	 * convert all the '?' characters into lowercase letters such that the final string 
	 * does not contain any consecutive repeating characters. 
	 * You cannot modify the non '?' characters.
	 * 
	 * It is guaranteed that there are no consecutive repeating characters 
	 * in the given string except for '?'.
	 * 
	 * Return the final string after all the conversions (possibly zero) have been made. 
	 * If there is more than one solution, return any of them. 
	 * It can be shown that an answer is always possible with the given constraints.
	 * 
	 * @param s
	 * @return
	 */
	public String modifyString(String s) {
		
		char [] result = s.toCharArray();
		
		IntStream.range(0, result.length)
			.filter(i -> result[i] == '?')
			.forEach(i -> result[i] = findValidChar(result, i));
		
		return String.valueOf(result);
	}
	
	private char findValidChar(char [] chars, int position) {
		Set<Character> forbidden = Set.of(
				getCharAt(chars, position-1),
				getCharAt(chars, position+1)
				);
		
		return IntStream.rangeClosed('a', 'z')
			.mapToObj(c -> (char) c)
			.filter(c -> !forbidden.contains(c))
			.findFirst()
			.orElse('a');
	}
	
	private Character getCharAt(char[] chars, int position) {
		return (0 <= position && position < chars.length) ? chars[position] : ' ';
	}
}
