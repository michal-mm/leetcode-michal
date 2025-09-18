package strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentAttendanceRecordTest {

    @Test
    public void testSpec1() {
        String s = "PPALLP";
        boolean expected = true;

        StudentAttendanceRecord sar = new StudentAttendanceRecord();

        assertEquals(expected, sar.checkRecord(s));
    }

    @Test
    public void testSpec2() {
        String s = "PPALLL";
        boolean expected = false;

        StudentAttendanceRecord sar = new StudentAttendanceRecord();

        assertEquals(expected, sar.checkRecord(s));
    }
}
