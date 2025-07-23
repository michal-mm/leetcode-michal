package structures;

import junit.framework.TestCase;

public class ValidBSTTest extends TestCase {
	
	public void testTreConstr() {
		Integer [] vals = {5,1,4,null, null,3,6};
		TreeNode t =TreeNode.of(vals);
		
		assertEquals(1, t.left.val);
		assertEquals(4, t.right.val);
		assertEquals(3, t.right.left.val);
		assertNull(t.left.left);
		assertNull(t.left.right);
	}

	public void testSpec1() {
		Integer [] vals = {2,1,3};
		TreeNode t = TreeNode.of(vals);
		
		ValidateBST valBST = new ValidateBST();
		
		assertEquals(true, valBST.isValidBST(t));
		assertEquals(true, t.isValidBST);
	}
	
	public void testSpec2() {
		Integer [] vals = {5,1,4,null, null,3,6};
		TreeNode t = TreeNode.of(vals);
		
		ValidateBST valBST = new ValidateBST();
		
		assertEquals(false, valBST.isValidBST(t));
		assertEquals(false, t.isValidBST);
	}
}
