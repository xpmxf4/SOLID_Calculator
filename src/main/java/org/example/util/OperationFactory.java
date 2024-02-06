package org.example.util;

import org.example.operation.Subtraction;
import org.example.operation.Addition;
import org.example.operation.Division;
import org.example.operation.Multiplication;
import org.example.operation.Operation;

public class OperationFactory {
    public static Operation getOperation(String operator) {
        return switch (operator) {
            case "+" -> new Addition();
            case "-" -> new Subtraction();
            case "/" -> new Division();
            case "*" -> new Multiplication();
            default -> throw new IllegalArgumentException("Unsupported Operation");
        };
    }
}
