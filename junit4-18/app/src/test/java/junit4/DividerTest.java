package junit4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class DividerTest {
     @Test
    void testNormalDivision() {
        Divider divider = new Divider();
        assertEquals(3.0, divider.divide(6.0, 2.0), 0.0001, "6 ÷ 2 は 3 になるはず");
        assertEquals(-4.0, divider.divide(-8.0, 2.0), 0.0001, "-8÷2は-4になるはず");
        assertEquals(2.5, divider.divide(5.0, 2.0), 0.0001, "5÷2は2.5になるはず");
        assertEquals(5.0, divider.divide(-10.0, -2.0), 0.0001, "-10÷（-2）は5になるはず");
    }

    @Test
    void testExceptionDivision() {
        Divider divider = new Divider();
        try {
            divider.divide(5.0, 0.0);
            fail("ゼロ除算で例外が発生するはず");
        } catch (IllegalArgumentException e) {
            assertEquals("ゼロで除算はできません", e.getMessage());
        }
    }
}
