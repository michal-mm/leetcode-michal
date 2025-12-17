package arrays;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DaysWithoutMeetingsTest {

    @Test
    public void testSpec1() {
        int days = 10;
        int[][] meetings= {{5,7},{1,3},{9,10}};
        int expected = 2;

        DaysWithoutMeetings dwm = new DaysWithoutMeetings();

        assertEquals(expected, dwm.countDays(days, meetings));
    }

    @Test
    public void testSpec2() {
        int days = 5;
        int[][] meetings= {{2,4},{1,3}};
        int expected = 1;

        DaysWithoutMeetings dwm = new DaysWithoutMeetings();

        assertEquals(expected, dwm.countDays(days, meetings));
    }
}
