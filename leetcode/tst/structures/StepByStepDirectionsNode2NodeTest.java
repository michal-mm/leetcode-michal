package structures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StepByStepDirectionsNode2NodeTest {

    @Test
    public void testSpec1() {
        TreeNode root = TreeNode.of(new Integer[]{5,1,2,3,null,6,4});
        int startValue = 3;
        int destValue = 6;

        String expected = "UURL";

        StepByStepDirectionsNode2Node sbs = new StepByStepDirectionsNode2Node();

        assertEquals(expected, sbs.getDirections(root, startValue, destValue));
    }

    @Test
    public void testSpec2() {
        TreeNode root = TreeNode.of(new Integer[]{2,1});
        int startValue = 2;
        int destValue = 1;

        String expected = "L";

        StepByStepDirectionsNode2Node sbs = new StepByStepDirectionsNode2Node();

        assertEquals(expected, sbs.getDirections(root, startValue, destValue));
    }
}
