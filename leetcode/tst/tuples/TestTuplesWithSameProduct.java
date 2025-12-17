package tuples;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTuplesWithSameProduct  {

    @Test
    public void testSpec1 () {
        int [] nums = {2,3,4,6};
        TuplesWithSameProduct tp = new TuplesWithSameProduct();
        assertEquals(8, tp.tupleSameProduct(nums));
    }

    @Test
    public void testSpec2 () {
        int [] nums = {1,2,4,5,10};
        TuplesWithSameProduct tp = new TuplesWithSameProduct();
        assertEquals(16, tp.tupleSameProduct(nums));
    }

    @Test
    public void testSpec3 () {
        int [] nums = {1,2,4,5,10,20};
        TuplesWithSameProduct tp = new TuplesWithSameProduct();
        assertEquals(40, tp.tupleSameProduct(nums));
    }
}
