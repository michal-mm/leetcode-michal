package arrays;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LuckyNumbersTest {
    
    @Test
    void testSpec1() {
        int[][] input = {{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> expected = List.of(15);

        var ln = new LuckyNumbers();
        assertEquals(expected, ln.luckyNumbers(input));
    }

    @Test
    void testSpec2() {
        int[][] input = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        List<Integer> expected = List.of(12);

        var ln = new LuckyNumbers();
        assertEquals(expected, ln.luckyNumbers(input));
    }

    @Test
    void testSpec3() {
        int[][] input = {{7,8},{1,2}};
        List<Integer> expected = List.of(7);

        var ln = new LuckyNumbers();
        assertEquals(expected, ln.luckyNumbers(input));
    }
}
