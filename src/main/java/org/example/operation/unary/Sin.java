package org.example.operation.unary;

import org.example.operation.OperationType;

@OperationType("sin")
public class Sin implements UnaryOperator {

    @Override
    public double calculate(double operand1) {
        return Math.sin(operand1);
    }
}
