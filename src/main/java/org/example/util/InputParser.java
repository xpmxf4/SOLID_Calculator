package org.example.util;

import org.example.operation.Operation;
import org.example.operation.binary.*;
import org.example.operation.unary.UnaryOperator;

import java.util.Map;

public class InputParser {
    private InputParser() {
    }

    static Map<Integer, OperationHandler> handlers = Map.of(
            2, parts -> {
                String operationType = parts[0];
                double operand = Double.parseDouble(parts[1]);
                Operation op = OperationRegistry.getOperation(operationType);

                if (op instanceof UnaryOperator unaryOp) {
                    return unaryOp.calculate(operand);
                } else {
                    throw new IllegalArgumentException("Not UnaryOperation");
                }
            },
            3, parts -> {
                double operand1 = Double.parseDouble(parts[0]);
                String operationType = parts[1];
                double operand2 = Double.parseDouble(parts[2]);
                Operation op = OperationRegistry.getOperation(operationType);

                if (op instanceof BinaryOperator binaryOp) {
                    return binaryOp.calculate(operand1, operand2);
                } else {
                    throw new IllegalArgumentException("Not BinaryOperation");
                }
            }
    );

    public static double parseCommandLine(String input) {
        String[] parts = input.split(" ");
        OperationHandler handler = handlers.get(parts.length);

        if (handler != null)
            return handler.handle(parts);
        else
            throw new IllegalArgumentException("Invalid Input");
    }
}

@FunctionalInterface
interface OperationHandler {
    double handle(String[] parts);
}