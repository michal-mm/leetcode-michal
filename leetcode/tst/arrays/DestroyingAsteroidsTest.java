package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DestroyingAsteroidsTest {

    @Test
    void test1() {
        int mass = 10;
        var asteroids = new int[]{3,9,19,5,21};

        var da = new DestroyingAsteroids();
        assertTrue(da.asteroidsDestroyed(mass, asteroids));
    }

    @Test
    void test2() {
        int mass = 5;
        var asteroids = new int[]{4,9,23,4};

        var da = new DestroyingAsteroids();
        assertFalse(da.asteroidsDestroyed(mass, asteroids));
    }
}