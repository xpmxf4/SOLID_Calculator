import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.calculate("2 + 3"), "2 + 3 should be 5");
    }

    @Test
    void testSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.calculate("5 - 2"), "5 - 2 should be 3");
    }

    @Test
    void testDivision() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.calculate("6 / 3"), "6 / 3 should be 2");
    }

    @Test
    void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.calculate("3 * 5"), "3 * 5 should be 15");
    }
}
