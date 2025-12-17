package strings;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOriginalString  {

    @Test
    public void testSpec1 () {
        OriginalString os = new OriginalString();
        assertEquals(5, os.numOfWords("abbcccc"));
    }

    @Test
    public void testSpec2 () {
        OriginalString os = new OriginalString();
        assertEquals(1, os.numOfWords("abcd"));
    }

    @Test
    public void testSpec3 () {
        OriginalString os = new OriginalString();
        assertEquals(4, os.numOfWords("aaaa"));
    }

    @Test
     public void testSpec4 () {
        OriginalString os = new OriginalString();
        assertEquals(1, os.numOfWords("era"));
    }
}
