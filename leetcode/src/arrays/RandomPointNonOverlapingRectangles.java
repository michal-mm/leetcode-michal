package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.random.RandomGenerator;

public class RandomPointNonOverlapingRectangles {

    private final List<Rectangle> rectangles = new ArrayList<>();
    private final long totalSize;


    public RandomPointNonOverlapingRectangles(int[][] rects) {
        for (var rect : rects) {
            rectangles.add(new Rectangle(rect[0], rect[1], rect[2], rect[3]));
        }

        totalSize = rectangles.stream()
                .mapToLong(Rectangle::size)
                .sum();
    }

    public int[] pick() {
        var rand = RandomGenerator.getDefault();
        var rInt = rand.nextLong(0, totalSize);

        for (var rect : rectangles) {
            if (rect.fits(rInt)) {
                return rect.getPointFromNumber(rInt);
            } else {
                rInt -= rect.size();
            }
        }

        // this shouldn't happen
        return new int[]{Integer.MIN_VALUE,Integer.MIN_VALUE};
    }

    record Rectangle(int a, int b, int x, int y) {

        long size() {
            return (x-a+1L) * (y-b+1L);
        }

        boolean fits(long number) {
            return number <= size();
        }

        int[] getPointFromNumber(long number) {
            if (!fits(number)) {
                throw new IllegalArgumentException("Number is too high for one suqare! "
                        + number + ", square size=" + size());
            }

            var px = a + number % (x-a+1);
            var py = b + number / (x-a+1);

            return new int[]{(int)px, (int)py};
        }
    }
}
