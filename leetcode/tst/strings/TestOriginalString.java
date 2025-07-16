package strings;

import junit.framework.TestCase;

public class TestOriginalString  extends TestCase{
    public void testSpec1 () {
        OriginalString os = new OriginalString();
        assertEquals(5, os.numOfWords("abbcccc"));
    }

    public void testSpec2 () {
        OriginalString os = new OriginalString();
        assertEquals(1, os.numOfWords("abcd"));
    }

    public void testSpec3 () {
        OriginalString os = new OriginalString();
        assertEquals(4, os.numOfWords("aaaa"));
    }

     public void testSpec4 () {
        OriginalString os = new OriginalString();
        assertEquals(1, os.numOfWords("era"));
    }
}
