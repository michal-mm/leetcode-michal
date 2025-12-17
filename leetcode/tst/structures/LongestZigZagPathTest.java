package structures;


import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestZigZagPathTest {

    private TreeNode buildTree (Integer[] vals) {

        if(vals == null || vals.length == 0 || vals[0] == null) {
            return null;
        }

        TreeNode root = new TreeNode(vals[0]);
        TreeNode left, right;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        for (int i=1; i<vals.length; i++) {
            TreeNode node = queue.poll();
            if(node == null) {
                continue;
            }
            if(vals[i] != null) {
                left = new TreeNode(vals[i]);
                node.left = left;
                queue.add(left);
            }

            i++;
            if (i == vals.length) {
                break;
            }

            if(vals[i] != null) {
                right = new TreeNode(vals[i]);
                node.right = right;
                queue.add(right);
            }
        }

        return root;
    }

    @Test
    public void testSpec1() {
        /*
         * Input: root = [1,null,1,1,1,null,null,1,1,null,1,null,null,null,1]
         * Output: 3
         */
        Integer[] vals = {1,null,1,1,1,null,null,1,1,null,1,null,null,null,1};
        TreeNode root = buildTree(vals);

        int output = 3;

        LongestZigZagPath lzzp = new LongestZigZagPath();

        assertEquals(output, lzzp.longestZigZag(root));
    }

    @Test
    public void testSpec2() {
        Integer[] vals = {1,1,1,null,1,null,null,1,1,null,11};
        TreeNode root = buildTree(vals);

        int output = 4;

        LongestZigZagPath lzzp = new LongestZigZagPath();

        assertEquals(output, lzzp.longestZigZag(root));
    }

    @Test
    public void testSpec3() {
        Integer[] vals = {1};
        TreeNode root = buildTree(vals);

        int output = 0;

        LongestZigZagPath lzzp = new LongestZigZagPath();

        assertEquals(output, lzzp.longestZigZag(root));
    }
}
