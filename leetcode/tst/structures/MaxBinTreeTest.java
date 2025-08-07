package structures;

import junit.framework.TestCase;

public class MaxBinTreeTest  extends TestCase {

	public  void testSpec1 () {
		TreeNodeMWBT root = new TreeNodeMWBT(1);
		TreeNodeMWBT left = new TreeNodeMWBT(5);
		TreeNodeMWBT right = new TreeNodeMWBT(3);
		TreeNodeMWBT parent = new TreeNodeMWBT(3, left, right);
		root.left = parent;
		right = new TreeNodeMWBT(9);
		parent = new TreeNodeMWBT(2, null, right);
		root.right = parent;
		
		MaxWidthBinTree mbt = new MaxWidthBinTree();
		int expected = 4;
		
		assertEquals(expected, mbt.widthOfBinaryTree(root));
	}
	
	public  void testSpec2 () {
		TreeNodeMWBT root = new TreeNodeMWBT(1);
		TreeNodeMWBT left = new TreeNodeMWBT(6);
		TreeNodeMWBT parent = new TreeNodeMWBT(5, left, null);
		root.left = new TreeNodeMWBT(3, parent, null);
		root.right = new TreeNodeMWBT(2, null, new TreeNodeMWBT(9, new TreeNodeMWBT(7), null));
		
		
		MaxWidthBinTree mbt = new MaxWidthBinTree();
		int expected = 7;
		
		assertEquals(expected, mbt.widthOfBinaryTree(root));
	}
	
	public  void testSpec3 () {
		TreeNodeMWBT root = new TreeNodeMWBT(1,
				new TreeNodeMWBT(3, new TreeNodeMWBT(5), null),
				new TreeNodeMWBT(2));
		
		
		MaxWidthBinTree mbt = new MaxWidthBinTree();
		int expected = 2;
		
		assertEquals(expected, mbt.widthOfBinaryTree(root));
	}
}
