package junit4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
        @Test
    void testAdd() {
        Calculatoe number = new Calculatoe();
         assertEquals(5, number.add(2, 3), "2+5は5になるはず");
        assertEquals(4, number.add(-1, 5), "-1+5は4になるはず");
        assertEquals(4, number.add(0, 4), "0+4は4になるはず");
    }

    @Test
    void testSubtract() {
        Calculatoe numbers = new Calculatoe();
        assertEquals(2, numbers.subtract(5, 3), "5-3は2になるはず");
        assertEquals(-3, numbers.subtract(-1, 2), "-1-2は-3になるはず");
        assertEquals(4, numbers.subtract(4, 0), "4-0は4になるはず");
    }
}
