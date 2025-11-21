package strings;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class MinRemoveParenthesesTest {

    @Test
    public void testSpec1() {
        String input = "lee(t(c)o)de)";
        var solutions = List.of("lee(t(c)o)de", "lee(t(co)de)", "lee(t(c)ode)");

        var mr = new MinRemoveParentheses();

        assertTrue(solutions.contains(mr.minRemoveToMakeValid(input)));
    }

    @Test
    public void testSpec2() {
        String input = "a)b(c)d";
        var solutions = List.of("ab(c)d");

        var mr = new MinRemoveParentheses();

        assertTrue(solutions.contains(mr.minRemoveToMakeValid(input)));
    }

    @Test
    public void testSpec3() {
        String input = "))((";
        var solutions = List.of("");

        var mr = new MinRemoveParentheses();

        assertTrue(solutions.contains(mr.minRemoveToMakeValid(input)));
    }
}
