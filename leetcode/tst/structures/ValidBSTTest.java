package structures;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidBSTTest {

	@Test
	public void testTreConstr() {
		Integer [] vals = {5,1,4,null, null,3,6};
		TreeNode t =TreeNode.of(vals);
		
		assertEquals(1, t.left.val);
		assertEquals(4, t.right.val);
		assertEquals(3, t.right.left.val);
		assertNull(t.left.left);
		assertNull(t.left.right);
	}

	@Test
	public void testSpec1() {
		Integer [] vals = {2,1,3};
		TreeNode t = TreeNode.of(vals);
		
		ValidateBST valBST = new ValidateBST();

        assertTrue(valBST.isValidBST(t));
        assertTrue(t.isValidBST);
	}

	@Test
	public void testSpec2() {
		Integer [] vals = {5,1,4,null, null,3,6};
		TreeNode t = TreeNode.of(vals);
		
		ValidateBST valBST = new ValidateBST();

        assertFalse(valBST.isValidBST(t));
        assertFalse(t.isValidBST);
	}
}
