package structures;

public class StepByStepDirectionsNode2Node {

    public String getDirections(TreeNode root, int startValue, int destValue) {
        var pathToStart = pathTo(root, startValue, "");
        var pathToEnd = pathTo(root, destValue, "");

        // if paths have common prefix remove it to make either start or end the root
        int idx = 0;
        while (idx < pathToStart.length() && idx < pathToEnd.length()) {
            if (pathToStart.charAt(idx) != pathToEnd.charAt(idx)) {
                break;
            }
            idx++;
        }

        pathToStart = pathToStart.substring(idx);
        pathToEnd = pathToEnd.substring(idx);

        return "U".repeat(pathToStart.length()) + pathToEnd;
    }

    private String pathTo(TreeNode root, int val, String path) {
        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return path;
        }


        var left = pathTo(root.left, val, path+"L");
        if (left == null) {
            return pathTo(root.right, val, path+"R");
        } else {
            return left;
        }
    }
}
