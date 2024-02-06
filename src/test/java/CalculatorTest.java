import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.calculate("2 + 3"), "2 + 3 should be 5");
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.calculate("5 - 2"), "5 - 2 should be 3");
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.calculate("6 / 3"), "6 / 3 should be 2");
    }
}
