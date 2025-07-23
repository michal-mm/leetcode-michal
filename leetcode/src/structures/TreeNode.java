package structures;

public class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;
	
	boolean isValidBST = true;

	TreeNode() {}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	public static TreeNode of(Integer [] nodesVals) {
		TreeNode[] nodes = new TreeNode[10000];
		TreeNode root = new TreeNode(nodesVals[0]);
		nodes[1] = root;
		
		/* 
		 *  0-1-2--3----4---5-6 -> len=7 
		 *  1-2-3--4----5---6-7
		 * [5,1,4,null,null,3,6]
		 * 
		 * parent node = idx/2
		 * depth level = upper(idx/2) = idx/2 + 1 (if idx%2!=0)
		 */
		
		for (int idx=2; idx<=nodesVals.length; idx++) {
			Integer value = getTpmVal(idx, nodesVals);
			int parentNodeIdx = idx/2;
			TreeNode t = null;
			if (value != null) {
				t = new TreeNode(value);
				if ((idx%2==0 && value>=nodes[parentNodeIdx].val) || 
						idx%2!=0 && value<nodes[parentNodeIdx].val) {
					// NOT A VALID BST
					root.isValidBST = false;
				}
			}
			nodes[idx] = t;
			if (idx%2 == 0) {
				nodes[parentNodeIdx].left = t;
			} else {
				nodes[parentNodeIdx].right = t;
			}
		}
		
		return root;
	}
	
	public static void printTreeNode (TreeNode root, String prefix) {
		if (root == null) {
			System.out.println(prefix + " NULL ");
		} else {
			System.out.println(prefix + " " + root.val);
			printTreeNode(root.left, prefix+"*");
			printTreeNode(root.right, prefix+"-");
		}
	}
	
	private static Integer getTpmVal(int idx, Integer [] nodesVals) {
		return nodesVals[idx-1];
	}
}
