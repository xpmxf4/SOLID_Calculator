package org.example;

import org.example.operation.Operation;
import org.example.util.InputParser;
import org.example.util.OperationFactory;

public class Calculator {
    public double calculate(String input) {
        double[] operands = InputParser.parseOperands(input);
        String operator = InputParser.parseOperator(input);

        Operation operation = OperationFactory.getOperation(operator);
        return operation.calculate(operands[0], operands[1]);
    }

}
