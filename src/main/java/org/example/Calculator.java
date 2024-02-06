package org.example;

public class Calculator {
    public double calculate(String input) {
        String[] parts = input.split(" ");
        double operand1 = Double.parseDouble(parts[0]);
        String operator = parts[1];
        double operand2 = Double.parseDouble(parts[2]);

        switch (operator) {
            case "+" : return operand1 + operand2;
            case "-" : return operand1 - operand2;
            case "/" : return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Unsupported Operation");
        }
    }
}
