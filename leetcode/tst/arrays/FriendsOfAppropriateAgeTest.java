package arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FriendsOfAppropriateAgeTest {
    
    @Test
    void testSpec1() {
        int[] ages = {16,16};
        int expected = 2;

        var fap = new FriendsOfAppropriateAge();

        assertEquals(expected, fap.numFriendRequests(ages));
    }

    @Test
    void testSpec2() {
        int[] ages = {16,17,18};
        int expected = 2;

        var fap = new FriendsOfAppropriateAge();

        assertEquals(expected, fap.numFriendRequests(ages));
    }

    @Test
    void testSpec3() {
        int[] ages = {20,30,100,110,120};
        int expected = 3;

        var fap = new FriendsOfAppropriateAge();

        assertEquals(expected, fap.numFriendRequests(ages));
    }
}
