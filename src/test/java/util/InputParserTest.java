package util;

import org.example.dto.CalculateDto;
import org.example.util.InputParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputParserTest {

    @Test
    @DisplayName("parsing 이 제대로 됐다면 계산도 제대로 된다.")
    void testParseOperandsForBinaryOperation() {
        String input = "3 + 5";
        CalculateDto calculateDto = InputParser.parseCommandLine(input);
        double expectedRes = 8.0;

        assertEquals(expectedRes, calculateDto.calculate(), "Should correctly parse operands for binary operation");
    }

}
