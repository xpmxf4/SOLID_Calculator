package org.example;

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
