package strings;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TruncateSentenceTest {

    @Test
    public void testSpec1() {
        String s = "Hello how are you Contestant";
        int k = 4;
        String expected = "Hello how are you";

        TruncateSentence ts = new TruncateSentence();

        assertEquals(expected, ts.truncateSentence(s, k));
        assertEquals(expected, ts.truncateSentenceWithCharArray(s, k));
    }

    @Test
    public void testSpec2() {
        String s = "What is the solution to this problem";
        int k = 4;
        String expected = "What is the solution";

        TruncateSentence ts = new TruncateSentence();

        assertEquals(expected, ts.truncateSentence(s, k));
        assertEquals(expected, ts.truncateSentenceWithCharArray(s, k));
    }

    @Test
    public void testSpec3() {
        String s = "chopper is not a tanuki";
        int k = 5;
        String expected = "chopper is not a tanuki";

        TruncateSentence ts = new TruncateSentence();

        assertEquals(expected, ts.truncateSentence(s, k));
        assertEquals(expected, ts.truncateSentenceWithCharArray(s, k));
    }
}
