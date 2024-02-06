package org.example;

public class Calculator {
    public double calculate(String input) {
        double[] operands = InputParser.parseOperands(input);
        String operator = InputParser.parseOperator(input);

        Operation operation = OperationFactory.getOperation(operator);
        return operation.calculate(operands[0], operands[1]);
    }

}
