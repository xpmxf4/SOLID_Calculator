package org.example.operation.unary.Impl;

import org.example.operation.OperationType;
import org.example.operation.unary.UnaryOperation;

@OperationType("tan")
public class Tan implements UnaryOperation {

    @Override
    public double calculate(double operand1) {
        return Math.tan(operand1);
    }
}
