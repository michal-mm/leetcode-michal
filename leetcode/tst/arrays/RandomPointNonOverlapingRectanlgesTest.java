package arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class RandomPointNonOverlapingRectanlgesTest {

    private List<Integer[]> getAllPoints(int[] square) {
        List<Integer[]> allPoints = new ArrayList<>();

        int a = square[0];
        int b = square[1];
        int x = square[2];
        int y = square[3];

        for (int i=a; i<=x; i++) {
            for(int j=b; j<=y; j++) {
                allPoints.add(new Integer[]{i,j});
            }
        }

        return allPoints;
    }

    @Test
    public void testSpec1() {
        var input = new int[][]{{-2,-2,1,1}, {2,2,4,6}};
        var listOfAllPoints = Arrays.stream(input)
                .flatMap(tab -> getAllPoints(tab).stream())
                .toList();

        RandomPointNonOverlapingRectangles rp = new RandomPointNonOverlapingRectangles(input);
        var output = IntStream.range(0, 5)
                .mapToObj(_ -> rp.pick())
                .toList();

        assertEquals(true, listOfAllPoints.contains(output.getFirst()));
    }
}
