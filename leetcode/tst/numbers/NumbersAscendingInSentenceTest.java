package numbers;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class NumbersAscendingInSentenceTest {

    @Test
    void testSpec1() {
        var input= "1 box has 3 blue 4 red 6 green and 12 yellow marbles";

        var nas = new NumbersAscendingInSentence();

        assertTrue(nas.areNumbersAscending(input));
    }

    @Test
    void testSpec2() {
        var input= "hello world 5 x 5";

        var nas = new NumbersAscendingInSentence();

        assertFalse(nas.areNumbersAscending(input));
    }

    @Test
    void testSpec3() {
        var input= "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";

        var nas = new NumbersAscendingInSentence();

        assertFalse(nas.areNumbersAscending(input));
    }
}
