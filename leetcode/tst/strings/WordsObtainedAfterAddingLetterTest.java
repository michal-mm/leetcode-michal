package strings;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsObtainedAfterAddingLetterTest {

    @Test
    public void testSpec1() {
        String[] startWords = {"ant","act","tack"};
        String[] targetWords = {"tack","act","acti"};
        int expected = 2;

        WordsObtainedAfterAddingLetter woaal = new WordsObtainedAfterAddingLetter();

        assertEquals(expected, woaal.wordCount(startWords, targetWords));
    }

    @Test
    public void testSpec2() {
        String[] startWords = {"ab","a"};
        String[] targetWords = {"abc","abcd"};
        int expected = 1;

        WordsObtainedAfterAddingLetter woaal = new WordsObtainedAfterAddingLetter();

        assertEquals(expected, woaal.wordCount(startWords, targetWords));
    }
}
