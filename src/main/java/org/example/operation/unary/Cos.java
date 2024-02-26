package org.example.operation.unary;

import org.example.operation.OperationType;

@OperationType("cos")
public class Cos implements UnaryOperation {

    @Override
    public double calculate(double operand1) {
        return Math.cos(operand1);
    }
}
