package strings;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

	public List<String> wordBreak(String s, List<String> wordDict) {
		List<String> result = recursiveWordBreak(s, wordDict);
		if (result == null) {
			result = List.of();
		}

		return result;
	}

	private List<String> recursiveWordBreak(String s, List<String> dict) {
		List<String> result = new ArrayList<String>();

		if (s.isEmpty()) {
			return result;
		}

		for (String word : dict) {
			if (s.startsWith(word)) {
				List<String> interimList = recursiveWordBreak(s.substring(word.length()), dict);
				if (interimList != null) {
					if (interimList.isEmpty()) {
						result.add(word);
					} else {
						for (String interimStr : interimList) {
							result.add(word + " " + interimStr);
						}
					}
				}
			}
		}
		
		if(result.isEmpty()) 
			return null;
		else
			return result;

	}

	/**
	 * By Claude (optimized my code)
	 * 
	 * @param s
	 * @param dict
	 * @return
	 */
	@SuppressWarnings("unused")
	private List<String> wordBreakHelper(String s, List<String> dict) {
		List<String> result = new ArrayList<>();

		// Base case: empty string
		if (s.isEmpty()) {
			result.add(""); // Add empty string to indicate valid path
			return result;
		}

		for (String word : dict) {
			if (s.startsWith(word)) {
				String remaining = s.substring(word.length());
				List<String> suffixes = wordBreakHelper(remaining, dict);

				for (String suffix : suffixes) {
					if (suffix.isEmpty()) {
						result.add(word);
					} else {
						result.add(word + " " + suffix);
					}
				}
			}
		}

		return result;
	}
}
