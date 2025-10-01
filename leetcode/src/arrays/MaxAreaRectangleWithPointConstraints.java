package arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class MaxAreaRectangleWithPointConstraints {

    /**
     * You are given an array points where points[i] = [xi, yi]
     * represents the coordinates of a point on an infinite plane.
     * ---
     * Your task is to find the maximum area of a rectangle that:
     * ---
     * Can be formed using four of these points as its corners.
     * Does not contain any other point inside or on its border.
     * Has its edges parallel to the axes.
     * Return the maximum area that you can obtain or -1
     * if no such rectangle is possible.
     * ---
     * Example 1:
     * Input: points = [[1,1],[1,3],[3,1],[3,3]]
     * Output: 4
     * @param points - nxm array
     * @return the maximum area or -1 if not possible
     */
    public int maxRectangleArea(int[][] points) {
        int maxRectangleArea = -1;

        Set<Coordinate> pointsSet = Arrays.stream(points)
                .map(pt ->
                        new Coordinate(pt[0], pt[1]))
                .collect(Collectors.toSet());

        for (int i=0; i<points.length-1; i++) {
            for(int j=i+1; j<points.length; j++) {
                int x1 = points[i][0];
                int y1 = points[i][1];
                int x2 = points[j][0];
                int y2 = points[j][1];

                // don't do search logic for items that have one common coordinate
                if (x1 == x2 || y1 == y2) continue;

                if (!pointsSet.contains(new Coordinate(x1,y2)) ||
                    !pointsSet.contains(new Coordinate(x2,y1))) {
                    continue;
                }

                if (hasPointsInBetween(points, x1, y1, x2, y2)) continue;

                maxRectangleArea = Math.max(maxRectangleArea, calculateArea(x1, y1, x2, y2));
            }
        }

        return maxRectangleArea;
    }

    private int calculateArea (int x1, int y1, int x2, int y2) {
        return Math.abs((x2-x1)*(y2-y1));
    }

    private boolean hasPointsInBetween(int[][] points, int x1, int y1, int x2, int y2) {
        int pointsInBetween = 0;

        for (int[] point : points) {
            int px = point[0];
            int py = point[1];

            if (px >= Math.min(x1, x2) && px <= Math.max(x1, x2) &&
                py >= Math.min(y1,y2) && py <= Math.max(y1,y2)) {
                pointsInBetween++;

                if (pointsInBetween > 4) {
                    return true;
                }
            }
        }

        return false;
    }

    record Coordinate (Integer x, Integer y){}
}
