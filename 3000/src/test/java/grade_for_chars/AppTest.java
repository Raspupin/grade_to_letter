package grade_for_chars;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
    public void testReturnAGradeAtMinimumBoundary() {
        assertEquals("D", App.returnAGrade(60), "Grade at the minimum boundary should be D");
    }

    @Test
    public void testReturnAGradeJustAboveMinimumBoundary() {
        assertEquals("D", App.returnAGrade(61), "Grade just above the minimum boundary should be D");
    }

    @Test
    public void testReturnAGradeAtNominalValue() {
        assertEquals("D", App.returnAGrade(65), "Grade at the nominal value should be D");
    }

    @Test
    public void testReturnAGradeJustBelowMaximumBoundary() {
        assertEquals("D", App.returnAGrade(68), "Grade just below the maximum boundary should be D");
    }

    @Test
    public void testReturnAGradeAtMaximumBoundary() {
        assertEquals("D", App.returnAGrade(69), "Grade at the maximum boundary should be D");
    }
}
