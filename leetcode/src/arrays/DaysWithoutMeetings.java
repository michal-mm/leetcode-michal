package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class DaysWithoutMeetings {

    /**
     * You are given a positive integer days representing
     * the total number of days an employee is available
     * for work (starting from day 1).
     * You are also given a 2D array meetings of size n where,
     * meetings[i] = [start_i, end_i] represents the starting
     * and ending days of meeting i (inclusive).
     * ---
     * Return the count of days when the employee is available
     * for work but no meetings are scheduled.
     * ---
     * Note: The meetings may overlap.
     * ---
     * Example 1:
     * Input: days = 10, meetings = [[5,7],[1,3],[9,10]]
     * Output: 2
     * Explanation:
     * There is no meeting scheduled on the 4th and 8th days.
     * @param days - number of days employee is available
     * @param meetings -
     * @return - number of days without meetings
     */
    public int countDays(int days, int[][] meetings) {
        int daysWithoutMeetings = 0;
        int end = 0;

        Arrays.sort(meetings, Comparator.comparingInt(item -> item[0]));

        for (int[] aMeeting : meetings) {
            if (aMeeting[0] > end) {
                daysWithoutMeetings += aMeeting[0]-end-1;
            }
            end = Math.max(end, aMeeting[1]);
        }

        if (days > end) {
            daysWithoutMeetings += days-end;
        }

        return daysWithoutMeetings;
    }


    public int countDaysBruteForce(int days, int[][] meetings) {
        int [] booked = new int[days];

        for (int [] meeting : meetings) {
            for (int i=meeting[0]; i<= meeting[1]; i++) {
                booked[i-1] = 1;
            }
        }

        return (int) Arrays.stream(booked)
                .filter(isBooked -> isBooked == 0)
                .count();
    }
}
