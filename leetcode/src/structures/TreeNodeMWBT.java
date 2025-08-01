package structures;

public class TreeNodeMWBT {
	int val;
	TreeNodeMWBT left;
	TreeNodeMWBT right;
	String x = "X";

	TreeNodeMWBT() {}

	TreeNodeMWBT(int val) {
		this.val = val;
	}

	TreeNodeMWBT(int val, TreeNodeMWBT left, TreeNodeMWBT right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

}
