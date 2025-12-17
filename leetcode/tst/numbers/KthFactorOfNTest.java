package numbers;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthFactorOfNTest {

    @Test
    public void testSpec1() {
        int n = 12;
        int k = 3;
        int expected = 3;

        KthFactorOfN kf = new KthFactorOfN();

        assertEquals(expected, kf.kthFactor(n, k));
    }

    @Test
    public void testSpec2() {
        int n = 7;
        int k = 2;
        int expected = 7;

        KthFactorOfN kf = new KthFactorOfN();

        assertEquals(expected, kf.kthFactor(n, k));
    }

    @Test
    public void testSpec3() {
        int n = 4;
        int k = 4;
        int expected = -1;

        KthFactorOfN kf = new KthFactorOfN();

        assertEquals(expected, kf.kthFactor(n, k));
    }
}
