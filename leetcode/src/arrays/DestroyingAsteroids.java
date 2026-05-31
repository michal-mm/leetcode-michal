package arrays;

import java.util.Arrays;

public class DestroyingAsteroids {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long lMass = mass;
        Arrays.sort(asteroids);

        for (var ast : asteroids) {
            if (lMass < ast) {
                return false;
            }
            lMass += ast;
        }

        return true;
    }
}
