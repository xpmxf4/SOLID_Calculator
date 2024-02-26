package org.example.util;

import org.example.dto.BinaryCalcDto;
import org.example.dto.CalcDto;
import org.example.dto.UnaryCalcDto;

public class InputParser {
    private InputParser() {
    }

    public static CalcDto parseCommandLine(String input) throws IllegalStateException {
        String[] parts = input.split(" ");

        if (parts.length == 3) {
            double op1 = Double.parseDouble(parts[0]);
            String operator = parts[1];
            double op2 = Double.parseDouble(parts[2]);

            return new BinaryCalcDto(op1, op2, operator);
        }

        if (parts.length == 2) {
            double op1 = Double.parseDouble(parts[0]);
            String operator = parts[1];

            return new UnaryCalcDto(op1, operator);
        }

        throw new IllegalArgumentException("Invalid Input");
    }
}
