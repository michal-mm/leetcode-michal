package structures;

public class ValidateBST {

	public boolean isValidBST(TreeNode root) {
		/*
		 * [2,1,3] -> true [5,1,4,null,null,3,6] -> false
		 */

		if (root == null)
			return true;
		
		TreeNode leftNode = root.left;
		TreeNode rightNode = root.right;

		return (leftNode == null || leftNode.val < root.val) && 
				(rightNode == null || rightNode.val > root.val) && 
				isValidBST(leftNode) && isValidBST(rightNode);

	}
}
