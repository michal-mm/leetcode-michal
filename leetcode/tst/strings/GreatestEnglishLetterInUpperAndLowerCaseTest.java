package strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GreatestEnglishLetterInUpperAndLowerCaseTest {
    

    @Test
    void testSpec1() {
        var inputStr = "lEeTcOdE";
        var expected = "E";

        var gel = new GreatestEnglishLetterInUpperAndLowerCase();

        assertEquals(expected, gel.greatestLetter(inputStr));
    }

    @Test
    void testSpec2() {
        var inputStr = "arRAzFif";
        var expected = "R";

        var gel = new GreatestEnglishLetterInUpperAndLowerCase();

        assertEquals(expected, gel.greatestLetter(inputStr));
    }

    @Test
    void testSpec3() {
        var inputStr = "AbCdEfGhIjK";
        var expected = "";

        var gel = new GreatestEnglishLetterInUpperAndLowerCase();

        assertEquals(expected, gel.greatestLetter(inputStr));
    }
}
