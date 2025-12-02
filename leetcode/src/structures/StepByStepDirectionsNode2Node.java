package structures;

public class StepByStepDirectionsNode2Node {

    public String getDirections(TreeNode root, int startValue, int destValue) {
        var pathToStart = new StringBuilder();
        pathTo(root, startValue, pathToStart);
        var startStr = pathToStart.reverse().toString();
        var pathToEnd = new StringBuilder();
        pathTo(root, destValue, pathToEnd);
        var endStr = pathToEnd.reverse().toString();

        // if paths have common prefix remove it to make either start or end the root
        int idx = 0;
        while (idx < startStr.length() && idx < endStr.length()) {
            if (startStr.charAt(idx) != endStr.charAt(idx)) {
                break;
            }
            idx++;
        }

        startStr = startStr.substring(idx);
        endStr = endStr.substring(idx);

        return "U".repeat(startStr.length()) + endStr;
    }

    private boolean pathTo(TreeNode root, int val, StringBuilder path) {
        if (root == null) {
            return false;
        }

        if (root.val == val) {
            return true;
        }


        if (pathTo(root.left, val, path)) {
            path.append("L");
        } else if (pathTo(root.right, val, path)) {
            path.append("R");
        }

        return !path.isEmpty();
    }
}
