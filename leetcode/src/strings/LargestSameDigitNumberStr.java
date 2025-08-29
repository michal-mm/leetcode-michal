package strings;

public class LargestSameDigitNumberStr {

	
	/**
	 * You are given a string num representing a large integer. 
	 * An integer is good if it meets the following conditions:
	 * 
	 * - It is a substring of num with length 3.
	 * - It consists of only one unique digit.
	 * 
	 * Return the maximum good integer as a string or an empty string "" if no such integer exists.
	 * 
	 * Note:
	 * A substring is a contiguous sequence of characters within a string.
	 * There may be leading zeroes in num or a good integer.
	 * 
	 * Example 1:
	 * Input: num = "6777133339"
	 * Output: "777"
	 * Explanation: There are two distinct good integers: "777" and "333".
	 * "777" is the largest, so we return "777".
	 * 
	 * @param num
	 * @return
	 */
	public String largestGoodInteger(String num) {
		// brute force approach checking from 999 to 000 if substring exists
		// and returning it; else returning ""
		for (int i=999; i>0; i-=111) {
			if (num.indexOf(Integer.toString(i)) >= 0) {
				return Integer.toString(i);
			}
		}
		
		if (num.indexOf("000") >= 0) {
			return "000";
		}
		
		// in case not found, return empty string
		return "";
	}
	
	private final int CHAR_TO_INT = 48;
	
	public String betterLargestGootInteger(String num) {
		int[] tracker = new int[10];
		int[] digits = new int[num.length()];
		
		for (int i=0; i<num.length(); i++) {
			digits[i] = num.charAt(i)-CHAR_TO_INT;
		}
		
		int prev = digits[0];
		tracker[prev] = 1;
		
		for (int i=1; i<digits.length; i++) {
			if (prev == (digits[i])) {
				// same char -> continue
				tracker[digits[i]] += 1;
			} else {
				if (tracker[prev] < 3) {
					// if previous sequence is 2 or less, stop it -> set back to 0
					// else we keep it to indicate that we have solution
					tracker[prev] = 0;
				}
				tracker[digits[i]] += 1;
			}
			prev = digits[i];
		}
		
		for (int i=9; i>=0; i--) {
			if (tracker[i] >= 3) {
				return Integer.toString(i).repeat(3);
			}
		}
		
		return "";
	}
}
