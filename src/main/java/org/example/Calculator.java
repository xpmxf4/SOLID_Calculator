package org.example;

public class Calculator {
    public double calculate(String input) {
        String[] parts = input.split(" ");
        double operand1 = Double.parseDouble(parts[0]);
        String operator = parts[1];
        double operand2 = Double.parseDouble(parts[2]);

        Operation operation = OperationFactory.getOperation(operator);
        return operation.calculate(operand1, operand2);
    }
}
