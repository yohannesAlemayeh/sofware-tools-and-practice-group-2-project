package tools;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradeCalculatorTest {

    @Test
    public void testGetGrade() {
        assertEquals("A", GradeCalculator.getGrade(88));
        assertEquals("B-", GradeCalculator.getGrade(69.5));
        assertEquals("C", GradeCalculator.getGrade(57));
        assertEquals("F", GradeCalculator.getGrade(0));
        assertEquals("Invalid mark!!", GradeCalculator.getGrade(-1));
    }
}
