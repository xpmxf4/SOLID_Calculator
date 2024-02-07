package org.example.util;

import org.example.dto.CalculateDto;

public abstract class InputParser {

    private InputParser() {}

    public static CalculateDto parseCommandLine(String input) {
        String[] parts = input.split(" ");

        double operand1 = Double.parseDouble(parts[0]);
        String operator = parts[1];
        double operand2 = Double.parseDouble(parts[2]);

        return new CalculateDto(operand1, operator, operand2);
    }
}
