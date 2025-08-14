package strings;

import java.util.HashSet;
import java.util.Set;

public class UniqueLengthPalindrome {

	/**
	 * Given a string s, return the number of unique palindromes 
	 * of length three that are a subsequence of s.
	 * 
	 * Note that even if there are multiple ways to obtain the same subsequence, 
	 * it is still only counted once.
	 * 
	 * A palindrome is a string that reads the same forwards and backwards.
	 * 
	 * A subsequence of a string is a new string generated from the original string 
	 * with some characters (can be none) deleted without changing
	 *  the relative order of the remaining characters.
	 *  
	 *  For example, "ace" is a subsequence of "abcde".
	 *  
	 *  
	 * @param s
	 * @return
	 */
    public int countPalindromicSubsequence(String s) {
        /*
         * Possible palindromes are AAA or AXA (A,X, are any chars)
         * 
         * iterate through chars in s
         * if charAt was already processed then skip it 
         * (subarrays to be unique)
         */
    	Set<Character> charsChecked = new HashSet<>();
    	int result = 0;
    	
    	char[] sCharArray = s.toCharArray();
    	for (int i=0; i<sCharArray.length; i++) {
    		char c = sCharArray[i];
    		// skip if we already checked the given char
    		if (charsChecked.contains(c)) {
    			continue;
    		}
    		// mark char as checked
    		charsChecked.add(c);
    		
    		result += countPalindromesFrom(sCharArray, i);
    	}
    	
    	return result;
    }
    
    private int countPalindromesFrom(char[] charArray, int index) {
    	int result = 0;
    	Set<Character> checked = new HashSet<>();  
    	char firstChar = charArray[index];
    	
    	for (int i=index+1; i<=charArray.length-2; i++) {
    		char secondChar = charArray[i];
    		if (checked.contains(secondChar)) {
				continue;
			}
    		
    		checked.add(secondChar);
    		
    		for (int j=i+1; j<=charArray.length-1; j++) {
    			char thirdChar = charArray[j];
    			if (firstChar == thirdChar) {
    				result += 1;
    				break;
    			}
    		}
    	}
    	
    	return result;
    }
}
