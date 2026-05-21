package juni_4;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void testAdd() {
        Calculator number = new Calculator();
         assertEquals(5, number.add(2, 3), "2+5は5になるはず");
        assertEquals(4, number.add(-1, 5), "-1+5は4になるはず");
        assertEquals(4, number.add(0, 4), "0+4は4になるはず");
    }

    @Test
    void testSubtract() {
        Calculator numbers = new Calculator();
        assertEquals(2, number.add(5, 3), "5-3は2になるはず");
        assertEquals(-3, number.add(-1, -2), "-1--2は-3になるはず");
        assertEquals(4, number.add(4, 0), "4-0は4になるはず");
    }
}

