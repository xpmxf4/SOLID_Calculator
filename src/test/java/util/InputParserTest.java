package util;

import org.example.util.InputParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputParserTest {

    @Test
    void testParseOperandsForBinaryOperation() {
        String input = "3 + 5";
        double[] expectedOperands = {3.0, 5.0};
        assertArrayEquals(expectedOperands, InputParser.parseOperands(input), "Should correctly parse operands for binary operation");
    }

    @Test
    void testParseOperatorForBinaryOperation() {
        String input = "3 + 5";
        assertEquals("+", InputParser.parseOperator(input), "Should correctly parse operator for binary operation");
    }
}
