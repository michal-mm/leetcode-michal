package strings;

public class StudentAttendanceRecord {

    /**
     * You are given a string s representing an attendance record
     * for a student where each character signifies whether
     * the student was absent, late, or present on that day.
     * The record only contains the following three characters:
     * ---
     * 'A': Absent.
     * 'L': Late.
     * 'P': Present.
     * The student is eligible for an attendance award
     * if they meet both of the following criteria:
     * ---
     * The student was absent ('A') for strictly fewer than 2 days total.
     * The student was never late ('L') for 3 or more consecutive days.
     * Return true if the student is eligible for an attendance award, or false otherwise.
     * @param s - string representing attendance history
     * @return true / false
     */
    public boolean checkRecord(String s) {
        char[] attendance = s.toCharArray();

        int absent = 0;
        int lateConsequtive = 0;

        for (char record : attendance) {
            if (record == 'A') {
                absent++;
                lateConsequtive = 0;
            } else if (record == 'L') {
                lateConsequtive++;
            } else {
                lateConsequtive = 0;
            }

            if (absent >= 2 || lateConsequtive >= 3) {
                return false;
            }
        }

        return true;
    }
}
