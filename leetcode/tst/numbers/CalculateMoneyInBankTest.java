package numbers;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateMoneyInBankTest {

    @Test
    public void testSpec1() {
        int n = 4;
        int expected = 10;

        CalculateMoneyInBank cmib = new CalculateMoneyInBank();

        assertEquals(expected, cmib.totalMoney(n));
    }

    @Test
    public void testSpec2() {
        int n = 10;
        int expected = 37;

        CalculateMoneyInBank cmib = new CalculateMoneyInBank();

        assertEquals(expected, cmib.totalMoney(n));
    }

    @Test
    public void testSpec3() {
        int n = 20;
        int expected = 96;

        CalculateMoneyInBank cmib = new CalculateMoneyInBank();

        assertEquals(expected, cmib.totalMoney(n));
    }
}
