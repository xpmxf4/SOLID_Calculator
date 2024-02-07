package util;

import org.example.dto.CalculateDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorRefactorTest {

    @Test
    void exceptionTest() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new CalculateDto(2, "!", 4));

        assertEquals(exception.getMessage(), "정의 되지 않은 연산입니다.");
    }

    @Test
    void testAddition() {
        CalculateDto calculateDto = new CalculateDto(2, "+", 3);
        assertEquals(5, calculateDto.calculate(), "2 + 3 should be 5");
    }

    @Test
    void testSubtraction() {
        CalculateDto calculateDto = new CalculateDto(5, "-", 2);
        assertEquals(3, calculateDto.calculate(), "5 - 2 should be 3");
    }

    @Test
    void testDivision() {
        CalculateDto calculateDto = new CalculateDto(6, "/", 3);
        assertEquals(2, calculateDto.calculate(), "6 / 3 should be 2");
    }

    @Test
    void testMultiplication() {
        CalculateDto calculateDto = new CalculateDto(3, "*", 5);
        assertEquals(15, calculateDto.calculate(), "3 * 5 should be 15");
    }
}
