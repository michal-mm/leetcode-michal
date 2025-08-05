package strings;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class WordBreakTest {

	@Test
	public void testSpec1() {
		String inputWord = "catsanddog";
		List<String> dict = List.of("cat","cats","and","sand","dog");
		
		List<String> expected = List.of("cats and dog","cat sand dog");
		
		WordBreak wb = new WordBreak();
		List<String> wbResult = wb.wordBreak(inputWord, dict);
		
		assertEquals(expected.size(), wbResult.size());
		for(String sentence: expected) {
			assertEquals(true, wbResult.contains(sentence));
		}
	}
	
	@Test
	public void testSpec2() {
		String inputWord = "pineapplepenapple";
		List<String> dict = List.of("apple","pen","applepen","pine","pineapple");
		
		List<String> expected = List.of("pine apple pen apple",
				"pineapple pen apple","pine applepen apple");
		
		WordBreak wb = new WordBreak();
		List<String> wbResult = wb.wordBreak(inputWord, dict);
		
		assertEquals(expected.size(), wbResult.size());
		for(String sentence: expected) {
			assertEquals(true, wbResult.contains(sentence));
		}
	}
	
	@Test
	public void testSpec3() {
		String inputWord = "catsandog";
		List<String> dict = List.of("cats","dog","sand","and","cat");
		
		List<String> expected = List.of();
		
		WordBreak wb = new WordBreak();
		List<String> wbResult = wb.wordBreak(inputWord, dict);
		
		assertEquals(expected.size(), wbResult.size());
		for(String sentence: expected) {
			assertEquals(true, wbResult.contains(sentence));
		}
	}
}
