package structures;

public class LongestZigZagPath {

    private final boolean previousWasRight = false;
    private final boolean previousWasLeft = true;

    public int longestZigZag(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftZZ = longestZigZagBasedOnParent(root, previousWasLeft);
        int rightZZ = longestZigZagBasedOnParent(root, previousWasRight);
        return Math.max(leftZZ, rightZZ);
    }

    private int longestZigZagBasedOnParent(TreeNode root, boolean wasLeft) {
        if (root == null) {
            return 0;
        }

        if (wasLeft) {
            // parent was "left", we check to the right
            return root.right != null ?
                    // either continue zig-zag
                    Math.max(1 + longestZigZagBasedOnParent(root.right, previousWasRight),
                            // or check against starting a new zigzag into opposite direction
                            longestZigZagBasedOnParent(root.right, previousWasLeft))
                    : 0;
        } else {
            // parent was "right", we check to the left
            return root.left != null ?
                    // either continue zig-zag
                    Math.max(1 + longestZigZagBasedOnParent(root.left, previousWasLeft),
                            // or check against starting a new zigzag into opposite direction
                            longestZigZagBasedOnParent(root.left, previousWasRight))
                    : 0;
        }
    }
}
