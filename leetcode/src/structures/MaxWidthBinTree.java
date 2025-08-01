package structures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class MaxWidthBinTree {

	private static TreeNodeMWBT EMPTY;
	private Queue<TreeNodeMWBT> currentLayer;
	static {
		EMPTY = new TreeNodeMWBT(Integer.MIN_VALUE);
		EMPTY.left = EMPTY;
		EMPTY.right = EMPTY;
		EMPTY.x = " ";
	}
	
	public int widthOfBinaryTree(TreeNodeMWBT root) {
		Queue<TreeNodeMWBT> longestLayer = new LinkedList<TreeNodeMWBT>();
		currentLayer = new LinkedList<TreeNodeMWBT>();
		
		currentLayer.add(root);
		int longestWidth = getWidth(longestLayer);
		int currentWidth = getWidth(currentLayer);
		
		
		while (currentWidth > 0) {
			
			if (currentWidth > longestWidth) {
//			longestLayer = new LinkedList<TreeNode>();
//			longestLayer.addAll(currentLayer);
				longestLayer = currentLayer;
				longestWidth = currentWidth;
			}

			Queue<TreeNodeMWBT> nextLayer = new LinkedList<TreeNodeMWBT>();
			for (TreeNodeMWBT node : currentLayer) {
				if (node == EMPTY) {
					nextLayer.add(EMPTY); // add left child
					nextLayer.add(EMPTY); // add right child
				} else {
					// add left node
					if (node.left == null) {
						nextLayer.add(EMPTY);
					} else {
						nextLayer.add(node.left);
					}
					if (node.right == null) {
						nextLayer.add(EMPTY);
					} else {
						nextLayer.add(node.right);
					}
				}
			}

			// replace currentLayer with nextLayer

			currentLayer = nextLayer;
			currentWidth = getWidth(currentLayer);
		}
		
		return longestWidth;
    }
	
	private int getWidth (Queue<TreeNodeMWBT> layer) {
		return layer.stream()
				.map(node -> node.x)
				.collect(Collectors.joining())
				.trim()
				.length();
	}
}
