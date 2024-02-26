package org.example.util;

import org.example.operation.Operation;
import org.example.operation.binary.*;
import org.example.operation.unary.UnaryOperator;

public class InputParser {

    public static double parseCommandLine(String input) {
        String[] parts = input.split(" ");
        int splitInputLen = parts.length;

        try {
            if (splitInputLen == 2) {
                String operationType = parts[0];
                double operand = Double.parseDouble(parts[1]);
                Operation op = OperationRegistry.getOperation(operationType);

                if (op instanceof UnaryOperator unaryOperator) {
                    return unaryOperator.calculate(operand);
                }
            } else if (splitInputLen == 3) {
                double operand1 = Double.parseDouble(parts[0]);
                String operationType = parts[1];
                double operand2 = Double.parseDouble(parts[2]);
                Operation op = OperationRegistry.getOperation(operationType);

                if (op instanceof BinaryOperator binaryOperator) {
                    return binaryOperator.calculate(operand1, operand2);
                }
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid operand: " + input, e);
        }

        throw new IllegalArgumentException("Invalid input format or operation type: " + input);
    }
}
