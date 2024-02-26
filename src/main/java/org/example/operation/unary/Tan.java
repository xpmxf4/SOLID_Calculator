package org.example.operation.unary;

import org.example.operation.OperationType;

@OperationType("tan")
public class Tan implements UnaryOperation {

    @Override
    public double calculate(double operand1) {
        return Math.tan(operand1);
    }
}
