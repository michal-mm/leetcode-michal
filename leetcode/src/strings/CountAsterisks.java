package strings;

public class CountAsterisks {
	
	/* 
	 * '|' generate pairs (like open-close)
	 * return num of '*' but exclude those between the || pairs
	 * we treat  ||as comment sections.
	 * 
	 * iterate string, if | set flag to open/close comment section
	 * iterate the string, if found '*' increase counter if not in comment section
	 */

	public int countAsterisks(String str) {
		boolean pipePairOpen = false;
		int result  = 0;
		char [] chars = str.toCharArray();
		
		for (int i=0; i<chars.length; i++) {
			switch (chars[i]) { 
				case '*':
					if (pipePairOpen == false) result+= 1;
					break;
				case '|':
					if (pipePairOpen) pipePairOpen = false;
					else pipePairOpen = true;
					break;
				default:
					break;
					
			}
		}
		
		return result;
	}
}
